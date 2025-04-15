import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int total = 0;
         int totalCanal4 = 0;
         int totalCanal5 = 0;
         int totalCanal9 = 0;
         int totalCanal12 = 0;

         while (true) {
            System.out.println("Canal: ");
            int canal = input.nextInt();
            if(canal == 0){
                break;
            }
            System.out.println("Pessoas assistindo: ");
            int pessoasAssistindo = input.nextInt();
            total += pessoasAssistindo;

            if(canal == 4){
                totalCanal4 += pessoasAssistindo;
            }
            if(canal == 5){
                totalCanal5 += pessoasAssistindo;
            }
            if(canal == 9){
                totalCanal9 += pessoasAssistindo;
            }
            if(canal == 12){
                totalCanal12 += pessoasAssistindo;
            }


         }
         input.close();
         System.out.println("Percentual de audiência do canal 4:"+(totalCanal4*100)/total);
         System.out.println("Percentual de audiência do canal 5:"+(totalCanal5*100)/total);
         System.out.println("Percentual de audiência do canal 9:"+(totalCanal9*100)/total);
         System.out.println("Percentual de audiência do canal 12:"+(totalCanal12*100)/total);
    }
}
