import java.util.Scanner;

public class Uni5Exe25 {
    /* 
     * Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o
     *  jogador do lado esquerdo da mesa.
     *  Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:
     * um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
     * o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, 
     * caso a primeira condição não seja atendida.
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean vencer = false;
      int timeE = 0;
      int timeD = 0;
      String vencedor = "";
      while (!vencer) {
        System.out.println("Quem ganhou a rodada? E para esquerda, D para direita");
        String ponto = input.next().toUpperCase();
        if(ponto.equals("E")){
            timeE++;
        }else{
            timeD++;
        }
        if(timeE >= 21 && timeE - timeD >= 2){
         vencedor = "Time Esquerda";
         break;
        }
        if(timeD >= 21 && timeD - timeE >=2){
         vencedor = "Time Direito";
         break;
        }

    }  
    input.close();
      System.out.println("O vencedor foi o "+vencedor);
    }
}
