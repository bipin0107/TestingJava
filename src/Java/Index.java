package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Index {
	/*[1,1,1,2,2,1]
			O/p index no 3
			 
			[5,3,2,1,2]
			O/p index no 1
			 
			[5,3,2,1,10,11]
			O/p index no 4 */
	public static int count=0;
	
	Index()
	{
		count++;
	}

	public static int count()
	{
		return count;
		
	}
	
	public static void main(String[] args) {
		
		new Index();
		new Index();
		new Index();
		new Index();
		new Index();
		System.out.println("The object count :" +Index.count() );
		
		
		
		
		
		
	}

}
