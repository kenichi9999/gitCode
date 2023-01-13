package practice_site;

public class ExceptionBasicPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int numerator = 4200;
		int denominator;
		
		
		try {
		    denominator = Integer.parseInt(args[0]);
			int result = numerator / denominator;
		
				System.out.println("割り算の結果は"+result + "です。");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("コマンドラインに引数を指定してください");
		}catch(NumberFormatException e) {
			System.out.println("コマンドラインに引数には整数を指定してください");
		}catch(ArithmeticException e) {
			System.out.println("コマンドラインに引数には0以外の整数を指定してください");
		}finally {
			System.out.println("プログラムを終了します。");
		}
	}

}
