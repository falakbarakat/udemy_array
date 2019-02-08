package se.lexicon.array_udemy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	boolean c=true;String answer;
    	while (c) {
    	
    	Udemy_array m = new Udemy_array();
    	m.input_array();
    	 System.out.println("have you finished inputing?");
    	answer=m.get2_input();
    		
    	switch (answer) {
    	case "yes":
    	c=false;
    	break;
    	case "no":
    	c=true;
    	System.out.println("welcome back");
    	default:
    		System.out.println("entries are not valid");
    	}
    	c=false;
    		
    	}
    			
        }
    
   
     
    
    }
