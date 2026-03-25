package kr.com.beak;

/*
 * Java 프로그래밍은 편짐 -> 컴파일 -> 실행단계를 거쳐 완성
 */

// Hello 클래스 완성
public class Hello {

	//print() 메서드
	public void print(String name) {
		System.out.println("Hello, " + name);
	}
	
	public static void main(String[] args) {
		Hello hello = new Hello(); //new 키워드를 사용해 객체 생성
		hello.print("Java!");
		
	}

}
