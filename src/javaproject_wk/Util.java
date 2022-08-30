package javaproject_wk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Util {

	public static List<Integer> kuku(int dan) {
		
		List<Integer> lst  =new ArrayList<Integer>();

		for(int i  = 1 ; i < 10 ;i++) {
			lst.add(dan*i);
			
		}
		return lst;
	}
	
	
	public static  List<Integer> fibonacci(int dan) {
		List<Integer> lst  = new ArrayList<Integer>(Arrays.asList(0,1));

		for(int i =2 ;i < dan;i++) {
			lst.add(lst.get(i-2)+lst.get(i-1));
		}
		
		return lst;
		
	}
	
	public boolean isPrimeNumber(int checkvalue) {
		
		boolean result = false;
		
		Pattern pt = Pattern.compile("^[0-9]+$");
		
	    return pt.matcher(Integer.toString(checkvalue)).matches();
	}
	
	
}
