package com.WalletLogin.utils;

import com.WalletLogin.entity.CredentialWallet;
import com.WalletLogin.model.CredentialRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Utils {
	
	public CredentialWallet convertToCredentialWallet(CredentialRequest credentialRequest) {
		CredentialWallet credentialWallet = new CredentialWallet(); 
		log.info(":::: The object CredentialRequest is changing to CredentialWallet ::::");
		credentialWallet.setName(credentialRequest.getName());
		credentialWallet.setLastname(credentialRequest.getLastname());
		credentialWallet.setBirthday(credentialRequest.getBirthday());
		credentialWallet.setGender(credentialRequest.getGender());
		credentialWallet.setEmail(credentialRequest.getEmail());
		credentialWallet.setUsername(credentialRequest.getUsername());
		credentialWallet.setPassword(credentialRequest.getPassword());
		log.info(":::: The object CredentialRequest has changed to CredentialWallet ::::");
		return credentialWallet;
	}
}
