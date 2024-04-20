package kadai_011;

public class Prime_Chapter11 {
    public static void main(String[] args) {
        boolean[] scoreArray = new boolean[101];
        
        // 配列をtrueで初期化
        for (int k = 1; k < scoreArray.length; k++) {
        	scoreArray[k] = true;
        }

        // 素数かどうかの判定
        for (int i = 2; i < scoreArray.length; i++) {
            for (int r = 2; r * r <= i; r++) {
                if (i % r == 0) {
                	scoreArray[i] = false;
                    break;
                }
            }
        }

        // 素数の出力
        for (int j = 2; j < scoreArray.length; j++) {
            if (scoreArray[j]) {
                System.out.println(j);
            }
        }
    }
}

	
	

