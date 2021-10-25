package thread;

public class MusicExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer mp1 = new MusicPlayer(1, box);
		MusicPlayer mp2 = new MusicPlayer(2, box);
		MusicPlayer mp3 = new MusicPlayer(3, box);
		
		mp1.start();
		mp2.start();
		mp3.start();
	}

}
