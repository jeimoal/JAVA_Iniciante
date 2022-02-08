package sistemavotacao;
import java.util.Scanner;
public class SistemaVotacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual ano você nasceu? ");
        int ano = teclado.nextInt();
        int idade = 2022 - ano;
        System.out.println("Sua idade é " + idade);
        if (idade < 16){
            System.out.println("Menor de idade - Voto proibido");
        }
        if (idade >= 16 && idade < 18) {
            System.out.println("Adolescente - Voto Facultativo");
        }
        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto Obrigatório");
        }
        if (idade > 70) {
            System.out.println("Idoso - Voto facultativo");
        }        
    }    
}
