package Homework_1;
//請寫一支程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
// 5 + ‘5’
// 5 + “5”
//並請用註解各別說明答案的產生原因
public class Homework1_6 {
	
	public static void main(String[] args) {
		System.out.println(5+5);   //回傳值為10，小括號內兩個5均為數值，故相加後回傳值為10。
		System.out.println(5+'5'); //回傳值為58，小括號內的 5 為數值，'5'使用單引號成為字元(char)，char 可直接轉換為 int，ASCII 編碼為 53，故 5+'5'為 5+53=58。
		System.out.println(5+"5"); //回傳值為55，小括號內的 5 為數值，"5"為字串(String)。
	}

}
