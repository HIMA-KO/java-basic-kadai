package kadai_017;
//加藤一郎を表すクラス

	public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
		
		public  KatoIchiro_Chapter17() {
			familyName = "加藤";	
			givenName = "一郎";
			address = "東京都中野区○×です";
		}
		
		@Override
		public void eachIntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}

}
