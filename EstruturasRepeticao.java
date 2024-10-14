import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    int numero = sc.nextInt();

    for (int i=0;i<numero;i++){
        System.out.println("Percorri varias vezes" + i);
        sc.close();
    }

    }       
}
