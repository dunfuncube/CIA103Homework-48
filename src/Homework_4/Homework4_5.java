package Homework_4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
public class Homework4_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年份：");
		int year = sc.nextInt();
		System.out.println("請輸入月份：");
		int month = sc.nextInt();
		System.out.println("請輸入日期：");
		int day = sc.nextInt();
		
		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("輸入的日期超出範圍，請重新輸入正確的日期！");
		}else {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				dayOfMonth[1] = 29;
			}
			if (day > dayOfMonth[month - 1]) {
				System.out.println("日期超過當月天數，請重新輸入！");
			}else {
				for (int i = 0; i < month - 1; i++) {
					count += dayOfMonth[i];
				}
				count += day;
				System.out.println(year + " 年 " + month + " 月 " + day + " 日為當年度的第 " + count + " 天 ");
			}
		}
		sc.close();
	}

}
