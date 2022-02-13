package mesesanos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MesesAnos {
    
    public static void main(String[] args) {
        Calendar cal =  GregorianCalendar.getInstance(); //Classe para importar o calendário Gregoriano
        
        int ano = cal.get(Calendar.YEAR); //Criação da Variável e escolha da Sublassse para escolha do Ano
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"}; //Criação do Vetor String para os meses
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31}; //Criação do Vetor inteiro para os dias
        
        //Verifica se o ano é bissexto
        if ((ano%4 == 0) && (ano%100 != 0) || (ano%400 == 0)){
                dia[1] = 29; //Atribui ao mês de FEV 29 dias.
                System.out.println("O ano é Bissexto."); //Informa ao usuário que o ano é bissexto
            }
        
        //Estrutura de repetição informando o ano, mês e dia.
        for (int cont = 0; cont<mes.length; cont++) {
            System.out.print("O ano atual é " + ano + " e "); //Escreve o ano no console
            System.out.println("o mês de " + mes[cont] + " têm " + dia[cont] + " dias."); //Escreve o mes e o dia no console
        }
    }
}
