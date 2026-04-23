import java.util.Random;

public class TesteVetorDinamico {
    
    public static void main(String[] args) throws Exception {
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while(true) {
            int op = gerador.nextInt(2);
            switch(op){
                case 0:
                    int elemento = 1 + gerador.nextInt(6);
                    v.adicionar(elemento);
                    break;
                case 1:
                    v.remover();
                    break;
            }
            v.exibir();
            Thread.sleep(5000);
            System.out.println("=====================================");
        } 
    }
    
}
