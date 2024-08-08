package threadsasks;

public class EvenPrinterTask implements Runnable {

	private int start;
	private int end;
	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("invoked by "+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		try {
			for(int i = start; i<= end; i++) {
				if(i %2 ==0) {
					System.out.println(Thread.currentThread().getName()+" exceuted by "+i);
				}
				Thread.sleep(20);
			}
		}catch (Exception e) {
			System.out.println("err in "+Thread.currentThread().getName()+" "+e);
		
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}
	
}
