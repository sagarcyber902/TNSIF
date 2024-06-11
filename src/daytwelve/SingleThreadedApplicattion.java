package daytwelve;

public class SingleThreadedApplicattion {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(".....in main function() ....."+Thread.currentThread());		
		
		MyTask.sayHello(10);
		MyTask.displayEven();
		MyTask.sayHello(5);
		
		System.out.println(".....End of Main.....");
		
		
	}

}