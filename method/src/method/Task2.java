package method;

public class Task2 {

	public static void main(String[] args) {
		double triangleArea = getTriangleArea(12.0, 6.0);
		System.out.println("三角形の面積");
		System.out.println(triangleArea);
	}
	public static double getTriangleArea(double bottom, double height) {
		double area =(bottom * height) / 2;
		return area;
	}

}
