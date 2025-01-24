class Lista {

    //Atributos da classe
    private int[] elementos;
    private int tamanho;

    //O construtor da classe iniciar a lista e define o tamanho como 0
    public Lista(int capacidade) {
        elementos = new int[capacidade];
        //System.out.println(java.util.Arrays.toString(elementos));
        tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (tamanho == elementos.length) {
            int[] novaLista = new int[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novaLista[i] = elementos[i];
            }
            elementos = novaLista;
        }
        elementos[tamanho++] = elemento;
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            //Se o valor for inválido, o programa lança uma exceção (erro)
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public int acessar(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return elementos[indice];
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

public class ListaAula2 {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.exibir();

        lista.remover(1);
        lista.exibir();

        System.out.println("Elemento no índice 1: " + lista.acessar(1));
    }
}
