package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {

	public  void search(String[] word) {
		HashMap<String,String> fruitMap = new HashMap<String,String>();
		
		
		fruitMap.put("apple","りんご");
		fruitMap.put("peach","桃");
		fruitMap.put("banana","バナナ");
		fruitMap.put("pea","梨");
		fruitMap.put("kiwi","キウィ");
		fruitMap.put("strawberry","いちご");
		fruitMap.put("grape","ぶどう");
		fruitMap.put("muscat","マスカット");
		fruitMap.put("cherry","さくらんぼ");
		
		
		String result = "";
		
		for(int i = 0; i < word.length; i++ ) {
				 
			result  = fruitMap.get(word[i]);
			if (result == null) {
				System.out.println(word[i] + "は辞書に存在しません");
			} else {
		        System.out.println(word[i] + "の意味は" + result);
		    }
		}
		
	}

}
