package br.com.alura.java8;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementacao de exemplo de Method Reference
 * @author luizh
 *
 */
public class OrdenaStrings3 {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//palavras.sort(comparing(String :: length));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(System.out::println);
	}
}
