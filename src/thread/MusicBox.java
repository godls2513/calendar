package thread;

public class MusicBox {
	public synchronized void MusicBoxA() {
		for(int i=0; i<10; i++) {
			System.out.println("팝!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public  void MusicBoxB() {
		for(int i=0; i<10; i++) {
			synchronized(this) {
				System.out.println("발라드!!");
				
			}
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public  void MusicBoxC() {
		for(int i=0; i<10; i++) {
			System.out.println("힙합!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
