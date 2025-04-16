import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int diaProdutivo = 0;
        int maiorProducao = 0;
        String periodoProdutivo = "";
        int periodoProdutivoQuant = 0;
        while (true) {
            System.out.println("Digite o dia do mês");
            int dia = input.nextInt();
            if(dia > 0 && dia < 31){
                System.out.println("Digite o total de peças produzidas no turno da manha");
                int quantidadeManha = input.nextInt();
                System.out.println("Digite o total de peças produzidas no turno da tarde");
                int quantidadeTarde = input.nextInt();
                int somaTotal = quantidadeManha + quantidadeTarde;
                double totalReceber = 0;
                if( dia <= 15){
                    if(somaTotal >= 100 && quantidadeManha >=30 && quantidadeTarde >=30){
                        totalReceber = somaTotal * 0.80;
                        System.out.println("R$ "+totalReceber+" (valor recebido)");
                    } else{
                        totalReceber = somaTotal * 0.50;
                        System.out.println("R$ "+totalReceber+" (valor recebido)");
                    }
                } else if(dia >=16){
                    totalReceber = quantidadeManha * 0.40;
                    totalReceber += quantidadeTarde * 0.30;
                    System.out.println("R$ "+totalReceber+" (valor recebido)");
                }
                if(maiorProducao < somaTotal){
                    diaProdutivo = dia;
                    maiorProducao = somaTotal;
                    if(quantidadeManha > quantidadeTarde){
                        periodoProdutivo = "Manha";
                        periodoProdutivoQuant = quantidadeManha;
                        
                    } else {
                        periodoProdutivo = "Tarde";
                        periodoProdutivoQuant = quantidadeTarde;
                    }
                }
                System.out.println("Novo funcionario (1.sim 2.não)?");
                int resposta = input.nextInt();

                if(resposta == 2){
                    break;
                } 
                

            }else{
                System.out.println("Dia invalido");
            }
        }
        input.close();
        System.out.println("Dia maior produção: "+diaProdutivo);
        System.out.println("Periodo funcionario mais produz: "+periodoProdutivo);
        System.out.println("Quantidade produzida: "+periodoProdutivoQuant);


    }
}
