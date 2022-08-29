package javaproject_wk;

import java.util.Scanner;

public class IfNormalPractice {
	
	public static void main (String[] ages) {
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());
		
		if(age >= 20) {
			System.out.println("成人です。");
		}else if(age < 20 && age >=0 ) {
			System.out.println("未成年です。");
			if(age < 16) {
				System.out.println("義務教育です");
				
			}
		}
	}

}
