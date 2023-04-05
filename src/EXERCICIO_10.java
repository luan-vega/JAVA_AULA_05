import java.util.Scanner;

public class EXERCICIO_10 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um primeiro número:");
        numero1 = entrada.nextInt();
        System.out.println("Informe um segundo " +
                "número, maior que o primeiro");
        numero2 = entrada.nextInt();
        for (numero1 = numero1; numero1 <= numero2; numero1++) {
            if (numero1 % 2 == 0) {
                System.out.println(numero1 + " é par");
            } else {
                System.out.println(numero1 + " é impar");
            }
        }
        while (numero1 <= numero2) {
            if (numero1 % 2 == 0) {
                System.out.println(numero1 + " é par");
            } else {
                System.out.println(numero1 + " é impar");
            }
            numero1++;
        }

    }
}
