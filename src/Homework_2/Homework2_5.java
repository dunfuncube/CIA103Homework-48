package Homework_2;
// 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一支程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class Homework2_5 {
	
	public static void main(String[] args) {
		int l;
		for (l= 1; l <= 39; l++) {
			if (l % 10 == 4) {
				continue;
			}
			System.out.print(l + " ");
		}
		
	}
	
}
