package com.xworkz.crudss.service;

import com.xworkz.crudss.constant.HelmetColor;
import com.xworkz.crudss.constant.HelmetType;
import com.xworkz.crudss.dto.HelmetDTO;
import com.xworkz.crudss.repository.HelmetRepository;

public class HelmetServiceImp implements HelmetService {
	HelmetRepository helmetRepository;

	public HelmetServiceImp(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		String brand = dto.getBrand(); // not null,min 4, max 6
		int price = dto.getPrice(); // > 100, <10000
		HelmetColor color = dto.getColor();// not null
		HelmetType type = dto.getType();// not null
		boolean validBrand = false;
		boolean validPrice = false;
		boolean validColor = false;
		boolean validType = false;

		if (brand != null && brand.length() >= 4 && brand.length() <= 6) {
			System.out.println("Helmet is valid" + brand);
			validBrand = true;
		}

		else {
			System.out.println("Helmet is invalid");
		}

		if (price != 0 && price >= 100 && price <= 10000) {
			System.out.println("Helmet is valid" + price);
			validPrice = true;
		}

		else {
			System.out.println("Helmet is invalid");
		}

		if (color != null || color == HelmetColor.BLUE || color == HelmetColor.BLACK || color == HelmetColor.YELLOW
				|| color == HelmetColor.RED) {
			System.out.println("Helmet is valid" + color);
			validColor = true;
		}

		else {
			System.out.println("Helmet is invalid");
		}

		if (type != null || type == HelmetType.SPORTS || type == HelmetType.HALF || type == HelmetType.FULL) {
			System.out.println("Helmet is valid" + type);
			validType = true;
		}

		else {
			System.out.println("Helmet is invalid");
		}

		if (validType && validColor && validPrice && validBrand) {
			boolean saved = this.helmetRepository.save(dto);
			System.out.println("HelmetDTO is saved " + saved);
			return saved;

		}

		// TODO Auto-generated method stub
		return false;
	}

}
