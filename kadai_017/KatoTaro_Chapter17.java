package kadai_017;
//加藤太郎を表すクラス

public class  KatoTaro_Chapter17 extends Kato_Chapter17  {

	public  KatoTaro_Chapter17() {
		familyName = "加藤";	
		givenName = "太郎";
		address = "東京都中野区○×です";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}

}
