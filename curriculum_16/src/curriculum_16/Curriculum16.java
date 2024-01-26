package curriculum_16;

import java.util.Random;
import java.util.Scanner;

public class Curriculum16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
////		Q1
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length() >= 10) {
			System.out.println("名前を１０文字以内にしてください");
		} else if ((s.length() <= 0) || s == null){
			System.out.println("名前を入力してください");
		} else {
			System.out.println("ユーザー名" + s + "を登録しました");
		}
	
////		Q2
		if(s.matches("0-9a-zA-Z")) {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		
////		Q3
		Scanner jansc = new Scanner(System.in);
		
//		ユーザーの手を判定
		String jans = jansc.nextLine();
		String userHand = null;
		
		if(jans.equals("0")) {
			userHand = "グー";
		}else if (jans.equals("1")) {
			userHand = "チョキ";
		}else if (jans.equals("2")) {
			userHand = "パー";
		}else {
			System.out.println("0はグー、１はチョキ、２はパー");
		}
		
//		cpuの手を判定

		
		
//		勝敗判定を行う
		int iJan = 0;
		boolean flg = false;
		while(flg == false) {
			String cpuHand = null;
			String janCpu = null;
			iJan++;

			if(userHand == null) {
				System.exit(-1);
			} else {
				cpuHand = String.valueOf(new Random().nextInt(3));
				if (cpuHand.equals("0")) {
					janCpu = "グー";
				} else if (cpuHand.equals("1")) {
					janCpu = "チョキ";
				} else if (cpuHand.equals("2")) {
					janCpu = "パー";
				}
			}
			System.out.println("あなた:" + userHand + "CPU:" + janCpu);
			if(janCpu == userHand) {
				System.out.println("DRAW あいこ もう一回しましょう！") ;
			} else if (userHand == "グー" && janCpu == "パー") { 
				System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
			} else if (userHand == "チョキ" && janCpu == "グー") {
				System.out.println("俺の勝ち！負けは次に繋がるチャンスです！ネバーギブアップ！");
			} else if (userHand == "パー" && janCpu == "チョキ") {
				System.out.println("俺の勝ち！たかがジャンケン、そう思ってないですか？それやったら次も、俺が勝ちますよ");
			} else {
				System.out.println("やるやん。次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + iJan + "回です");
				flg = true;
			}
		}
		

		


	}
}
