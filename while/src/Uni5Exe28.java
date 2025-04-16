import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nenhumNos = 0;
        int cpm22 = 0;
        int skank = 0;
        int jotaQ = 0;
        while (true) {
            System.out.println("Digite o voto: ");
            int voto = input.nextInt();

            switch (voto) {
                case 1:
                    nenhumNos++;
                    break;
                case 2:
                    cpm22++;
                    break;
                case 3:
                    skank++;
                    break;
                case 4:
                    jotaQ++;
                    break;
                default:
                    break;
                
            }
            System.out.println(" mais um voto: s (SIM) / n (NÃO)? ");
            String resposta = input.next();

            if(resposta.equals('n')){
                break;
            }
        }
        input.close();

        int total = nenhumNos + cpm22+ skank + jotaQ;
        String vencedor = "";
        if(nenhumNos > cpm22 && nenhumNos > skank && nenhumNos > jotaQ){
             vencedor = "nenhum de nos";
        } else if(cpm22 > nenhumNos && cpm22 > skank && cpm22 > jotaQ){
             vencedor = "cpm22";
        }
        else if(skank > nenhumNos && skank > cpm22 && skank > jotaQ){
             vencedor = "skank";
        }else{
             vencedor = "jotaQ";
        }
       
        double porcNenhumNos = (100 * nenhumNos) / total;
        double porcCpm22 = (100 * cpm22) / total;
        double porcSkank = (100 * skank) / total;
        double porcJotaQ = (100 * jotaQ) / total;
        System.out.println("Quantidade 1: "+nenhumNos);
        System.out.println("Quantidade 2: "+cpm22);
        System.out.println("Quantidade 3: "+skank);
        System.out.println("Quantidade 4: "+jotaQ);
        System.out.println("Vencedor: "+vencedor);
        System.out.println("Porcentagem Nenhum de nos: "+porcNenhumNos+"%");
        System.out.println("Porcentagem cpm22: "+porcCpm22+"%");
        System.out.println("Porcentagem Skank: "+porcSkank+"%");
        System.out.println("Porcentagem jotaQ: "+porcJotaQ+"%");

    }
}
