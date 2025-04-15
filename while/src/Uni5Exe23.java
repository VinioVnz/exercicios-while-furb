import java.util.Scanner;

public class Uni5Exe23 {
    /* 
     * Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
     * que é igual a 30% de comissão sobre o preço de cada produto vendido. 
     * Cada vendedor, em um determinado mês, vende n produtos, onde, para
     * cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório 
     * com: nome, total de vendas (em R$) e salário de cada vendedor. 
     * Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a 
     * seguinte mensagem: 
     * “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite o nome do funcionario: ");
            String nome = input.next();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int numProdutos = input.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= numProdutos; i++) {
                System.out.print("Digite o preço unitário do produto");
                double preco = input.nextDouble();

                System.out.print("Digite a quantidade vendida do produto");
                int quantidade = input.nextInt();

                totalVendas += preco * quantidade;
            }
            double salario = totalVendas * 0.30;
            System.out.println("O funcionario "+nome+" possui o total de vendas em Reais de "+totalVendas+" e seu salário é igual a R$ "+salario);
            System.out.println("Deseja digitar os dados de mais um vendedor: s(SIM) / n (NÃO)?");
            String resposta = input.next().toLowerCase();

            if(resposta.equals("n")){
                break;
            }
        }   
        input.close();
     
    }
}
