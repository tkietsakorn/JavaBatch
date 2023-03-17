import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> phoneDirectory = new HashMap<Integer, String>();
		phoneDirectory.put(878787, "Jack");
		phoneDirectory.put(658765, "Sonia");
		phoneDirectory.put(878787, "ABC");

		System.out.println(phoneDirectory);
		
		for(Entry<Integer, String> entry : phoneDirectory.entrySet()) {
			System.out.println(entry);
		}
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.sort(null);
		Collections.sort(arrList);

		for(Object a: arrList) {
//			System.out.println(a*10);
		}
		
		List arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);

		for(Object a: arrList) {
//			System.out.println(a*10);
		}
		
		

	}

}
