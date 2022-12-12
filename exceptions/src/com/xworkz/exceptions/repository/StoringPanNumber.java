package com.xworkz.exceptions.repository;

import com.xworkz.exceptions.exception.ArraySizeExceededCantStoreMoreEmails;
import com.xworkz.exceptions.exception.ArraySizeExceededCantStoreMoreNumbers;

public class StoringPanNumber implements PanNumber{
 
	String[]pan=new String[10];
	int index=0;

	
	@Override
	public void panNumbers(String numbers) {
		// TODO Auto-generated method stub
		
			this.pan[index]=numbers;
			index++;
			System.out.println("pan"+index);
			if(index>=pan.length) {
				throw new ArraySizeExceededCantStoreMoreNumbers();
			}
			
		}
	}


