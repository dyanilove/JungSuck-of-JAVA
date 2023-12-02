package 지네릭스;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

public class EX03_지네릭스제약 {
	public static void main(String[] args) {
//		제한된 지네릭 클래스
//		 - 지네릭 타입에 'extends'를 사용하면, 특정 타입의 자손들만 대입할 수 있게 제한 할 수 있다.
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();   // 에러.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		
//		=============================================
//		지네릭스 제약
//		 - 타입변수에 대입은 인스턴스 별로 다르게 가능
		Box<Apple> appleBox1 = new Box<Apple>();	// Apple객체만 저장가능
		Box<Grape> grapeBox1 = new Box<Grape>();	// Grape객체만 저장가능
		
//		 - static멤버에 타입 변수 사용 불가
		class Box<T>{
//			static T item;	// 에러
		}
		 
//		 - 배열 생성할 때 타입 변수 사용불가. 타입변수로 배열선언은 가능(new 연산자 다음에 T쓸 수 없음)
		
	}
}
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);     }
	T get(int i)     { return list.get(i); }
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}