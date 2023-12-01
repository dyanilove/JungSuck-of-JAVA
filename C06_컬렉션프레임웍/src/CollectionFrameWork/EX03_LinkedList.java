package CollectionFrameWork;

public class EX03_LinkedList {
	public static void main(String[] args) {
//		배열의 장단점
//		 ▶ 장점 : 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근시간, access time)이 짧다.
//		 ▶ 단점 : 크기를 변경할 수 없다.
//				 - 크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야함.
//				 - 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비됨.
//		 ▶ 단점 : 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.
//				 - 데이터를 추가하거나 삭제하기 위해, 다른 데이터를 옮겨야 함.
//				 - 그러나 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.
		
//		LinkedList - 배열의 단점을 보완
//			: 배열과 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결(link)
//			: 데이터의 삭제 - 단 한번의 참조변경만으로 가능
//			: 데이터의 추가 - 한번의 Node객체생성과 두 번의 참조변경만으로 가능

//			▶ 단점 : 데이터 접근성이 나쁨
//		더블리 링크드 리스트(doubly linked list) : 이중 연결리스트, 접근성 향상
//		더블리 써큘러 링크드 리스트(doubly circular linked list) : 이중 원형 연결리스트
		
//		※Arralyist  VS  LinkedList - 성능 비교※
//			① 순차적으로 데이터를 추가/삭제 - Arryalist가 빠름
//			② 비순차적으로 데이터를 추가/삭제 - LinkedList가 빠름
//			③ 접근시간 - ArrayList가 빠름
		
	}

}
