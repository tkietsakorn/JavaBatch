
public class Student {
	
	public static void main(String[] args) {
		
		int marks = 75;
		
		if(marks>=75) {
			System.out.println("Distinction");
//			if() {
//				
//			}
		} else if(marks>=35 && marks<75) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		char grade ='B';
		
		switch(grade){
			case 'A':
				System.out.println("Grade A");
				break;
			case 'B':
				System.out.println("Grade B");
				break;
			default:
				System.out.println("Thanks for the Test!");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("i ="+i);
		}
		
		int count = 0;
		while(count!=10) {
			count++;
			System.out.println("Count ="+count);
		}
		
		count = 5;
		do {
			System.out.println("Do While - "+count);
			count++;
		}while(count<2);
	}

}
