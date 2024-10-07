package Birds;

public class Duck extends Birds {

	public Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void memorize() {
		// TODO Auto-generated method stub
		System.out.println("Can not memorize !");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Can fly 5 to 10 meters.");
		
	}

}
