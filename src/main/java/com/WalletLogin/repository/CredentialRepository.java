/**
 * 
 */
package com.WalletLogin.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.WalletLogin.entity.CredentialWallet;
import com.WalletLogin.model.CredentialRequest;

import jakarta.transaction.Transactional;

/**
 * Those are the methods to find the customer's credential by an specific field. 
 * 
 * @author Eduardo Alvarado.
 *
 */
public interface CredentialRepository extends JpaRepository<CredentialWallet, Long> {
	
	/**
	 * This method find customers by name. 
	 * 	
	 * @param String customer's name
	 * @return <List> a list of customers.
	 * */
	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "select * from Wallet where NAME = :",nativeQuery = true)
	List<CredentialWallet> findByName(@Param("name")String name);
	
	/**
	 * This method find customers by lastName. 
	 * 	
	 * @param String customer's lastName
	 * @return <List> a list of customers.
	 * */
	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "select * from Wallet where LAST_NAME = :",nativeQuery = true)
	List<CredentialWallet> findByLastName(@Param("lastName")String lastName);
	
	/**
	 * This method find a customer by username. 
	 * 	
	 * @param String customer's username
	 * @return CredentialWallet an object of a customer.
	 * */
	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "select * from Wallet where USERNAME = :",nativeQuery = true)
	List<CredentialWallet> findByUsername(@Param("username") String username);
	
	/**
	 * This method find a customer by email. 
	 * 	
	 * @param String customer's name
	 * @return CredentialWallet an object of a customer.
	 * */
	@Transactional
	@Modifying(flushAutomatically = true, clearAutomatically = true)
	@Query(value = "select * from Wallet where EMAIL = :",nativeQuery = true)
	List<CredentialWallet> findByEmail(@Param("email") String email);
	
	/**
	 * This method returns a boolean valor if there are customers with
	 * the same name. 
	 * 	
	 * @param String customer's name
	 * @return boolean if exist the name.
	 * */
	//boolean existsByName(String name);
	
	/**
	 * This method returns a boolean valor if there are customers with
	 * the same lastName. 
	 * 	
	 * @param String customer's lastName
	 * @return boolean if exist the lastname.
	 * */
	//boolean existsByLastName(String lastName);
	
	/**
	 * This method returns a boolean valor if there is a customer with
	 * that username. 
	 * 	
	 * @param String customer's username
	 * @return boolean if exist the username.
	 * */
	//boolean existsByUsername(String username);
	
	/**
	 * This method returns a boolean valor if there is a customer with
	 * that e-mail. 
	 * 	
	 * @param String customer's email
	 * @return boolean if exist the email.
	 * */
	//boolean existsByEmail(String email);
	

}
