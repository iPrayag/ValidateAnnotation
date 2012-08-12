/**
 * 
 */
package com.mx.annotations;

/**
 * @author prayag
 * 
 */
public class MainActivity {
	public static void main(String[] args) throws Exception {
		AnnotationParser parser = new AnnotationParser();
		parser.parse(EditText.class);
	}
}