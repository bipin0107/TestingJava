package Birds;

interface F11 {
	
	  void display();

}


class Test implements F11{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Test interface");
	}
	
	public static void main(String[] args )
	{
		
		Test t= new Test();
		t.display();
	}
	
}