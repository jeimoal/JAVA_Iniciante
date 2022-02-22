package aula01caneta;
public class Aula01Caneta {

    public static void main(String[] args) {
        Caneta can1 = new Caneta();
        can1.cor = "Preta";
        can1.ponta = 0.1f;
        can1.tampada = true;
        can1.modelo = "Bic";
        can1.carga = 90;
        
        can1.destampar();
        can1.status();
        can1.rabiscar();
        
        Caneta can2 = new Caneta();
        can1.cor = "Vermelha";
        can1.ponta = 0.5f;
        can1.tampada = false;
        can1.modelo = "Bica";
        can1.carga = 33;
        
        can1.tampar();
        can1.status();
        can1.rabiscar();
    }
    
}
