package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// Q1
		// 下記9個をローカル変数として宣言のみしてください
		// ・バイト型・短整数型・整数型・長整数型
		byte a;

		short b;

		int c;

		long d;
		
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		float e;

		double f;
		
		// ・文字型・文字列型
		char g;

		String h;
		
		// ・ブーリアン型
		boolean i;
/*
 * 
 */
		// Q2
		// 初期化をしたそれぞれの変数に下記の値を代入してください
		// ・バイト型・短整数型・整数型・長整数型
		a = 0;

		b = 0;

		c = 0;

		d = 0L;
		 
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		e = 0f;

		f = 0.0d;
 
		// ・文字型・文字列型
		g = '\u0000';

		h = null;

		// ・ブーリアン型
		i = false;
/*
 * 
 */


		// Q3
		// 初期化をしたそれぞれの変数に下記の値を代入してください
		// ・バイト型・短整数型・整数型・長整数型
		a = 10;

		b = 100;

		c = 1000;

		d = 10000L;
		
		// ・単精度浮動小数点数型・倍精度浮動小数点数型
		e = 9.5f;

		f = 10.5d;

		// ・文字型・文字列型
		g = 'a';

		h = "ハロー";

		// ・ブーリアン型
		i = false;
/*
 * 
 */

		// Q4
		// 下記の通りにコンソール出力されるようにしてください
		long Q1 = a + b + c + d;
		System.out.println(Q1);

		double Q2 = e + f;
		System.out.println(Q2);

		System.out.println(g + " " + h + " " + i);

		double Q3 = Q1 + Q2;
		System.out.println(Q3);

		long Q4 = a * b * c * d;
		System.out.println(Q4);

		double Q5 = f / b;
		System.out.println(Q5);

		int Q6 = a - b;
		System.out.println(Q6 + "\n");
/*
 * 
 */
 
		// Q5
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		
		//int型に修正
		int num = 20;

		int num1 = 23;

		System.out.println("ハローJAVA" + (num + num1) + "\n");

/*
 * 
 */

		// Q6
		// 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		String name = "山田太郎";
		System.out.println("初めまして" + name + "です");

		int age = 18;
		System.out.println("年齢は" + age + "歳です");

		double height = 170.5;
		System.out.println("身長は" + height + "cmです");

		double weight = 62.2;
		System.out.println("体重は" + weight + "kgです");

		String favorite = "寿司";
		System.out.println("好きな食べ物は" + favorite + "です");
/*
 * 
 */
		// Q7
		// 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		
		// BMI算出
		double bmi =weight / Math.pow(height / 100, 2);
		
		// 四捨五入
		bmi = (double)Math.round(bmi * 100) / 100;
		
		System.out.println("BMIは" + String.format("%.2f",bmi) + "です" + "\n");
/*
 * 
 */

		// Q8
		// 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		
		// 再代入
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");

		age = 24;
		System.out.println("年齢は" + age + "歳です");

		height = 168.5;
		System.out.println("身長は" + height + "cmです");

		weight = 64.2;
		System.out.println("体重は" + weight + "kgです");

		favorite = "オムライス";
		System.out.println("好きな食べ物は" + favorite + "です");
		
		// BMI算出
		double bmi2 =weight / Math.pow(height / 100, 2);
		
		// 四捨五入
		bmi2 = (double)Math.round(bmi2 *100)/100;
		
		System.out.println("BMIは" + bmi2 + "です" + "\n");

/*
 * 
 */

		// Q9
		// 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		
		// 自己代入
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");

		age += age;
		System.out.println("年齢は" + age + "歳です");

		height += height;
		System.out.println("身長は" + height + "cmです");

		weight += weight;
		System.out.println("体重は" + weight + "kgです");

		favorite = "オムライス";
		System.out.println("好きな食べ物は" + favorite + "です");
		
		// BMI算出
		double bmi3 =weight / Math.pow(height / 100, 2);
		
		// 四捨五入
		bmi3 = (double)Math.round(bmi3 * 100 ) / 100;
		
		System.out.println("BMIは" + bmi3 + "です" + "\n");

/*
 * 
 */

		// Q10
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		boolean flg = age >= 25 ? true : false;
		System.out.println(flg + "\n");

/*
 * 
 */

		// Q11
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		// 再代入
		age = 24;

		height = 168.5;

		weight = 64.2;
		
		// 型変換
		String strAge = String.valueOf(age);

		String strHeight = String.valueOf(height);

		String strWeight = String.valueOf(weight);

		System.out.println(strAge + strHeight + strWeight + "\n");
/*
 * 
 */
		// Q12
		// 11で変換した【年齢・身長】を整数型に変換して出力してください
		int intAge = Integer.valueOf(strAge);
		System.out.println(intAge);
		
		// 型変換
		double dblHeight = Double.parseDouble(strHeight);
		int intHeight = (int)dblHeight;
		
		System.out.println(intHeight + "\n");
/*
 * 
 */
		// Q13
		// 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		boolean flg2 = intAge >= 25 ? true : intHeight >= 160 ? true:false;
		System.out.println(flg2 + "\n");
	}

}
