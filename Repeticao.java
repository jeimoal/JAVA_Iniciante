package contagem;
public class Contagem {
    public static void main(String[] args) {
        // Repetição com teste no início
        /*int pulo = 1;
         *while (pulo<=10) {
         *System.out.println("pulo " + pulo);
         *pulo++;
        }*/
        
        // Repetição com teste no final
        int pulo = 1;
        do {
            System.out.println(pulo + " Polichinelho");
            pulo++;
        } while (pulo <= 100);
    }    
}
