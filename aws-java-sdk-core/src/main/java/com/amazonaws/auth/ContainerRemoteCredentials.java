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
	public byte[] makeSigne(String singingString, String... data) {
		return remote.makeSigne(singingString, data);
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