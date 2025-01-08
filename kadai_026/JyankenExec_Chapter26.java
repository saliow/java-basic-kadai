package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String userHand = scanner.nextLine();
		String computerHand = jyanken.getComputerHand();
		
		System.out.println("自分の手は" + jyanken.translateHand(userHand) + ",対戦相手の手は" + jyanken.translateHand(computerHand));
		System.out.println(jyanken.determineWinner(userHand, computerHand));
	}
}
