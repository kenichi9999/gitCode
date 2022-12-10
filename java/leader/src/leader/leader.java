package leader;

import java.util.Scanner;

public class leader {

	public static void main(String[] args) {
		
		
		
		while(true) {
		
		System.out.println("＊レーダー＊");
		System.out.println("ターゲットとして ０〜１００のうち、１つの数が設定されます。探索する位置と範囲");
		System.out.println("を入力してターゲットを見つけてください");
		System.out.println("ターゲットと探索位置の差が探索範囲以下であればヒットです。探索範囲より大きければ、ハズレです");
		System.out.println("探索位置とターゲットが一致すれば正解です。");
		System.out.println("-------------------------");
		System.out.println("ゲームを開始する");
		
		//ターゲットの決定
		Integer targetValue = utility.getRandomValue();
		System.out.println("DG   " + targetValue );

		
		
		System.out.println("ターゲットが設定されました。");
		
		Scanner sc = null;
		int count = 1;
		while(true) {
		
		
		    System.out.println("探索位置を入力してください ＞");

		    sc = new Scanner(System.in);
		    int input = sc.nextInt();
		    if(input < 0 || input > 100 ) {
			    System.out.println("探索位置は０から１００の間で入力してくだい。");
			    continue;
		     }
		    System.out.println("");
		    System.out.println("探索範囲を入力してください ＞");
		    sc = new Scanner(System.in);
		    int hani = sc.nextInt();
		    if(hani < 0 || hani > 10 ) {
			    System.out.println("探索範囲は０から１０の間で入力してくだい。");
			    continue;
		     }
		    System.out.println("");
		    if(input == targetValue) {
		    	System.out.println("おめでとう！ " + count + "回目で正解です！");
		    	break;
		    }else if((input + hani) >= targetValue && (input - hani) <=targetValue) {
		    	System.out.println("ヒットしました。");
		    }else {
		    	System.out.println("はずれました。");
		    }
		    count++;
		}
		
		System.out.println("もう一度続けますか (1=Yes , 1以外=No)");
		sc = new Scanner(System.in);
		int check = sc.nextInt();
		
		if(check != 1 ) {
			System.out.println("お疲れ様でした。");
			break;
		}
		
		}
	}
	
}
