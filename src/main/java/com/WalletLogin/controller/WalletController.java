package com.WalletLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import com.WalletLogin.model.CredentialRequest;
import com.WalletLogin.repository.CredentialRepository;
import com.WalletLogin.utils.Utils;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@Slf4j
public class WalletController {
	
	@Autowired
	CredentialRepository credentialRepository;
	
	@PostMapping("/save")
	public ResponseEntity<Void> save(@RequestBody CredentialRequest credentialRequest){
		log.info(":::: The process has been started ::::");
		Utils utils = new Utils();
		credentialRepository.save(utils.convertToCredentialWallet(credentialRequest));
		log.info(":::: The process has been finished ::::");
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	

}
