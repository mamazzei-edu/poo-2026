import java.util.EmptyStackException;

public class VetorDinamico {
    public int[] elementos;
    public int quantidade;
    public int capacidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.elementos = new int[this.capacidade];
        this.quantidade = 0;
    }

    public boolean estaCheio() {
//        return this.quantidade == this.capacidade ? true : false;
        return this.quantidade == this.capacidade;
        // if (this.quantidade == this.capacidade) {
        //     return true;
        // } else {
        //     return false;
        // }
    }

    public void adicionar(int elemento) {
        if(estaCheio()) {  
            redimensionar(2);
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }

    public void aumentarCapacidade() {
        this.capacidade *= 2;
        int[] aux = new int[this.capacidade];
        for (int i = 0; i < this.elementos.length; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
    }

    public boolean estaVazio() {
        return this.quantidade == 0;
    }

    public void remover() {
        if (!estaVazio())
            this.quantidade--;
        if (this.capacidade > 4 && this.quantidade <= this.capacidade /4){
            this.redimensionar(0.5);
        }
    }

    public void reduzirCapacidade(){
        int[] aux = new int[this.capacidade / 2];
        for (int i = 0; i< this.quantidade; i++) {
            aux[i]=this.elementos[i];
        }
        this.elementos=aux;
        this.capacidade /=2;
    }

    private void redimensionar(double valor) {
        int[] aux = new int[(int)(this.capacidade * valor)];
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        this.elementos= aux;
        this.capacidade = (int)(this.capacidade * valor);
    }

    public void exibir() {
        System.out.printf("Qtde: %d, Cap: %d\n",this.quantidade, this.capacidade);
        for (int i=0; i<this.quantidade;i++) {
            System.out.print(this.elementos[i] + " ");
        }
    }

}
