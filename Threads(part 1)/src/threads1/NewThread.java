package threads1;

public class NewThread extends Thread{
	public NewThread(String newThread) {
		super(newThread);//new thread created
		start();//Runnable(ready or running)
	}
	
	@Override
	public void run() {
		System.out.println(getName()+" started execu");
		try {
			for(int i=0; i<20; i++) {
				System.out.println("Exce counter # "+i+" exec by "+Thread.currentThread());
				Thread.sleep(500);
			}
		}catch (Exception e) {
		System.out.println("err in "+Thread.currentThread()+"exc "+e);
	}
	
}
	
}