package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EX04_스택과큐 {
	public static void main(String[] args) {
//		▶ 스택(Stack) : LIFO(후입선출)구조. 마지막에 저장된 것을 제일 먼저 꺼냄
//		▶ 큐(Queue)	 : FIFO(선입선출)구조. 제일 먼저 저장한 것을 제일 먼저 꺼냄(인터페이스)
		
		Stack st = new Stack();
		Queue q = new LinkedList();	// Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
		}
	}

}
