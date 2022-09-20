public class ThreadSleep extends Thread{
	@Override
	public void run(){
	  for(int i=0; i<10; i++){
		try{
			sleep(1000);
		}catch(InterruptedException e){
		  System.out.println(e);
		}
	       System.out.println(i);
	    }
	}
}

class Test{
	public static void main(String []args){
		ThreadSleep t=new ThreadSleep();
		t.start();
	}
}