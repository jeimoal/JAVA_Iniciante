package multiplaescolha;
import java.util.Scanner;
public class MultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas o animal possui? ");
        int an = teclado.nextInt();
        String animal;
        System.out.print("Esse animal é um(a): ");
        switch (an) {
            case 2:
                animal = "Bípede";
                break;
            case 4:
                animal = "Quadrúpede";
                break;
            case 6,8:
                animal = "Artrópode";
                break;
            default:
                animal = "Existe esse animal?";
        }
        System.out.println(animal);
    }    
}
