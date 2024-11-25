package Homework_4;
// 有個一維陣列如下：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
// 請寫出一支程式能輸出此陣列所有元素的平均值與大於平均值的元素
public class Homework4_1 {
	
	public static void main(String[] args) {
		int[] Array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		}
		
		int length = Array.length;		
		double avg = sum / length;
		System.out.println("陣列元素平均值為：" + avg);
		
		System.out.print("陣列內大於所有元素平均值的元素為：" + " ");
		for (int j = 0; j < Array.length; j++) {
			if(Array[j] > avg) {
				System.out.print(Array[j] + " ");
			}
		}
	}
	
}
