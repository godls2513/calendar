package lamda;

public class LamdaExam2 {

	public static void main(String[] args) {
//		()->{ ..... } 부분이 람다식, 다른말로 익명 메소드
		new Thread(()->{
			for(int i=0; i<10; i++) {
				System.out.println("hello");
			}
		}).start();
	}

}
