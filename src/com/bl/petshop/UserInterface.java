package com.bl.petshop;

import java.util.Iterator;
import java.util.List;

public class UserInterface {
	public void printAllPets(List list) {
		
		Iterator<Long> itr = null;
		itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}


