package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.BuildingDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.BuildingRepository;

public class BuildingServiceImp implements BuildingService {

	BuildingRepository buildingRepository;

	public BuildingServiceImp(BuildingRepository buildingRepository) {
		this.buildingRepository = buildingRepository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto)  throws ValidationException {
		int no = dto.getNo();
		String name = dto.getName();
		int floors = dto.getFloors();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		String type = dto.getType();

		boolean validNo = false;
		boolean validName = false;
		boolean validFloors = false;
		boolean validLift = false;
		boolean validParking = false;
		boolean validType = false;

		if (no != 0 && no > 3 && no < 20) {
			System.out.println("building is valid " + no);
			validNo = true;
		}

		else {
			System.out.println("building is invalid");
		}

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("building is valid " + name);
			validName = true;
		}

		else {
			System.out.println("building is invalid");
		}

		if (floors != 0 && floors >= 3 && floors <= 20) {
			System.out.println("building is valid " + floors);
			validFloors = true;
		}

		else {
			System.out.println("building is invalid");
		}

		if (lift = true) {
			System.out.println("building is valid " + lift);
			validLift = true;
		}

		else {
			System.out.println("building is invalid");
		}

		if (parking = true) {
			System.out.println("building is valid " + parking);
			validParking = true;
		}

		else {
			System.out.println("building is invalid");
		}

		if (type != null && type.length() > 3 && type.length() < 20) {

			System.out.println("building is valid " + type);
			validType = true;
		}

		else {
			System.out.println("building is invalid");

		}

		if (validType && validName && validLift && validFloors && validParking && validType) {
			System.out.println("building is valid");
			boolean saved = this.buildingRepository.create(dto);
			System.out.println("saved " + saved);
			throw new ValidationException();
		}

		System.out.println("building is not valid");

		return false;
	}

}
