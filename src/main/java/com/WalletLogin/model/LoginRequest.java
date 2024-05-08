/**
 * 
 */
package com.WalletLogin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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
	@NonNull
	private String Username;
	
	/**
	 * User's Password.
	 */
	@NonNull
	private String Password;

}
