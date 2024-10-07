package Birds;

public abstract class Birds {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	String name;
	public Birds(String name)
	{
		super();
		this.name=name;
	}

	
	public abstract void memorize();
	public abstract void fly(); 
	
}
