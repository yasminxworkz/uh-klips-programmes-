package com.xworkz.equals.contructor;

public class Paint {
	private String name;
	private String type;
	private String industryType;
	private String manufacturedAt;
	private String color;
	private String containerShape;
	private int dateOfManufacturing;
	private double quantity;
	private long price;
	private boolean goodQuality;

	public Paint(String name, String type, String industryType, String manufacturedAt, String color,
			String containerShape, int dateOfManufacturing, double quantity, long price, boolean goodQuality) {
		super();
		this.name = name;
		this.type = type;
		this.industryType = industryType;
		this.manufacturedAt = manufacturedAt;
		this.color = color;
		this.containerShape = containerShape;
		this.dateOfManufacturing = dateOfManufacturing;
		this.quantity = quantity;
		this.price = price;
		this.goodQuality = goodQuality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getManufacturedAt() {
		return manufacturedAt;
	}

	public void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt = manufacturedAt;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getContainerShape() {
		return containerShape;
	}

	public void setContainerShape(String containerShape) {
		this.containerShape = containerShape;
	}

	public int getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(int dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public boolean isGoodQuality() {
		return goodQuality;
	}

	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", type=" + type + ", industryType=" + industryType + ", manufacturedAt="
				+ manufacturedAt + ", color=" + color + ", containerShape=" + containerShape + ", dateOfManufacturing="
				+ dateOfManufacturing + ", quantity=" + quantity + ", price=" + price + ", goodQuality=" + goodQuality
				+ "]";
	}

	public boolean equals(Object chemical) {

		if (chemical instanceof Paint) {
			Paint casted = (Paint) chemical;
			if (this.industryType.equals(casted.industryType)) {
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
