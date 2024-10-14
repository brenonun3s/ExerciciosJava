import java.util.Scanner;


//CÓDIGO CRIADO PARA FIXAÇÃO DO CONTEUDO CONDICIONAL REFERENTE AO OPERADOR TERNÁRIO

public class OperadorTernario{

    public static void main (String[] args) { 

    Scanner sc = new Scanner(System.in);

    double preco = 34.5;
    double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

    System.out.println(desconto);

    sc.close();

    }


}