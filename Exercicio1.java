import java.util.Locale;

public class Exercicio1 {

    public static void main(String[] args){

        // Declaração de variáveis para os produtos
        String product1 = "Computer";
        String product2 = "Office Desk";

        // Declaração de variáveis de idade, código e gênero
        int age = 30;
        int code = 5290;
        char gender = 'F';

        // Declaração de variáveis de preço e medida
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Exibir informações dos produtos com formatação de preço
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", product1, price1);
        System.out.printf("%s, which price is $%.2f%n", product2, price2);

        // Exibir o registro de idade, código e gênero
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

        // Exibir a medida com 8 casas decimais
        System.out.printf("Measure with decimal places: %.8f%n", measure);

        // Exibir a medida arredondada para 3 casas decimais
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        // Alterar o padrão de localidade para os EUA e exibir a medida com ponto decimal dos EUA
        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal Point: %.2f%n", measure);
    }
}
