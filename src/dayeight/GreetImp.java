package dayeight;

public class GreetImp implements IGreet{

	@Override
	public String sayHello(String name) {
		
		return "Hello "+ name;
	}

}