package com.WalletLogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WalletLogin.entity.CredentialWallet;
import com.WalletLogin.model.CredentialRequest;
import com.WalletLogin.repository.CredentialRepository;
import com.WalletLogin.utils.Utils;

/**
 * This class is the CredentialRepository's implementation. 
 * 
 * @author Eduardo Alvarado.
 * 
 * */

@Service
@Transactional
public class CredentialService {
	
	@Autowired
	CredentialRepository CredentialRepository; 
	
	/**
	 * This method find customers by name. 
	 * 	
	 * @param String customer's name
	 * @return <List> a list of customers.
	 * */
	List<CredentialWallet> findByName(String name){
		return CredentialRepository.findByName(name);
	}
	
	/**
	 * This method find customers by lastName. 
	 * 	
	 * @param String customer's lastName
	 * @return <List> a list of customers.
	 * */
	List<CredentialWallet> findByLastName(String lastName){
		return CredentialRepository.findByLastName(lastName);
	}
	
	/**
	 * This method find a customer by username. 
	 * 	
	 * @param String customer's username
	 * @return CredentialWallet an object of a customer.
	 * */
	List<CredentialWallet> findByUsername(String username){
		return CredentialRepository.findByUsername(username);
	}
	
	/**
	 * This method find a customer by email. 
	 * 	
	 * @param String customer's name
	 * @return CredentialWallet an object of a customer.
	 * */
	List<CredentialWallet> findByEmail(String email){
		return CredentialRepository.findByEmail(email);
	}
	
	/**
	 * This method returns a boolean valor if there are customers with
	 * the same name. 
	 * 	
	 * @param String customer's name
	 * @return boolean if exist the name.
	 * */
	/*boolean existsByName(String name){
		return CredentialRepository.existsByName(name);
	}*/
	
	/**
	 * This method returns a boolean valor if there are customers with
	 * the same lastName. 
	 * 	
	 * @param String customer's lastName
	 * @return boolean if exist the lastname.
	 * */
	/*boolean existsByLastName(String lastName){
		return CredentialRepository.existsByLastName(lastName);
	}*/
	
	/**
	 * This method returns a boolean valor if there is a customer with
	 * that username. 
	 * 	
	 * @param String customer's username
	 * @return boolean if exist the username.
	 * */
	/*boolean existsByUsername(String username){
		return CredentialRepository.existsByUsername(username);
	}*/
	
	/**
	 * This method returns a boolean valor if there is a customer with
	 * that e-mail. 
	 * 	
	 * @param String customer's email
	 * @return boolean if exist the email.
	 * */
	/*boolean existsByEmail(String email){
		return CredentialRepository.existsByEmail(email);
	}*/
	
	/**
	 * This method saves a Credential entity. 
	 * 	
	 * @param Object CredentialRequest.
	 * */
	/*void saveCredential(CredentialRequest credentialRequest) {
		Utils utils = new Utils();
		CredentialRepository.save(utils.convertToCredentialWallet(credentialRequest));
	}*/

}
