import java.util.Scanner;

public class EXERCICIO_09 {

    public static void main(String[] args) {
        // Calcular a média de idade de dez pessoas
        double i;
        double idade;
        double media=0;
        Scanner entrada = new Scanner (System.in);
        for (i=1;i<=10;i++) {
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            media = media + idade;
        }
        media = media/i;
        System.out.println("Média das idades" + media);
    }

}
