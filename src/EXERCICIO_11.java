import java.util.Scanner;

public class EXERCICIO_11 {

    public static void main(String[] args) {
        int quantAlunos;
        double nota;
        double media=0;
        double somatorio=0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos:");
        quantAlunos = leitura.nextInt();

        for (int i=1; i<=quantAlunos; i++) {
            System.out.println("Informe a média do " + i + ".° aluno:");
            nota = leitura.nextDouble();
            somatorio = somatorio + nota;
        }
        media = somatorio/quantAlunos;
        System.out.println("Média geral dos alunos:" + media);

    }


}
