package hw2;
//請設計一支Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
public class hw2_4 {
	
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 0; i < 20; i++) {
			if(i % 2 != 0) {
				sum += i;
				System.out.print(sum + " ");
			}
		}
	}

}
