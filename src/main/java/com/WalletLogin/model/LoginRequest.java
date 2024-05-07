/**
 * 
 */
package com.WalletLogin.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Eduardo Alvarado
 *
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
	
	/**
	 * User's Username.
	 */
	private String Username;
	
	/**
	 * User's Password.
	 */
	private String Password;

}
