public class main {

	public static void main(String[] args) {
		
		Thread gameThread;
		gameThread = new Thread();
		MainThread mainThread = new MainThread(gameThread);
		mainThread.start();
	}

}
