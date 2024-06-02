package kadai_024;

import java.util.Random;

public class JyankenExec_Chapter24 {
    // じゃんけんの手の配列
    private static final String[] HANDS = {"グー", "チョキ", "パー"};
    
    // コンピュータの手をランダムに生成するメソッド
    public String getRandomHand() {
        Random random = new Random();
        int randomIndex = random.nextInt(HANDS.length);
        return HANDS[randomIndex];
    }

    // じゃんけんのゲームをプレイするメソッド
    public void playGame(String userHand) {
        String computerHand = getRandomHand();
        System.out.println("コンピュータの手は: " + computerHand);

        // 勝敗の判定
        if (userHand.equals(computerHand)) {
            System.out.println("引き分けです！");
        } else if ((userHand.equals("グー") && computerHand.equals("チョキ")) ||
                   (userHand.equals("チョキ") && computerHand.equals("パー")) ||
                   (userHand.equals("パー") && computerHand.equals("グー"))) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです！");
        }
    }
}

