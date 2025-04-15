import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Qual é o preço do pedagio maximo?");
        double pedagioMax = input.nextDouble();
        int quantNegaPagar = 0;
        int quantInformados = 0;
        int trecho150Paga = 0;
        while (true) {
            System.out.println("Digite o primeiro pedágio: ");
            double pedagio = input.nextDouble();

            if(pedagio < 0){
                break;
            }
            System.out.println("Digite a distancia: ");
            double distancia = input.nextDouble();
            
            if(pedagio > pedagioMax){
                quantNegaPagar++;
            }
            quantInformados++;
            if(distancia > 150 && pedagio <= pedagioMax){
                trecho150Paga++;
            }
        } 
        input.close();
        System.out.println("Trecho acima do valor maximo: "+quantNegaPagar);
        System.out.println("Trechos informados: "+quantInformados);
        System.out.println("Trechos acima de 150km abaixo do valor maximo: "+trecho150Paga);
    }
}
