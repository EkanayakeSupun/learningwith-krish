public class MultiThreading extends Thread{
	@Override
	public void run(){
	  for(int i=0; i<10; i++){
		System.out.println("Child "+i);
	   }
	}
}

class Test{
	public static void main(String []args){
		MultiThreading t=new MultiThreading();
		t.start();
		
		for(int i=0; i<10; i++){
		  System.out.println("Main "+i);
		}
	}
}