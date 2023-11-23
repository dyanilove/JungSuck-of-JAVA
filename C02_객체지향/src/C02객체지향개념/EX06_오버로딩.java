package C02객체지향개념;


public class EX06_오버로딩 {

//	오버로딩(overloading)
//	: 사전적 의미로는 '과적하다'
//	: 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것
	
//	오버로딩이 성립하기 위한 조건
//	1. 메서드 이름이 같아야 함
//	2. 매개변수의 개수 또는 타입이 달라야 함
//	3. 반환 타입은 영향없다.
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과" + mm.add(3,3));
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과 " +mm.add(a));
	}

	
}
class MyMath3{
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a +b;
	}
	long add(long a, long b) {
		System.out.println("long add(int a, int b) -");
		return a + b;
	}
	int add(int[] a) {
		System.out.println("int add(int[] a) -");
		int result =0;
		for(int i=0;i<a.length;i++)
			result += a[i];
		return result;
	}
}
