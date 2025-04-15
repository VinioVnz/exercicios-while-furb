import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = 0;
        double somaMuie = 0;
        double somaGrupo = 0;
        int contadorMuie = 0;
        int contador = 0;
        
        do {
            System.out.println("Digite a altura: ");
             altura = input.nextDouble();
             if(altura == 0){
                break;
             }

            System.out.println("Digite o genero: "); 
            String genero = input.next();
            String generoMaiusculo = genero.toUpperCase();

            if(generoMaiusculo.equals("F")){
                somaMuie += altura; 
                contadorMuie++; 
            } 
            somaGrupo += altura;
            contador++;    
        } while (altura != 0);
        input.close();
        double mediaMuie = somaMuie/contadorMuie;
        double mediaGrupo = somaGrupo/contador;

        System.out.println("A média da altura das mulheres é: "+mediaMuie);
        System.out.println("A média de altura do grupo é: "+mediaGrupo);
        
    }
}
