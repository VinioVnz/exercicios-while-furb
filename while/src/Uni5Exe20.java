import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a massa inicial em kg: ");

        double massaKg = input.nextDouble();
        double massaGrama = massaKg * 1000;
        double massaInicial = massaGrama;

        int contador = 0;

        while (massaInicial >= 0.5) {
            massaGrama /= 2;
            contador++;
        }
        input.close();
        System.out.println("Massa inicial "+massaInicial+"g");
        System.out.println("Massa final "+massaGrama+"");
        System.out.println("Demorou "+contador*50+"s");
    }
}   
