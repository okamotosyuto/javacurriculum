package curriculum_16;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Q7
		double isum = 0;
		
		Scanner tssc = new Scanner(System.in);
		int st = tssc.nextInt();
		
		System.out.println("生徒の数を入力してください（2以上）:" + st);
		
		String[] test = {"英語","数学","理科","社会"};
		int [][] score = new int[st][4];
		int[] scoreav = new int[4];
			
		for(int i = 0; i < st; i++) {
			for(int j = 0; j < test.length; j++) {
			int scoresc = tssc.nextInt();
			score[i][j] = scoresc;
			scoreav[j] = scoreav[j] + scoresc;
			isum = isum + scoresc;
			System.out.println((i+1) + "人目の『" + test[j] + "』の点数を入力してください:" + score[i][j]);
			}
			System.out.println((i + 1) + "人目の平均点は" + (String.format("%.2f",isum / test.length)));
			isum = 0;
		}
		for(int k = 0; k < scoreav.length; k++) {
			double ave = scoreav[k] / st;
			System.out.println(test[k] + "の平均点は" + String.format("%.2f",ave / st) + "点です。");
		}
	}

}
