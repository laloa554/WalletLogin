package com.WalletLogin.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Eduardo Alvarado.
 * */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CredentialRequest {
	/**
	 * User's name
	 * */
	private String Name;
	
	/**
	 * User's Lastname.
	 * */
	private String Lastname;
	
	/**
	 * User's Birthday.
	 * */
	private Date Birthday;
	
	/**
	 * User's Gender.
	 * */
	private String Gender;
	
	/**
	 * User's Email.
	 * */
	private String Email;
	
	/**
	 * User's Username.
	 * */
	private String Username;
	
	/**
	 * User's Password.
	 * */
	private String Password;

}
