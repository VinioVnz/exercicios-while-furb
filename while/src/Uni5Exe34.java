import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int encerradas = 0;
        boolean saida = false;
        do {
        System.out.println(" Escolha uma opção:" + //
                        "(1) encerrar a conta de um hóspede;\r\n" + //
                        "(2) verificar número de contas encerradas;\r\n" + //
                        "(3) sair.");
        int opcao = input.nextInt();


        switch (opcao) {
            case 1:
            System.out.println("Digite seu nome: ");
            String nome = input.next();
    
            System.out.println("Digite o numero de diarias: ");
            int diarias = input.nextInt();
            
            if(diarias < 15){
                total = diarias * 7.50;
            }else if(diarias == 15){
                total = diarias * 6.50;
            }else{
                total = diarias * 5;
            }
            System.out.println("Obrigado pela preferencia "+nome+ ",total a ser pago: R$"+total);
            encerradas++;
                break;
            case 2:
            System.out.println(encerradas+" pessoas deixaram o hotel");
                break;
            case 3:
                saida = true;
                break;
        
            default:
            System.out.println("Opção invalida");
                break;
        }
        } while (!saida);
        input.close();
    }
}
