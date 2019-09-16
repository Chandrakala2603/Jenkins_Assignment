package com.jenkins.assignment;

public class IdentifyMonth {

	public static void main(String[] args) {
		
		    //Specifying month number  
		    int month=5;    
		    String monthString="";  
		    //Switch statement  
		    switch(month){    
		    //case statements within the switch block  
		    case 1: monthString="1 - January";  
		    break;    
		    case 2: monthString="2 - February";  
		    break;    
		    case 3: monthString="3 - March";  
		    break;    
		    case 4: monthString="4 - April";  
		    break;    
		    case 5: monthString="5 - May";  
		    break;    
		    case 6: monthString="6 - June";  

		    break;    
		    default:System.out.println("Invalid Month!");    
		    }    
		    //Printing month of the given number  
		    System.out.println(monthString);  
		}    
}