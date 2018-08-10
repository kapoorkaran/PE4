package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
	public String meth(String check, String word) {
				
				Pattern pattern = Pattern.compile(word);
		        Matcher matcher = pattern.matcher(check);
		        String res="";

		       
		        while(matcher.find()) {
		            
		            res=res
		                    + matcher.start() + "-" + matcher.end();
		        }
				return res;
			}

		}