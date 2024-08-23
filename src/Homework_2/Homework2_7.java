package Homework_2;
//請設計一支Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Homework2_7 {
	
	public static void main(String[] args) {
		char letter = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(letter);
			}
			letter++;
			System.out.println();
		}
		
	}

}
