package repeticao2;

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, sum=0;
        String resp;
        do {
            System.out.print("Digite um número a ser somado: ");
            num = tec.nextInt();
            sum += num; 
            System.out.print("Quer continuar? [S/N] ");
            resp = tec.next();
        } while (resp.equals("S"));
            System.out.println("A soma dos números é igual a " + sum);
    }    
}
