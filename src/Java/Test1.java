package Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> testset= new HashSet<>();
		testset.add("Test");
		testset.add("Test1");
		testset.add("Test2");
		testset.add("Test3");
		
		Iterator<String> itr= testset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	
	}

}
