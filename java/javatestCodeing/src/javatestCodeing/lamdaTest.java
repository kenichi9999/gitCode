package javatestCodeing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class lamdaTest {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("今日の運勢はなんと" + fortune.getresult()+ "です。");
		
		
		
		/* xmlファイルを読み込んでみたい */
		DocumentBuilderFactory DF = DocumentBuilderFactory.newInstance();
		DocumentBuilder DB = DF.newDocumentBuilder();
		
		
		
		
		
		
		/* ラムダ式を使ってみた下 */
		List<String> dataList = new ArrayList<String>();
		
		dataList.add("a");
		dataList.add("b");
		dataList.add("c");
		dataList.add("d");
		dataList.add("e");
		dataList.add("f");
		dataList.add("g");
		dataList.add("h");
		dataList.add("i");

		
		List<String> dataList2 = new ArrayList<String>();
		
	    int count = 0;
		
		dataList.forEach(data -> {
				int a = 0; 
				System.out.println(data);
			    String b =getData(data);
			    if(!b.isEmpty()) {
			    	dataList2.add(b);
			    }		    		
				a++;
		});
		
		dataList2.forEach(data2 -> {
			System.out.println(data2);
		});
		
		
	}

	private static String getData(String a) {
		if(a.equals( "a")) {
			return a;	
		}else {
			return "";
		
	    }
	}
}
