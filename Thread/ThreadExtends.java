public class ThreadExtends extends Thread{

	@Override
	public void run(){
	 System.out.println("Thread Extends");
	}

}

class Test{
	public static void main(String []args){
		ThreadExtends t=new ThreadExtends();
		t.start();
	}
}