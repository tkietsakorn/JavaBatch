import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<Integer>();
		
		Vector<Integer> vector = new Vector<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		integerList.remove(0);
		integerList.set(0, 5);
		
		for(Integer x: integerList) {
			System.out.println("In For Each Loop: "+x);
		}
		
		Iterator<Integer> iteratorObj = integerList.iterator();
//		iteratorObj.remove();
		
		while(iteratorObj.hasNext()) {
			System.out.println(iteratorObj.next());
			iteratorObj.forEachRemaining((value) -> System.out.println((value*2+" ")));
		}
		
		System.out.println(integerList);

	}

}
