package example4;

public class ScoreRecorder extends Thread {

	private int i = 0;

	public void run() {
		startRecording();
	}
	
	public int getScorce() {
		return i;
	}

	public void startRecording() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
