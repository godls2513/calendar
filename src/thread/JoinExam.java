package thread;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 th = new MyThread5();
		th.start();
		System.out.println("시작");
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
