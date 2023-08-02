package telran.perfomance;

public abstract class PerfomanceTest {
	protected String testName;
	protected int nRuns;

	public PerfomanceTest(String testName, int nRuns) {
		this.testName = testName;
		this.nRuns = nRuns;
	}

	protected abstract void runTest();

	public void run() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nRuns; i++) {
			runTest();
		}
		long endTime = System.currentTimeMillis();
		float runningTime = (endTime - startTime) * 1000;
		System.out.println(
				"nRuns: " + nRuns + ";" + "testName: " + testName + ";" + "running time sec: " + runningTime + ";");
	}
}
