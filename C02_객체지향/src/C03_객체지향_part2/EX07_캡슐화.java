package C03_객체지향_part2;

class Time{
	private int hour;	// 0~23사이의 값 가져야 함
	private int minute;	// 0~59사이의 값 가져야 함 
	private int second;	// 0~59사이의 값 가져야 함
	
	public void setHour(int hour) {
		if(hour<0 ||  hour > 23) return;
		this.hour = hour;
	}
	public int getHour() {return hour;};
}

public class EX07_캡슐화 {
	
//	캡슐화와 접근제어다
//	- 접근 제어자를 사용하는 이유
//		: 외부로부터 데이터를 보호하기 위해
//		: 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
	
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());
			}

}
