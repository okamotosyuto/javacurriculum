package curriculum_16;

import java.util.Random;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
////	Q6
	Scanner easc = new Scanner(System.in);
	String eas = easc.nextLine();
	
	String eaName[] = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
	
	for (String easc: eaName) {
//		Random rand = new Random;
		int count = new Random().nextInt(11);
			switch(eas)  {
				case "パソコン":
					System.out.println(eas + "の残り台数は" + count + "台です");
					break;
				case "冷蔵庫":
					System.out.println(eas + "の残り台数は" + count + "台です");
					break;
				case "扇風機":
					System.out.println(eas + "の残り台数は" + count + "台です");
					break;
				case "洗濯機":
					System.out.println(eas + "の残り台数は" + count + "台です");
					break;
				case "加湿器":
					System.out.println(eas + "の残り台数は" + count + "台です");
					break;
				case "テレビ":
				case "ディスプレイ":
					System.out.println(eas == "テレビ" ? eas + "の残り台数は" + count + "台です"
										: eas + "の残り台数は" + (11 - count) + "台です");
//					三項演算子
					break;
				default:
					System.out.println(eas + "は対象の商品ではありません");
					break;
			}
	}
	}

}
