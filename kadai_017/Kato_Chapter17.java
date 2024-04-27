package kadai_017;

public abstract  class Kato_Chapter17 {
	
	//姓を表すフィールド
	public String familyName ;
	
	//名を表すフィールド
	public String givenName ;
	
	//住所を表すフィールド
	public String address;
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + "" + givenName + "です");
		System.out.println("住所は" + address);
	}
	
	//各サブクラスで個別に実装する必要がある
	 public abstract void eachIntroduce();
	
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
		
	}
	
	
}

