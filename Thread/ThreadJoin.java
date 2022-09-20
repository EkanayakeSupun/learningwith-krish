public class ThreadJoin extends Thread{
	@Override
	public void run(){
	   for(int i=0; i<10; i++){
		 
			System.out.println("Child "+i);
		 
	    }
	}
}

class Test{
	public static void main(String []args){
		ThreadJoin t=new ThreadJoin();
		t.start();
	  try{
	  	t.join(); // Join method calling
	  }catch(InterruptedException e){
		System.out.println(e);
	  }

	  for(int i=0; i<10; i++){
	    System.out.println("Main  "+i);
	   }
	}
}