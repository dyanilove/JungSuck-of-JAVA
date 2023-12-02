package CollectionFrameWork;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EX05_스택과큐의활용 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
//		▶ 스택 활용 예
//			: 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
		
//		▶ 큐의 활용 예
//			: 최근 사용 문서, 인쇄작업 대기목록, 버퍼(buffer)
		

		Stack st = new Stack();
		String expression = "((3+8)*5-3)"; //args[0];

		System.out.println("expression:" + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}

			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		} // try
		
//		===============================================
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while(true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);  
				String input = s.nextLine().trim();

				if("".equals(input)) continue;

				if(input.equalsIgnoreCase("q")) {
					System.exit(0);	// 프로그램 종료
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "
                                                  + MAX_SIZE +"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i=0; 	
					save(input);  	// 입력받은 명령어를 저장하고,  

					// LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q;
					
					ListIterator it = tmp.listIterator();

					while(it.hasNext())
						System.out.println(++i+"."+it.next());
				} else {
					save(input);    
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
		} // while(true)
		public static void save(String input) {
			// queue에 저장한다.
			if(!"".equals(input))
	          q.offer(input);

			// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
			if(q.size() > MAX_SIZE)  // size()는 Collection인터페이스에 정의
				q.remove();
	}
	

}
