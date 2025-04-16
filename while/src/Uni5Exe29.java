import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a cedula");
        int valor = input.nextInt();
        
        input.close();
        
        int nota1 = 1;
        int nota2 = 2;
        int nota5 = 5;
        int nota10 = 10;
        int nota20 = 20;
        int qtNota1 = 0;
        int qtNota2 = 0;
        int qtNota5 = 0;
        int qtNota10 = 0;
        int qtNota20= 0;
        


        while (valor - nota20 >= 0) {
            valor -= nota20;
            qtNota20++;
        }
        while (valor - nota10 >= 0) {
            valor -= nota10;
            qtNota10++;
        }
        while (valor - nota5 >= 0) {
            valor -= nota5;
            qtNota5++;
        }
        while (valor - nota2 >= 0) {
            valor -= nota2;
            qtNota2++;
        }
        while (valor - nota1 >= 0) {
            valor -= nota1;
            qtNota1++;
        }
        System.out.println("Notas de 20: "+qtNota20);
        System.out.println("Notas de 10: "+qtNota10);
        System.out.println("Notas de 5: "+qtNota5);
        System.out.println("Notas de 2: "+qtNota2);
        System.out.println("Notas de 1: "+qtNota1);
          
        
    }
}
