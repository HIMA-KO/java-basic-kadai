package kadai_017;
//加藤花子を表すクラス

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	public  KatoHanako_Chapter17() {
		familyName = "加藤";	
		givenName = "花子";
		address = "東京都中野区○×です";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
