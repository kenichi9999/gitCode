package javaproject_wk;

import java.util.List;
import java.util.Scanner;

public class fiboCall {

	public static void main(String[] args) {
		
		
		List flist = Util.fibonacci(100);
		Scanner sc = new Scanner(System.in); 
		int value1  =Integer.parseInt(sc.nextLine());
		int value2  =Integer.parseInt(sc.nextLine());
		
		
		for(int i = value1; i < value2 ; i++) {
		   System.out.println(flist.get(i));
		}
		
	}

}
