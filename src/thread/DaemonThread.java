package thread;

//Runnable을 구현하는 DaemonThread클래스를 작성
public class DaemonThread implements Runnable {

	 // 무한루프안에서 0.5초씩 쉬면서 데몬쓰레드가 실행중입니다를 출력하도록 run()메소드를 작성
	@Override
	public void run() {
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}

	}

	public static void main(String[] args) {
		// Runnable을 구현하는 DaemonThread를 실행하기 위하여 Thread 생성
		Thread th = new Thread(new DaemonThread());
		// 데몬쓰레드로 설정
		th.setDaemon(true);
		//쓰레드 실행
		th.start();
		
		// 메인 쓰레드가 1초 뒤에 종료되돌록 설정.
		// 데몬 쓸레드는 다른 쓰레드가 모두 종료되면 자동 종료
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다.");
	}

}
