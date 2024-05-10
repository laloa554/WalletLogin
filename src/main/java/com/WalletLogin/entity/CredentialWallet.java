package com.WalletLogin.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="CREDENTIAL_WALLET")
@Getter
@Setter
public class CredentialWallet {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long CustomerId;
	
	/**
	 * User's name
	 * */
	@Column(name = "NAME", length=50, nullable=false)
	private String Name;
	
	/**
	 * User's Lastname.
	 * */
	@Column(name = "LAST_NAME", length=50, nullable=false)
	private String Lastname;
	
	/**
	 * User's Birthday.
	 * */
	@Column(name = "BIRTHDAY", nullable=false)
	private LocalDateTime Birthday;
	
	/**
	 * User's Gender.
	 * */
	@Column(name = "GENDER",length=50, nullable=false)
	private String Gender;
	
	/**
	 * User's Email.
	 * */
	@Column(name = "EMAIL",length=100, nullable=false)
	private String Email;
	
	/**
	 * User's Username.
	 * */
	@Column(name = "USERNAME",length=50, nullable=false)
	private String Username;
	
	/**
	 * User's Password.
	 * */
	@Column(name = "PASSWORD", nullable=false)
	private String Password;

}
