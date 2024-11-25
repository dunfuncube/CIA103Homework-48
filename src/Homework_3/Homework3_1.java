package Homework_3;
//請設計一支程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷) 
import java.util.Scanner;

public class Homework3_1 {
	
	public static void main(String[] args) {
//		int i;       // 宣告一個int變數;
//		double d;    // 宣告一個double變數;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
//		if(sc.hasNextInt()) {     //系統判斷鍵盤輸入是否為int整數，結果為布林值
//			i = sc.nextInt();     //sc.nextInt()即會取得輸入的數字，並指定給i
//		}
//		if(sc.hasNextDouble()) {  //系統判斷鍵盤輸入是否為float浮點數，結果為布林值
//			d = sc.nextDouble();  //sc.nextDouble()即會取得輸入的浮點數，並指定給d
//		}
//		構成三角形存在條件:任兩邊相加大於第三邊，且皆不可為0
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b && b == c && (a != 0 || b != 0 || c != 0)) {
			System.out.println("這是正三角形");
		}
		else if(a == b || b == c || a == c && (a != 0 || b != 0 || c != 0)) {
			System.out.println("這是等腰三角形");
		}
//		else if(a != 0 || b != 0 || c != 0 && (( a * a + b * b == c * c) || (b * b + c * c == a *a) || (a * a + c * c == b * b))) {
//			System.out.println("這是直角三角形");
//		}
		else if( (a != 0 || b != 0 || c != 0)){
			System.out.println("這是其他三角形");
		}
		else{
			System.out.println("這不是三角形");
		}sc.close();
	}
	
}
