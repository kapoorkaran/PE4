package com.stackroute.pe4;

public class Setup_1 {
	public boolean alphaCheck(String word) {
		
	     word=word.toLowerCase(); 
	     String s[]=word.split(" ");   
	     for (int i = 0; i <s.length; i++) 
	        {
	            for (int j = i + 1; j <s.length; j++) 
	            {
	                String temp;
	                if (s[i].compareTo(s[j])>0) 
	                {
	                    temp = s[i];
	                    s[i] = s[j];
	                    s[j] = temp;
	                }
	            }
	        }
	        for(int i=0;i<s.length;)
	        	
	        {
	            return s[i] != null;
	        }
	        return false;
	     }
	}