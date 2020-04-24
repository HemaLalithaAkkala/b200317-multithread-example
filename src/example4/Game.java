package example4;

public class Game extends Thread {

	public void run() {
		play();
	}

	public void play() {
		ScoreRecorder recorder = new ScoreRecorder();
		recorder.start();

		for (int i = 0; i < 1000000; i++) {
			System.out.println("Playing game");
		}

		System.out.println(recorder.getScorce());
		recorder.stop();
	}

}
