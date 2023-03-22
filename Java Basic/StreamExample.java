import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6);
		
		//Without Lambda - using annonymous class
		System.out.println(number.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t%2 ==0;
			}
		}).map(new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		}).collect(Collectors.toList()));
		
		
		//With Lambda
		System.out.println(number.stream().filter(t -> {
			System.out.println("In Filter for "+ t);
			return t%2==0;}).map(t -> {
				System.out.println("In Map for "+ t);
				return t*t;}).collect(Collectors.toList())
				);
		
		List<String> names = Arrays.asList("Json","Polymorphism","Object","Class","Java");
		System.out.println(names.stream().filter(s -> s.startsWith("J")).sorted().collect(Collectors.toList()));
		
		names.stream()
		.filter(p -> p.startsWith("C") && p.length()>3)
		.map(p -> p.toUpperCase())
		.sorted()
		.forEach(p -> System.out.println(p));
		
		System.out.println(number.stream().filter(x -> x%2 == 0).reduce(10,(ans,i) -> ans+i ));
		
	}

}
