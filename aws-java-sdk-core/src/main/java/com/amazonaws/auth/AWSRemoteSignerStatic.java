package com.amazonaws.auth;

import static com.amazonaws.util.StringUtils.UTF8;

import java.nio.charset.Charset;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.amazonaws.AmazonClientException;

/**
 * AWSRemoteSignerStatic is a code is provide as sample to help you to implement your remote signature Server.
 * It can be use directly but do not provide any additional security.
 */
public class AWSRemoteSignerStatic implements AWSRemoteSigner {
	/**
	 * the secret is store in the object to make this sample works.
	 */
	private String secret;
	/**
	 * provide the secret key to sign incoming request
	 * @param secret
	 */
	public AWSRemoteSignerStatic(String secret) {
		this.secret = secret;
	}

	@Override
	/**
	 * This interface allow a remote signature usage.
	 * 
	 * In this case the secret signing usage is delegate to a remote AWS vault server 
	 * 
	 * @param stringToSign
	 *            like
	 *            "AWS4-HMAC-SHA256\n20160919T184625Z\n20160919/us-east-1/es/aws4_request\n1dcf0ceb95b5088bbbbceb78990801b1d4c7478f6414fa2604002ef75b5708d1"
	 * @param data values to hash to get the signature (don't forget the last aws4_request)
	 *            like ["20160919", "us-east-1", "ec2", "aws4_request"]
	 * @return data a byte[32] signature block
	 */
	public byte[] makeSigne(String singingString, String... data) {
		if (data.length < 3) {
			throw new RuntimeException("invalid usage");
		}
		if (!"aws4_request".equals(data[data.length])) {
			throw new RuntimeException("data should end with aws4_request");
		}
		if (!singingString.startsWith("AWS4-HMAC-SHA256")) {
			throw new RuntimeException("singingString should start with AWS4-HMAC-SHA256");
		}
		byte[] kSecret = ("AWS4" + secret).getBytes(Charset.forName("UTF-8"));
		for (String s : data) {
			kSecret = sign(s, kSecret, SigningAlgorithm.HmacSHA256);
		}
		return kSecret;
	}
	/**
	 * code duplicated from AbstractAWSSigner
	 */
	public byte[] sign(String stringData, byte[] key, SigningAlgorithm algorithm) throws AmazonClientException {
		try {
			byte[] data = stringData.getBytes(UTF8);
			return sign(data, key, algorithm);
		} catch (Exception e) {
			throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
		}
	}

	/**
	 * code duplicated from AbstractAWSSigner
	 */
	protected byte[] sign(byte[] data, byte[] key, SigningAlgorithm algorithm) throws AmazonClientException {
		try {
			Mac mac = algorithm.getMac();
			mac.init(new SecretKeySpec(key, algorithm.toString()));
			return mac.doFinal(data);
		} catch (Exception e) {
			throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
		}
	}
}
