package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harry_6 {
	
	public boolean checkHarry(String sentence, String word)
	 {
		boolean res;
		Pattern p = Pattern.compile(word);   // the pattern to search for
	    Matcher m = p.matcher(sentence);
		if(m.find())
			res=true;
		else
		// TODO Auto-generated method stub
			res=false;
		return res;
	}

}