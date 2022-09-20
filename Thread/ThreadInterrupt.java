public class ThreadInterrupt extends Thread{
	@Override
	public void run(){
		     try{
		      sleep(10000);
		    }catch(InterruptedException e){
		      System.out.println("Still awaike");
		     }

		for(int i=0; i<10; i++){
		    
		  System.out.println("Child "+i);
		}
	}
}

class Test{
	public static void main(String args[]) throws InterruptedException{
	  ThreadInterrupt t=new ThreadInterrupt();
	  t.start();
	  t.interrupt();

	    for(int i=0; i<10; i++){
		
		System.out.println("Main "+i);
	    }

	}
}