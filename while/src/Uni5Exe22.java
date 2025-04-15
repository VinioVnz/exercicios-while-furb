public class Uni5Exe22 {
    /* 
     * Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
     * A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine 
     * o salário atual do funcionário.

Pense no resultado!
     */
    public static void main(String[] args) {
       double salario = 2000;
       double aumentoPercentual = 0.015;
       salario += salario * aumentoPercentual; 

       int anoAtual = 1997;
       while (anoAtual != 2025) {
        aumentoPercentual *= 2;
        salario += salario * aumentoPercentual;
        anoAtual++;
       }
       System.out.println("Salario atual: "+salario);
    }
}
