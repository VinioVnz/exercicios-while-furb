import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorFinal = 0;
        double valorTotal = 0;
        while (true) {
            System.out.println("Digite o valor da compra: ");
            double valorCompra = input.nextDouble();
            if(valorCompra == 0){
                break;
            }
            if(valorCompra > 500){
                valorFinal = valorCompra - (valorCompra * 0.20);
            }else if(valorCompra <= 500){
                valorFinal = valorCompra - (valorCompra *0.15);
            }
            valorTotal += valorFinal;
            System.out.println("Valor a pagar:"+valorFinal);


        }
        input.close();
        System.out.println("O valor total recebido foi de "+valorTotal);
    }
}
