package sistemavotacao;
import java.util.Scanner;
public class SistemaVotacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual ano você nasceu? ");
        int ano = teclado.nextInt();
        int idade = 2022 - ano;
        System.out.println("Você tem " + idade + " anos");
        if (idade < 16){
            System.out.println("-> Voto proibido");
        }
        else
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                    System.out.println("-> Voto Facultativo");
                }
        else {
            System.out.println("Voto obrigatório");
        }
    }
}
