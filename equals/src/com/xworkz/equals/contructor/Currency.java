package com.xworkz.equals.contructor;

public class Currency {
	private String currencyOfIndia;
	private String type;
	private String printedAt;
	private int diffForms;
	private int waysOfWithdrawing;
	private int waysOfTransfering;
	private String locationRBI;
	private String governorRBI;

	public Currency(String currencyOfIndia, String type, String printedAt, int diffForms, int waysOfWithdrawing,
			int waysOfTransfering, String locationRBI, String governorRBI) {
		super();
		this.currencyOfIndia = currencyOfIndia;
		this.type = type;
		this.printedAt = printedAt;
		this.diffForms = diffForms;
		this.waysOfWithdrawing = waysOfWithdrawing;
		this.waysOfTransfering = waysOfTransfering;
		this.locationRBI = locationRBI;
		this.governorRBI = governorRBI;
	}

	public String getCurrencyOfIndia() {
		return currencyOfIndia;
	}

	public void setCurrencyOfIndia(String currencyOfIndia) {
		this.currencyOfIndia = currencyOfIndia;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrintedAt() {
		return printedAt;
	}

	public void setPrintedAt(String printedAt) {
		this.printedAt = printedAt;
	}

	public int getDiffForms() {
		return diffForms;
	}

	public void setDiffForms(int diffForms) {
		this.diffForms = diffForms;
	}

	public int getWaysOfWithdrawing() {
		return waysOfWithdrawing;
	}

	public void setWaysOfWithdrawing(int waysOfWithdrawing) {
		this.waysOfWithdrawing = waysOfWithdrawing;
	}

	public int getWaysOfTransfering() {
		return waysOfTransfering;
	}

	public void setWaysOfTransfering(int waysOfTransfering) {
		this.waysOfTransfering = waysOfTransfering;
	}

	public String getLocationRBI() {
		return locationRBI;
	}

	public void setLocationRBI(String locationRBI) {
		this.locationRBI = locationRBI;
	}

	public String getGovernorRBI() {
		return governorRBI;
	}

	public void setGovernorRBI(String governorRBI) {
		this.governorRBI = governorRBI;
	}

	@Override
	public String toString() {
		return "Currency [currencyOfIndia=" + currencyOfIndia + ", type=" + type + ", printedAt=" + printedAt
				+ ", diffForms=" + diffForms + ", waysOfWithdrawing=" + waysOfWithdrawing + ", waysOfTransfering="
				+ waysOfTransfering + ", locationRBI=" + locationRBI + ", governorRBI=" + governorRBI + "]";
	}

	public boolean equals(Object rupee) {

		if (rupee instanceof Currency) {
			Currency casted = (Currency) rupee;

			if (this.type.equals(casted.type) && this.waysOfWithdrawing == casted.waysOfWithdrawing
					&& this.locationRBI.equals(casted.locationRBI) && this.diffForms == casted.diffForms) {
				System.out.println("industry type is equal");
				return true;
			}

			else {
				System.out.println("properties are not equal");
			}

		}
		return false;

	}

}
