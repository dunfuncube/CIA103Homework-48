package Homework_1;
// 請設計一支Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
public class Homework1_2 {
	
	public static void main(String[] args) {
		int totalEggs = 200; //
		int perDozen = 12;
		int dozens = totalEggs / perDozen;
		int remaining = totalEggs % perDozen;
		
		System.out.println("200 顆蛋是 " + dozens + " 打 " + remaining + " 顆");
		
	}

}
