import java.util.Scanner;

public class Uni5Exe15 {
    /* 
     * Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno.
     *  Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";
        String nome1 = "";
        while (!nome1.equals("fim")) {
            System.out.println("Digite o nome do aluno:");
            nome = input.next();

            System.out.println("Digite a nota 1: ");
            double nota1 = input.nextDouble();
            
            System.out.println("Digite a nota 2: ");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) /2;

            System.out.println("A media do(a) "+nome+" é "+ media);

            System.out.println("Digite o nome do aluno:");
            nome1 = input.next();

        }
        input.close();
    }
}
