package exercicios;

public class Program {
	
	public static void main(String[] args) {
		
	
	
	String original = "abcde FGHIJ ABC abc DEFG ";
	
	String s01 = original.toLowerCase(); // Põe todas as letras em minusculo
	
	String s02 = original.toUpperCase(); // Põe todas as letras em maiusculo
	
	String s03 = original.trim(); // Ignora os espaços
	
	String s04 = original.substring(2); // Pega uma parte da String, no nosso caso, a string em posição 2
	
	String s05 = original.substring(2, 9); // Pega o primeiro e ultimo argumento da String
	
	String s06 = original.replace('a', 'x'); // Escolhe o primeiro argumento e o substitui por outro
	
	String s07 = original.replace("abc", "xy"); // Escolhe a primeira substring e a substitui por outra
	
	int i = original.indexOf("bc"); // Retorna o indice
	
	int j = original.lastIndexOf("bc"); // Retorna o ultimo indice
	
	System.out.println("Original: -" + original + "-");
	
	System.out.println("toLowerCase: -" + s01 + "-");
	
	System.out.println("toUpperCase: -" + s02 + "-");
	
	System.out.println("trim: -" + s03 + "-");
	
	System.out.println("substring(2): -" + s04 + "-");
	
	System.out.println("substring(2, 9): -" + s05 + "-");
	
	System.out.println("replace('a', 'x'): -" + s06 + "-");
	
	System.out.println("replace('abc', 'xy'): -" + s07 + "-");
	
	System.out.println("Index of 'bc': " + i);
	
	System.out.println("Last index of 'bc': " + j);
	
	
	String s = "potato apple lemon orange";
	String[] vect = s.split(" ");
	String word1 = vect[0];
	String word2 = vect[1];
	String word3 = vect[2];
	String word4 = vect[3];
	
	System.out.println(word1);
	System.out.println(word2);
	System.out.println(word3);
	System.out.println(word4);
	
	
	}
}
