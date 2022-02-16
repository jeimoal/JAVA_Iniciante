package procedimento;
public class Procedimento {
    
    //Cria a função 'soma'
    static int soma (int a, int b) {
        int s = a + b; //Declaração de variável local
        return s; //Retorno do VALOR de 'S'
    }

    public static void main(String[] args) {
        int sum = soma(7,8); //Chama o procedimento 'soma'3
        System.out.println("O valor da soma é " + sum);
    }
}
