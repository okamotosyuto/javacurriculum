package java8_project_p;

public class java8c {

	public static void main(String[] args) {

		//Q1
		byte a;

		short b;

		int c;

		long d;

		float e;

		double f;

		char g;

		String h;

		boolean i;

		//Q2
		a = 0;

		b = 0;

		c = 0;

		d = 0;

		e = 0f;

		f = 0.0d;

		g = '\u0000';

		h = null;

		i = false;



		//Q3
		a = 10;

		b = 100;

		c = 1000;

		d = 10000;

		e = 9.5f;

		f = 10.5d;

		g = 'a';

		h = "ハロー";

		i = false;


		//Q4
		long Q1 = a + b + c + d;
		System.out.println(Q1);

		double Q2 = e + f;
		System.out.println(Q2);

		System.out.println(g + " " + h + " " + i);

		double Q3 = Q1 + Q2;
		System.out.println(Q3);

		long Q4 = a * b * c * d;
		System.out.println(Q4);

		double Q5 = f / 100;
		System.out.println(Q5);

		int Q6 = a - b;
		System.out.println(Q6);


		//Q5
		String num = "20";

		String num1 = "23";

		System.out.println("ハローJAVA" + (num + num1));


		//Q6
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

		//Q7
		double bmi =weight / Math.pow(height / 100, 2);
		bmi = (double)Math.round(bmi *10)/10;
		System.out.println("BMIは" + bmi + "です");


		//Q8
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

		double bmi2 =weight / Math.pow(height / 100, 2);
		bmi2 = (double)Math.round(bmi2 *10)/10;
		System.out.println("BMIは" + bmi2 + "です");


		//Q9
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");

		age = age + age;
		System.out.println("年齢は" + age + "歳です");

		height = height + height;
		System.out.println("身長は" + height + "cmです");

		weight = weight + weight;
		System.out.println("体重は" + weight + "kgです");

		favorite = "オムライス";
		System.out.println("好きな食べ物は" + favorite + "です");

		double bmi3 =weight / Math.pow(height / 100, 2);
		bmi3 = (double)Math.round(bmi3 *10)/10;
		System.out.println("BMIは" + bmi3 + "です");


		//Q10
		age = 24;

		height = 168.5;

		weight = 64.2;
		boolean flg = age >= 25 ? true : false;
		System.out.println(flg);


		//Q11
		String age2 = String.valueOf(age);
		System.out.println(age2);

		String height2 = String.valueOf(height);
		System.out.println(height2);

		String weight2 = String.valueOf(weight);
		System.out.println(weight2);


		//Q12
		int age3 = Integer.valueOf(age2);
		System.out.println(age3);

		double height3 = Double.parseDouble(height2);
		// System.out.println(Math.round(height3));
		int height4 = (int)height3;
		System.out.println(height4);


		//Q13
		boolean flg2 = age3 >= 25 ? true : height4 >= 160 ? true:false;
		System.out.println(flg2);

	}
}

