package com.app.core;

public enum CustomerCategory {
	SILVER(1000), GOLD(2000), PLATINUM(3000), DIAMOND(4000);

	private int charges;

	private CustomerCategory(int charges) {
		this.charges = charges;
	}

	public int getCharges() {
		return this.charges;
	}
}
