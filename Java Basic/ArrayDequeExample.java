import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		Deque<Integer> arrDeque = new ArrayDeque<Integer>();
		arrDeque.addFirst(1);
		arrDeque.addLast(4);
		arrDeque.addLast(8);
		arrDeque.addFirst(3);
		
		System.out.println(arrDeque);
	}

}
