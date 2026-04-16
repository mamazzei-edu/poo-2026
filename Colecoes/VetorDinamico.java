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
            aumentarCapacidade();
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

}
