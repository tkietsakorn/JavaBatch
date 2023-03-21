import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6);
		
		//Without Lambda - using annonymous class
		System.out.println(number.stream().filter(null));
		
	}

}
