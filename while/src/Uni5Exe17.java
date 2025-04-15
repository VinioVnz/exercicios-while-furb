import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaAltura = 0;
        int contador = 0;
        int inscricaoAlto = 0;
        double alturaAlto = 0;
        
        int inscricaoBaixo = 0;
        double alturaBaixo = Double.MAX_VALUE;

        while (true) {
            System.out.println("Digite o numero de inscrição: ");
            int inscricao = input.nextInt();

            if(inscricao == 0){
                break;
            }
            System.out.println("Altura: ");
            double altura = input.nextDouble();
            somaAltura += altura;
            if(altura > alturaAlto){
                alturaAlto = altura;
                inscricaoAlto = inscricao;
            }
            if(altura < alturaBaixo){
                alturaBaixo = altura;
                inscricaoBaixo = inscricao;
            }
            contador++;
        }
        input.close();
        double mediaAltura = somaAltura / contador;
        System.out.println("O atleta mais baixo tem "+alturaBaixo+"m e o seu número de inscrição é "+inscricaoBaixo);
        System.out.println("O atleta mais alto tem "+alturaAlto+"m e o seu número de inscrição é "+inscricaoAlto);
        System.out.println("A altura média do grupo de atletas é: "+mediaAltura);
    }
}
