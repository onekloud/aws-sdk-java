package com.amazonaws.auth;

/**
 * See AWSSignerStatic
 * 
 * @author Uriel Chemouni
 * 
 * @see AWSRemoteSignerStatic
 * @see ContainerRemoteCredentials
 */
public interface AWSRemoteSigner {
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
	byte[] makeSigne(String stringToSign, String... data);
}
