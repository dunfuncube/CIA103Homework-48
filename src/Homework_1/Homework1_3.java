package Homework_1;
// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Homework1_3 {
	
	public static void main(String[] args) {
		int totalSec = 256559;
		int secPerHour = 60 * 60;
		int secPerDay = secPerHour * 24;
		
		System.out.println("一小時有 " + secPerHour + " 秒。");
		System.out.println("一天有 " + secPerDay + " 秒。");
		
		int days = totalSec / secPerDay;
		int remainingSecAfterDays = totalSec % secPerDay;
		int hours = remainingSecAfterDays / secPerHour;
		int remainingSecAfterHours = remainingSecAfterDays % secPerHour;
		int minutes = remainingSecAfterHours / 60;
		int seconds = remainingSecAfterHours % 60;
		
		System.out.println("256559 秒是 " + days + " 天 " + hours + " 小時 " + minutes + " 分 " + seconds + " 秒 ");
	}

}
