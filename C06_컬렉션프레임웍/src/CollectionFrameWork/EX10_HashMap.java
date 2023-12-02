package CollectionFrameWork;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EX10_HashMap {
	public static void main(String[] args) {
//		HashMap과 Hashtable - 순서 X, 중복(키 X, 값 O)
//			: Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
//			: HashMap(동기화X)은 Hashtable(동기화O)의 신버전
		
//		▶ HashMap
//			: Map인터페이스를 구현한 대표적인 컬렉션 클래스
//			: 순서를 유지하려면, LinkedHashMap클래스를 사용하면 된다.
		
//		▶ TreeMap (≒ TreeSet)
//			: 범위검색과 정렬에 유리한 컬렉션 클래스
//			: HashMap보다 데이터 추가,삭제에 시간이 더 걸림.
		
//		HashMap의 키와 값
//			: 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
//			: Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		
//		※ 해싱(hashing)
//			: 해시함수로 해시테이블에 테이블을 저장, 검색
//			: 해시테이블은 배열과 LinkedList가 조합된 형태
//			▶ 해시테이블에 저장된 데이터를 가져오는 과정
//				1. 키로 해시함수를 호출해서 해시코드를 얻는다.
//				2. 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾는다.
//				3. 링크드리스트에서 키와 일치하는 데이터를 찾는다.
//				※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야한다.
//				   서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		} // while
		
//		=============================================================
		HashMap map1 = new HashMap();
		map1.put("김자바", 90);
		map1.put("김자바", 100);
		map1.put("이자바", 100);
		map1.put("강자바", 80);
		map1.put("안자바", 90);

		Set set = map1.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map1.keySet();
		System.out.println("참가자 명단 : " + set);

		Collection values = map1.values();
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}
