package stopwatch;

public class Watch {
	//
	private long startTime;
	private long endTime;

	public void start() {
		//
		this.startTime = System.nanoTime();
	}

	public void stop() {
		//
		this.endTime = System.nanoTime();
	}

	public void totalTime() {
		//
		stop();
		System.out.println(endTime - startTime + "ms");
	}
}
