import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("J","A","V","B","C","K");
		
		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);
		
		//JAVBCK
		//BCJKVA
		//BCJKAV

	}

}
