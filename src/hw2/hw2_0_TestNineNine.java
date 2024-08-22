package hw2;
// 建立一個TestNineNine.java程式，可輸出九九乘法表
public class hw2_0_TestNineNine {
	
	public static void main(String[] args) {
// 1.使用for迴圈+ while迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}
// 2.使用for迴圈+ do while迴圈
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while(j <= 9);
//			System.out.println();
//		}
//		
// 3.使用while迴圈+ do while迴圈
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}

}
