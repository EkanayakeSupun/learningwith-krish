public class RunnableImplementation implements Runnable{


	@Override
	public void run(){
	 System.out.println("Runnable Implementation");	
	}

}

class Test{
	public static void main(String[]args){
	
	RunnableImplementation r=new RunnableImplementation();

	Thread t=new Thread(r);
	t.start();	

	}
}