package mesesanos;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MesesAnos {
    
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int cont = 0; cont<mes.length; cont++) {            
            System.out.print("O ano atual é " + dtf.format((ZonedDateTime.now())) + " e ");
            System.out.println("o mês de " + mes[cont] + " têm " + dia[cont] + " dias.");
        } 
    }    
}
