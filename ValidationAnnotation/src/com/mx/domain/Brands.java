/**
 * 
 */
package com.mx.domain;

/**
 * @author prayag
 * 
 */
public enum Brands {
	HONDA("RED", "DHAPASI"), SUZU("BLACK", "GHATTEKULO");
	private String color;
	private String loc;

	private Brands(String color, String loc) {
		this.color = color;
		this.loc = loc;
	}

	public String getColor() {
		return color;
	}

	public String getLoc() {
		return loc;
	}
}
