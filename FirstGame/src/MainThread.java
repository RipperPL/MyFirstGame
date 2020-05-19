

public class MainThread implements Runnable{

 private boolean isRunning = false;
 private double startTime;
 private double currentTime;
 private double passedTime;
 private int fps;
 
 private final double step = 1E9; 
 Thread gameThread;
 
 MainThread(Thread inputThread){
//	"dependency injection?" 
	this.gameThread = inputThread;
 	}
 
 	public void start( ){
 		this.isRunning = true;
 		this.startTime = System.nanoTime()/step;
 		this.run();
 	}
 
	public void stop() {
//		TODO -  HANDLE  USER ACTIONS 
	}

	public void run() {	
		
		while (isRunning ) {
			currentTime = System.nanoTime()/step;
			passedTime = currentTime - startTime;
			this.refresh_output(); //render graphics 
			fps++;
			if (passedTime >= 1) {
				//reset timer 
				System.out.print("fps " + fps + "\n");
				this.startTime = System.nanoTime()/step;
				fps = 0;
			}

		}
	}

	public void refresh_output() {
//		TODO - Read about graphic outputs
		
	}
	
	
	
}
