package curriculum_16;

public class Q4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
////	Q4
//	横に並べないとだめ
	for(int i = 1; i <= 9; i++) {
		System.out.println();
		
		for(int j = 1; j <= 9; j++) {
			System.out.print(String.format("%02d", i) + "*" + String.format("%02d", j) + "=" + String.format("%02d", i*j));
			if (j != 9) System.out.print("||");
		}
	}

	}

}
