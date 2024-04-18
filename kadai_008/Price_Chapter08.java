package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 30;
		String serviceCost = "";
		
		serviceCost = switch(userAge) {
		case 10,11,12,13,14,15,16,17,18,19 -> "10代の料金は1000円";
		case 20,21,22,23,24,25,26,27,28,29 -> "20代の料金は2000円";
		case 30,31,32,33,34,35,36,37,38,39 -> "30代の料金は3000円";
		case 40,41,42,43,44,45,46,47,48,49 -> "40代の料金は3000円";
		case 50,51,52,53,54,55,56,57,58,59 -> "50代の料金は4000円";
		case 60,61,62,63,64,65,66,67,68,69 -> "60代の料金は4000円";
		case 70,71,72,73,74,75,76,77,78,79 -> "70代の料金は4000円";
		case 80,81,82,83,84,85,86,87,88,89 -> "80代の料金は5000円";
		 default -> "500円";
		};
		
		System.out.println(serviceCost);
		
	}
}
