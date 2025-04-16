import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o N: ");
        int N = input.nextInt();

        System.out.print("Digite o K ");
        int K = input.nextInt();

        System.out.print("Digite o M: ");
        int M = input.nextInt();
        input.close();
        
        int valorAtual = N;
        int capacidadeUsada = 0;
        int somaDentro = 0;
        int somaFora = 0;
        String elementos = "";
        String dentro = "";
        String fora = "";

        while (valorAtual > 0) {
            elementos += valorAtual + " ";

            if (capacidadeUsada + valorAtual <= M) {
                dentro += valorAtual + " ";
                somaDentro += valorAtual;
                capacidadeUsada += valorAtual;
            } else {
                fora += valorAtual + " ";
                somaFora += valorAtual;
            }

            valorAtual -= K;
        }

        System.out.println("Elementos a serem colocados na mochila: "+elementos);
        System.out.println("Elementos que entraram na mochila: "+dentro);
        System.out.println("Elementos que ficaram fora da mochila: "+fora);
        System.out.println("Soma dos elementos que entraram na mochila: "+somaDentro);
        System.out.println("Soma dos elementos que não entraram na mochila: "+somaFora);
    }
}
