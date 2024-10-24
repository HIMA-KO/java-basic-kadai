package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {

	public void setGivenName(String name )  {
		givenName = name;
	}
	
	 public void eachIntroduce() {
		 System.out.println("Javaが得意です");
	 }
	
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

}
