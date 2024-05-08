package com.WalletLogin.utils;

import com.WalletLogin.entity.CredentialWallet;
import com.WalletLogin.model.CredentialRequest;

public class Utils {
	
	public CredentialWallet convertToCredentialWallet(CredentialRequest credentialRequest) {
		CredentialWallet credentialWallet = new CredentialWallet(); 
		
		credentialWallet.setName(credentialRequest.getName());
		credentialWallet.setLastname(credentialRequest.getLastname());
		credentialWallet.setBirthday(credentialRequest.getBirthday());
		credentialWallet.setGender(credentialRequest.getGender());
		credentialWallet.setEmail(credentialRequest.getEmail());
		credentialWallet.setUsername(credentialRequest.getUsername());
		credentialWallet.setPassword(credentialRequest.getPassword());
		
		return credentialWallet;
	}
}
