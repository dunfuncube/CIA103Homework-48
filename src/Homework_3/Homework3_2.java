package Homework_3;

import java.util.Scanner;

//請設計一支程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息。
//(提示：Scanner，亂數方法，無窮迴圈)
public class Homework3_2 {
	
	public static void main(String[] args) {
		int r = (int)(Math.random() * 10);
		
		System.out.println("開始猜數字吧！請輸入一個 0~9 的整數：");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(!sc.hasNextInt()) {
				System.out.println("請輸入範圍 0~9 的整數喔！");
				sc.next();
				continue;
			}			
			int g = sc.nextInt();
			if(g < 0 || g > 9) {
				System.out.println("數字只在 0~9 之間喔！");
			}else if (g != r){
				System.out.println("猜錯囉，請繼續努力，再猜一次！");
			}else {
				System.out.println("Bingo！答案就是 " + r);
				break;
			}
		}
		sc.close();
//
// (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
//		int r = (int)(Math.random() * 101);
//		
//		System.out.println("猜數字開始囉，請輸入一個 0~100 的整數：");
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			if(!sc.hasNextInt()) {
//				System.out.println("輸入錯囉，請輸入範圍 0~100 的整數喔！");
//				sc.next();
//				continue;
//			}
//			int g = sc.nextInt();
//			if(g < 0 || g > 100) {
//				System.out.println("數字範圍是 0~100 喔！");
//			}else if(g < r) {
//				System.out.println("還沒猜對喔，答案大於 " + g + " 喔！");
//			}else if(g > r) {
//				System.out.println("還沒猜對喔，答案小於 " + g + " 喔！");
//			}else {
//				System.out.println("Bingo！答案就是 " + r);
//				break;
//			}
//		}
//		sc.close();
	}
}
