/**
 * 
 */
package com.mx.annotations;

import java.lang.reflect.Method;

import com.mx.widgets.EditText;

/**
 * @author prayag
 * 
 */
public class AnnotationParser {
	public void parse(Class clazz) throws Exception {
		/*
		 * Returns an array containing Method objects reflecting all the public
		 * member methods of the class or interface represented by this Class
		 * object
		 */
		Method[] methods = clazz.getMethods();

		for (Method method : methods) {
			// Checking if MyAnnotation is present in any methods in the class
			if (method.isAnnotationPresent(Validation.class)) {
				// Retrieving the message from the annotation
				Validation validationAnnotation = method
						.getAnnotation(Validation.class);
				boolean req = validationAnnotation.required();

				// Displaying the method for which MyAnnotation is present
				System.out.println("method" + method);
				// Invoking the method by passing the message retrieved from the
				// annotation
				method.invoke(EditText.class.newInstance(), req);
			}
		}
	}
}
