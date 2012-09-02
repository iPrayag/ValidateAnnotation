/**
 * 
 */
package com.mx.ui;

import com.mx.annotations.InjectView;
import com.mx.widgets.PasswordBox;

/**
 * @author prayag
 * 
 */
public class MainActivity {

	@InjectView(layoutID = "passwordBox")
	PasswordBox passwordBox;

	public static void main(String[] args) throws Exception {
		// AnnotationParser parser = new AnnotationParser();
		// parser.parse(EditText.class);

	}
}