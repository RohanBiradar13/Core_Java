package threads4;

public class RunnableTask implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started execu");
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Exce counter # "+i+" exec by "+Thread.currentThread());
				Thread.sleep(500);
			}
		}catch (Exception e) {
		System.out.println("err in "+Thread.currentThread()+"exc "+e);
	}
		System.out.println(Thread.currentThread().getName()+" completed exce");
	
}
	
}