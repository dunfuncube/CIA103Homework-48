package Homework_2;
//請設計一支Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
public class Homework2_4 {
	
	public static void main(String[] args) {
		int i;
//		int sum = 0;
//		// 計算奇數和
//		for(i = 0; i < 20; i++) {
//			if(i % 2 != 0) {
//				sum += i;
//				System.out.print(sum + " ");
//			}
//		}
		
		// 計算 1~10 的平方
		for (i = 1; i <= 10; i++) {
			int square = i * i;
			System.out.print(square + " ");
		}
		
	}

}
