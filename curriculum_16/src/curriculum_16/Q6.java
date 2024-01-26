package curriculum_16;

import java.util.Random;
import java.util.Scanner;


public class Q6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
////	Q6
	Scanner easc = new Scanner(System.in);
	String eas = easc.nextLine();
	String[] strArray = eas.split(",");
	
	String eaName[] = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
	
	for (String st:strArray) {
//		Random rand = new Random;
		int count = new Random().nextInt(11);
			switch(st)  {
				case "パソコン":
					System.out.println(st + "の残り台数は" + count + "台です");
					break;
				case "冷蔵庫":
					System.out.println(st + "の残り台数は" + count + "台です");
					break;
				case "扇風機":
					System.out.println(st + "の残り台数は" + count + "台です");
					break;
				case "洗濯機":
					System.out.println(st + "の残り台数は" + count + "台です");
					break;
				case "加湿器":
					System.out.println(st + "の残り台数は" + count + "台です");
					break;
				case "テレビ":
				case "ディスプレイ":
					System.out.println(st== "テレビ" ? st + "の残り台数は" + count + "台です"
										: st + "の残り台数は" + (11 - count) + "台です");
//					三項演算子
					break;
				default:
					System.out.println(st + "は対象の商品ではありません");
					break;
			}
	}
	}

}
