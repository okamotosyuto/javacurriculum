
public class Curriculum_New_1_4 {

	public static void main(String[] args) {
		// Q1 下記9個をローカル変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型 

		byte a; //とても小さい
		short b;  //小さい
		int c;  //整数
		long d;  //大きい

		float e;  //小数
		double f;  //大きい

		char g;  //2byte(１文字)
		String h; // 文字列
		boolean i; // true 0  false 0以外


		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		a = 0; //数字は 0
		b = 0;
		c = 0;
		b = 0;
		e = 0;
		f = 0.0;
		g = '\u0000';                                                               
		h = null; //文字列は null
		i = true;

		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		// ・短整数型                 100
		// ・整数型                	 1000
		// ・長整数型                 10000
		// ・単精度浮動小数点数型   	 9.5
		// ・倍精度浮動小数点数型		 10.5
		// ・文字型                   a
		// ・文字列型              	 ハロー
		// ・ブーリアン型          	 true
		a = 10;
		b = 100;
		c = 1000;
		d = 10000;
		e = 9.5f;
		f = 10.5;
		g = 'a';
		h = "ハロー";
		i = true;


		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		// 20.0
		// a ハロー true
		// 11130.0                    数字を全て足す
		// 10000000000                小数点以外の数字を全てかける
		// 0.105                      10.5割る100をする
		// -90                        10引く100をする 
		long Q1 = a + b + c + d;
		System.out.println(Q1);

		double Q2 = e + f;
		System.out.println(Q2); //sysout → ctrl + space

		System.out.println(g + " " + h + " " + i);

		double Q3 = Q1 + Q2;
		System.out.println(Q3);

		long Q4 = a * b * c * d; 
		System.out.println(Q4);

		double Q5 = f / 100;
		System.out.println(Q5);

		int Q6 = a - b;
		System.out.println(Q6);

		//ctrl + / => コメントアウト
		//ctrl + shift + / => 範囲コメントアウト

		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));



	}

}
