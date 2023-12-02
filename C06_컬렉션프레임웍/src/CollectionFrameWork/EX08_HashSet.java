package CollectionFrameWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class EX08_HashSet {
	public static void main(String[] args) {
//		HashSet() - 순서 X, 중복 X
//			: Set인터페이스를 구현한 대표적인 컬렉션 클래스
//			: 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.
//		TreeSet() : 범위 검색과 정렬에 유리한 컬렉션 클래스
//				  : HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
		
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i < objArr.length; i++) {
			System.out.println(objArr[i]+" = " +set.add(objArr[i]));
			set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
		}
        // HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);	

		// HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		
//		======================================
		
		Set set2 = new HashSet();
		
		// set의 크기가 6보다 작은 동안 1~45난수 저장
		for(int i = 0; set2.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
//			set.add(new Integer(num));
			set2.add(num);	// 위랑 동일
		}
		
		List list = new LinkedList(set2);
		Collections.sort(list);
		System.out.println(list);
		
//		======================================
//		HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인해야한다.
//		같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
//		boolean add(Object obj)는 저장할 객체의 equals()와 hashCode()를 호출
//		하지만, equals()와 hashCode()가 오버라이딩 되어 있어야 함.
		HashSet set3 = new HashSet();

		set3.add("abc");
		set3.add("abc");
		set3.add(new Person("David",10));
		set3.add(new Person("David",10));

		System.out.println(set3);
		
	}
}
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// int hash(Object.. values); //가변인자
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public String toString() {
		return name +":"+ age;	
	}
}
