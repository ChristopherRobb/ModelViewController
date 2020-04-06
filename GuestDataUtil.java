package com.robbchris.servlet;

import java.util.ArrayList;
import java.util.List;

public class GuestDataUtil {
	
public static List<Guest> getGuests(){
	
	//create empty List
	
	List<Guest> guests = new ArrayList<>();
	
	//add data to List
	guests.add(new Guest("Mary", "Smith", "mary@gmail.com"));
	guests.add(new Guest("John", "Hope", "hope@yahoo.com"));
	guests.add(new Guest("Steve", "Smith", "smith@ussa.com"));
	guests.add(new Guest("Chris", "Robb", "crobb@gmail.com"));
	
	//return List
	return guests;
	
	
	
}

}
