package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {

	public void setGivenName(String name )  {
		givenName = name;
	}
	
	 public void eachIntroduce() {
		 System.out.println("趣味は読書です");
	 }
	
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	} 

}
