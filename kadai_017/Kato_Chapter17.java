package kadai_017;

abstract public class Kato_Chapter17 {

	//姓を表すフィールド
	public String familyName = "加藤";
	
	//名を表すフィールド
	public String givenName = "";
	
	//住所を表すフィールド
	public String address = "東京都中野区○×";
	
	
	//共通の紹介を出力する
	public void commonIntroduce(String familyName, String address) {
		System.out.println(familyName);
		System.out.println(address);
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {

	}

	
	
}
