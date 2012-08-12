/**
 * 
 */
package com.mx.annotations;

/**
 * @author prayag
 * 
 */
public class EditText {

	@Validation(required = true)
	public void render(String message) {
		System.out.println("message : " + message);
	}
}
