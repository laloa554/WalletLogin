package com.WalletLogin.model;

import java.sql.Date;

/**
 * @author Eduardo Alvarado.
 * */

public class Credential {
	/**
	 * User's name
	 * */
	private String Name;
	
	/**
	 * User's Lastname
	 * */
	private String Lastname;
	
	/**
	 * User's Birthday
	 * */
	private Date Birthday;
	
	/**
	 * User's Gender
	 * */
	private String Gender;
	
	/**
	 * User's Email
	 * */
	private String Email;
	
	/**
	 * User's Username
	 * */
	private String Username;
	
	/**
	 * User's Password
	 * */
	private String Password;

	/**
	 * Contructor.
	 * 
	 * @param name.
	 * @param lastname.
	 * @param birthday.
	 * @param gender.
	 * @param email.
	 * @param username.
	 * @param password.
	 */
	public Credential(String name, String lastname, Date birthday, String gender, String email, String username,
			String password) {
		super();
		Name = name;
		Lastname = lastname;
		Birthday = birthday;
		Gender = gender;
		Email = email;
		Username = username;
		Password = password;
	}

	/**
	 * Empty constructor.
	 */
	public Credential() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return Lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return Birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
