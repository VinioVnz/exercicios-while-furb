import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro dia da semana do mes: ");
        int primeiro = input.nextInt();
        
        System.out.println("Digite a quantidade de dias do mes ");
        int n = input.nextInt();
        input.close();

        int dia = 1;
        for (int i = 1; i < primeiro; i++) {
            System.out.print("\t");
        }

        while (dia <= n) {
            System.out.print(dia + "\t");

           
            if ((primeiro - 1 + dia) % 7 == 0) {
                System.out.println();
            }

            dia++;
        }

        System.out.println();
        
    }
}
