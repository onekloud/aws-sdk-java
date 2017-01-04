package com.amazonaws.auth;

/**
 * Replace the BasicAWSCredentials
 * 
 * but implement AWSRemoteSigner that will be used remotely signe request
 */
public class ContainerRemoteCredentials implements AWSCredentials, AWSRemoteSigner {
	String AWSAccessKeyId;
	AWSRemoteSigner remote;

	/**
	 * build the AWSCredentialsRemote with a real AWSAccessKeyId and a delegate
	 * AWS signer caller
	 */
	public ContainerRemoteCredentials(String AWSAccessKeyId, AWSRemoteSigner remote) {
		this.AWSAccessKeyId = AWSAccessKeyId;
		this.remote = remote;
	}

	/**
	 * delegate signature to a delegate Signer
	 */
	@Override
	public byte[] makeSigneV4(String singingString, String... data) {
		return remote.makeSigneV4(singingString, data);
	}

	@Override
	public byte[] makeSigneV2(String method, String domain, String path, String[] payload) {
		return remote.makeSigneV2(method, domain, path, payload);
	}

	/**
	 * the real AWSAccessKeyId
	 */
	@Override
	public String getAWSAccessKeyId() {
		return AWSAccessKeyId;
	}

	/**
	 * a fake AWSSecretKey
	 */
	@Override
	public String getAWSSecretKey() {
		return null;
	}

}