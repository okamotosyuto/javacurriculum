package curriculum_16;

public class Q5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
////	Q5
	for(int i = 1; i <= 9; i++) {
		System.out.println();
		
		for(int j = 1; j <= 20; j++) {
			System.out.print(String.format("%03d", i) + "*" + String.format("%03d", j) + "=" + String.format("%03d", i*j));
			if (j != 20) System.out.print("||");
		}
	}


	}

}
