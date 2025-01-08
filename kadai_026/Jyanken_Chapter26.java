package kadai_026;

import java.util.Random;

public class Jyanken_Chapter26 {
	public static final String ROCK = "r";
	public static final String SCISSORS = "s";
	public static final String PAPER = "p";
	public static final String[] HANDS = {ROCK, SCISSORS, PAPER};
	
	public String getComputerHand() {
		Random random = new Random();
		int index = (int) Math.floor(random.nextDouble() * HANDS.length);
		return HANDS[index];
	}
	
	public String determineWinner(String userHand, String computerHand) {
		if (userHand.equals(computerHand)) {
			return "引き分けです";
		}
		if ((userHand.equals(ROCK) && computerHand.equals(SCISSORS)) ||
			(userHand.equals(SCISSORS) && computerHand.equals(PAPER)) ||
			(userHand.equals(PAPER) && computerHand.equals(ROCK))) {
			return "自分の勝ちです";
		}
		return "自分の負けです";
	}
	
	public String translateHand(String hand) {
		switch (hand) {
			case ROCK:
				return "グー";
			case SCISSORS:
				return "チョキ";
			case PAPER:
				return "パー";
			default:
				return "不明な手";
		}
	}
}
