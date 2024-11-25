package Homework_4;

import java.util.Scanner;
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
//員工編號：  25    32    8    19    27
//身上現金： 2500  800   500  1000  1200
//請設計一支程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數
//例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
//(提示：Scanner，二維陣列)
public class Homework4_4 {
	
	public static void main(String[] args) {
		int[][] colleage = {
							{25, 32, 8, 19, 27},
							{2500, 800, 500, 1000, 1200}
						   };
		System.out.println("今天要借多少錢？");
		Scanner sc = new Scanner(System.in);
		int needToBorrow = sc.nextInt();
		
		String friendlyColleage = " ";
		int count = 0;
		
		for (int i = 0; i < colleage[0].length; i++) {
			if (colleage[1][i] >= needToBorrow) {
				friendlyColleage += colleage[0][i] + " ";
				count++;
			}
		}
		
		if (count > 0) {
			System.out.println("可以跟 " + friendlyColleage + "借");
			System.out.println("共有 " + count + " 個同事");
		}else {
			System.out.println("So sad... 今天沒有同事可以借");
		}
		sc.close();
	}

}
