package Homework_4;
//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如：String s = “Hello World”，執行結果即為dlroW olleH
import java.util.Scanner;

public class Homework4_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一段想反轉的文字：");
		String s = sc.nextLine();
		String re = "";
		for (int i = 0; i < s.length(); i++) {
			re += s.charAt(s.length() - i - 1);
		}
		System.out.println(re);
		sc.close();
	}

}
