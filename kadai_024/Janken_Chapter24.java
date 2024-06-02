package kadai_024;

import java.util.Scanner;

public class Janken_Chapter24 {

    // ユーザーの入力を取得するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String myChoice;
        while (true) {
            System.out.println("自分のジャンケンの手を入力しましょう:");
            System.out.println("グーは「グー」、チョキは「チョキ」、パーは「パー」を入力してください:");
            myChoice = scanner.nextLine();
            if (isValidChoice(myChoice)) {
                break;
            } else {
                System.out.println("エラー: 正しいジャンケンの手を入力してください");
            }
        }
        return myChoice;
    }

    // 有効なユーザー入力を判定するメソッド
    public boolean isValidChoice(String choice) {
        return choice.equals("グー") || choice.equals("チョキ") || choice.equals("パー");
    }

    public static void main(String[] args) {
        // ユーザー入力クラスのインスタンスを作成
        Janken_Chapter24 userInput = new Janken_Chapter24();
        JyankenExec_Chapter24 janken = new JyankenExec_Chapter24();
        
        // ユーザーの手を入力
        String myChoice = userInput.getMyChoice();
        System.out.println("あなたが選んだ手は: " + myChoice);

        // じゃんけんのゲームを実行
        janken.playGame(myChoice);
    }
}
