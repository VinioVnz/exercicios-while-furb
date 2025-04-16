import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o numero pra decompor: ");
        int numero = input.nextInt();
        int divisor = 2;
        input.close();
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.printf("%-8d %d\n", numero, divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }
        System.out.println("1");
    }
}
