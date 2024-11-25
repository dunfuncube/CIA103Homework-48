package Homework_3;

import java.util.Scanner;

// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討厭哪個數字
// 請設計一支程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數
public class Homework3_3 {

	public static void main(String[] args) {
		int hate = -1;
		int sum = 0;
		System.out.println("請選擇一個範圍是 1~9 不想要的數字：");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			hate = sc.nextInt();
		}
		if (hate >= 1 && hate <= 9) {
			for(int i = 1; i <= 49; i++) {
				if(i / 10 != hate && i % 10 != hate) {
					System.out.print(i + " ");
					sum++;
				}	
			}
		}else {
			System.out.println("請輸入 1~9 的數字喔！");
		}
		
		System.out.println();
		System.out.println("大樂透號碼，總共有 " + sum + "個數字可以選擇！");
		sc.close();
	}
	
// 進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
}
