package com.WalletLogin.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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
	@NonNull
	private String Name;
	
	/**
	 * User's Lastname.
	 * */
	@NonNull
	private String Lastname;
	
	/**
	 * User's Birthday.
	 * */
	@NonNull
	private Date Birthday;
	
	/**
	 * User's Gender.
	 * */
	@NonNull
	private String Gender;
	
	/**
	 * User's Email.
	 * */
	@NonNull
	private String Email;
	
	/**
	 * User's Username.
	 * */
	@NonNull
	private String Username;
	
	/**
	 * User's Password.
	 * */
	@NonNull
	private String Password;

}
