package javaproject_wk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kuku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int data  = Integer.parseInt(sc.nextLine());
		
		List dan_kuku = Util.kuku(data);
		
		dan_kuku.forEach(item -> System.out.println(item));
		
	}	
}
