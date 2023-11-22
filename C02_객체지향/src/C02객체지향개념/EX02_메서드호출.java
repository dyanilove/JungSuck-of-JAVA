package C02객체지향개념;

class MyMath{
	long add(long a, long b) {
		long result = a +b;
		return result;
//		return a + b;	// 위 두줄을 표현
	}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double devide(double a, double b) {return a /b;}
}
public class EX02_메서드호출 {

//	메서드이름(값1, 값2, ...);	// 메서드를 호출하는 방법
	
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(2L, 9L);
		long result2 = mm.subtract(2L, 9L);
		long result3 = mm.multiply(2L, 9L);
		double result4 = mm.devide(2L, 9L);
		
		System.out.println("result 1: " + result1);
		System.out.println("result 2: " + result2);
		System.out.println("result 3: " + result3);
		System.out.println("result 4: " + result4);
	}
	

}
