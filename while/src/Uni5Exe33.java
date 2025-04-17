import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean saida = false;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;
       do{
            System.out.println("DIgite o numero do candidato: -0 para fechar");
            int voto = input.nextInt();

            switch (voto) {
                case 1:
                candidato1++;
                System.out.println("Vc votou em candidato 1");
                    break;
                case 2:
                candidato2++;
                System.out.println("Vc votou em candidato 2");
                    break;
                case 3:
                candidato3++;
                System.out.println("Vc votou em candidato 3");
                    break;
                case 4:
                    candidato4++;
                    System.out.println("Vc votou em candidato 4");
                    break;
                case 5:
                    nulo++;
                    System.out.println("Vc votou em nulo");
                    break;
                case 6:
                    branco++;
                    System.out.println("Vc votou em branco");
                    break;
                case 0:
                    saida = true;
                    break;
            
                default:
                System.out.println("Opção inválida,tente novamente");
                    break;
            }
        } while(!saida);
        input.close();
        int total = candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco;
        double c1Porcent = (100 * candidato1) / total;
        double c2Porcent = (100 * candidato2) / total;
        double c3Porcent = (100 * candidato3) / total;
        double c4Porcent = (100 * candidato4) / total;
        double nuloPorcent = (100 * nulo) / total;
        double brancoPorcent = (100 * branco) / total;

        System.out.println("% Candidato 1: "+c1Porcent);
        System.out.println("% Candidato 2: "+c2Porcent);
        System.out.println("% Candidato 3: "+c3Porcent);
        System.out.println("% Candidato 4: "+c4Porcent);
        System.out.println("% nulo: "+nuloPorcent);
        System.out.println("% branco: "+brancoPorcent);
    }
}
