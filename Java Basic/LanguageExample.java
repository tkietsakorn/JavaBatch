import java.io.Serializable;

interface Language{
	void getName(String name);
	void numOfWords();
	
	default void getSyntax() {
		System.out.println("I have this Syntax.");
	}
}
interface Program{
	void getName(String name);
	void numOfWords();
	
//	default void getSyntax() {
//		System.out.println("I have this Syntax in Program");
//	}
}

class ProgrammingLanguage implements Language,Program{

	@Override
	public void getName(String name) {
		System.out.println("Programming Language - "+name);
	}

	@Override
	public void numOfWords() {
		System.out.println("I have 10k words!");
	}
	
}


public class LanguageExample implements Serializable {
	
	public static void main(String[] args) {
//		Language language = new Language();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.getName("Java");
		
	}

}
