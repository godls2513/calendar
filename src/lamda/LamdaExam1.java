package lamda;

public class LamdaExam1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("hello");
				}
			}
		}).start();
	}

}
