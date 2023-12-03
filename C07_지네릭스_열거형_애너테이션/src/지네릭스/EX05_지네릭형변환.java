package 지네릭스;

public class EX05_지네릭형변환 {
	public static void main(String[] args) {
//		지네릭 타입의 형변환
//			: 지네릭 타입과 원시 타입간의 형변환은 바람직 하지 않다.(경고 발생)
		Box<Object> objBox = null;
		Box box =(Box)objBox;	// Ok. 지네릭 타입 -> 원시타입. 경고 발생
		objBox = (Box<Object>)box;	// Ok. 원시타입 -> 지네릭 타입. 경고 발생
		
//			: 와일드 카드가 사용된 지네릭 타입으로는 형변환 가능
//		Box<Object> objBox1 = (Box<Object>)new Box<String>();	// 에러. 형변환 불가능.
		Box<?> wBox = (Box<?>)new Box<String>();	// Ok. 
		Box<?> wBox1 = new Box<String>();			// 위와 동일코드
		
//		=============================================
//		지네릭 타입의 제거
//			: 컴파일러는 지네릭 타입을 제거하고(∵하위호환성때문), 필요한 곳에 형변환을 넣는다.
//			: ① 지네릭 타입의 경계(bound)를 제거
//			: ② 지네릭 타입 제거 후에 타입이 불일치하면, 형변환 추가
//			: ③ 와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가
		
	}
}
