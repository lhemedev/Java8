package br.com.alura.java8;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementacao de exemplo de Lambdas
 * @author luizh
 *
 */
public class OrdenaStrings2 {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.forEach(s -> System.out.println(s));
	}
}
