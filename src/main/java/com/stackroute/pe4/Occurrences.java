package com.stackroute.pe4;

public class Occurrences {
	
	public int count(String s, String c ) {
      
		s.length();
         s.replaceAll(c, "").length();
        int charcount = s.length() - s.replaceAll(c, "").length();
       
		
		return charcount;
	}

}
