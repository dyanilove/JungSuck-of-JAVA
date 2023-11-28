package 클래스;

public class EX02_hashCode {

//	hashCode()
//		: 객체의 해시코드(hash code)를 반환하는 메서드
//		: Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
//		: equals()를 오버라이딩 하면, hashCode()도 오버라이딩해야한다.
//		: equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문!!
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
