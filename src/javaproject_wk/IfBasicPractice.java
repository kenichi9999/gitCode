package javaproject_wk;
import java.io.*;
import java.util.Scanner;

public class IfBasicPractice {

	public static void main(String[] args) throws NumberFormatException{
		System.out.println("整数を入力してください。");
		try {
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		
		if(value % 2 == 0 ) {
			System.out.println("偶数です。");
			
		}else {
	    
			System.out.println("奇数です。");	
		}
		
		if(value % 3==0) {
			System.out.println("３の倍数です。");
			
		}
		if(value % 4==0) {
			System.out.println("４の倍数です。");
			
		}
		if(value % 5==0) {
			System.out.println("５の倍数です。");
			
		}
		}catch(NumberFormatException e) {
			System.out.println("整数以外が入力されました。");
			
		}
		
		
	}

}
