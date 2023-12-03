package 열거형;

//				  0		1	   2	 3
enum Direction {EAST, SOUTH, WEST, NORTH};	// 열거형 정의

public class EX01_열거형 {
	public static void main(String[] args) {
//		열거형(enum)
//			: 관련된 상수들을 같이 묶어 놓은 것. JAVA는 타입에 안전한 열거형을 제공

//		열거형 정의하는 방법
//			: enum 열거형이름 {상수명1, 상수명2, ...};
		
//		열거형 타입의 변수를 선언하고 사용하는 방법
		class Unit{
			int x,y;
			Direction dir;
			
			void init() {
				dir = Direction.EAST;
			}
		}
		
//		열거형 상수의 비교에 ==와 compareTo()사용가능
		
//		======================================================
		Direction d1 = Direction.EAST;		// 열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2));	// FLASE
		System.out.println("d1==d3 ? "+ (d1==d3));	// TRUE
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러. 객체이기 때문
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

		switch(d1) {
			case EAST: // Direction.EAST라고 쓸 수 없음(외우셈)
				System.out.println("The direction is EAST."); break;
			case SOUTH:
				System.out.println("The direction is SOUTH."); break;
			case WEST:
				System.out.println("The direction is WEST."); break;
			case NORTH:
				System.out.println("The direction is NORTH."); break;
			default:
				System.out.println("Invalid direction."); break;
		}

		Direction[] dArr = Direction.values();	// values -> 열거형의 모든 상수를 배열로 반환

		for(Direction d : dArr)  // for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); 	// ordinal -> 순서
	}
}
