package procedimento;
public class Procedimento {
  
    //Cria o procedimento 'soma'
    static void soma (int a, int b) {
        int s = a + b; //Declaração de variável local
        System.out.println("A soma é " + s);
    }

    public static void main(String[] args) {
        System.out.println("O programa começa aqui.");
        soma(7,8); //Chama o procedimento 'soma'3
    }
    
}
