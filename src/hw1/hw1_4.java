package hw1;
// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class hw1_4 {
	
	public static void main(String[] args) {
		final double PI = 3.1415;
		double radius = 5;
		double circleArea = radius * radius * PI;
		double circumference = radius * 2 * PI;
		
		System.out.println("半徑為 " + radius + " 的圓面積為 " + circleArea);
		System.out.println("半徑為 " + radius + " 的圓周長為 " + circumference);
	}

}
