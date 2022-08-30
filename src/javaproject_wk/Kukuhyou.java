package javaproject_wk;

import java.util.ArrayList;
import java.util.List;


public class Kukuhyou {

	public static void main(String[] args) {
		
		List<List<Integer>> kukuhyou = new ArrayList<List<Integer>>();
		for(int i = 1; i < 10 ; i++) {
			kukuhyou.add(Util.kuku(i));  
		}
		
		
		for(List<Integer> item:kukuhyou){
			System.out.println(item);
			
		}
			
	}

}
