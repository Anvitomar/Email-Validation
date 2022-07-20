package com;
import java.util.*;
import java.util.ArrayList;

public class SearchEmail {
	
	     void search(String search, ArrayList<String> ID) {
	    	 int fo=0;
	    	 for(int i=0;i<5;i++)
	    	 {
	    		 if(ID.contains(search)) {
                        
                     System.out.println("emailID:-" + search + " is valid");
                        fo=1;
                        break;
	    		 }
	    	 }
	    		 if(fo==0){
	    			 System.out.println("emailID:-" +search+ " is not valid");
	    		 }
                
	    	 }
	    	 
	     
	public static void main(String[] args) {
	        
	        ArrayList<String> ID = new ArrayList<String>();
	        
	        ID.add("pqrs@gmail.com");
	        ID.add("tuv@gmail.com");
	        ID.add("wxyz@gmail.com");
	        ID.add("abc@gmail.com");
	        ID.add("def@gmail.com");
	        
	         System.out.println("Enter the email to search");
	         Scanner sc = new Scanner(System.in);
	         String search=sc.nextLine();
	          SearchEmail se=new SearchEmail();
	          se.search(search,ID);
	}
}