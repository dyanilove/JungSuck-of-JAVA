package 람다;

import java.util.function.Function;

public class EX05_메서드참조 {
	public static void main(String[] args) {
//		하나의 메서드만 호출하는 람다식은 '메서드 참조'로 간단히 할 수 있다.
//			1. static 메서드 참조	: ClassName::method
//			2. 인스턴스 메서드 참조	: ClassName::method

//		Integer method(String s) {
//			return Integer.parseInt(s)
//		}
//		↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
//		Function<String, Integer> f = (String s)->Integer.parseInt(s);
//		↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
//		Function<String, Integer> f = Integer::parseInt;	// 메서드 참조
		
//		생성자의 메서드 참조
//			매개변수 없는 경우
//		Supplier<MyClass> s = () -> new MyClass();
//		↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
//		Supplier<MyClass> s = MyClass::new;
		
//			매개변수 있는 경우
//		Function<Integer, MyClass> s = () -> new MyClass(i);
//		↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
//		Function<Integer, MyClass> s = MyClass::new;
	}
}
