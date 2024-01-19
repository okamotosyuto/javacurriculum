package curriculum_16;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Q7
		Scanner tssc = new Scanner(System.in);
		int st = tssc.nextInt();
		
		String[] test = {"英語","数学","理科","社会"};
		
		int score[][] = new int[st][test.length];
		System.out.println();
		
		for(int i = 0; i < st;) {
			for(int j = 0; j < test.length; j++) {
			int scoresc = tssc.nextInt();
			score = new int[scoresc][];
			System.out.println((i + 1) + "人目の『" + score[2] + "』の点数を入力してください:" + score[1]);
			}
			i++;
		}
	}

}

