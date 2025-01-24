class Lista {
    private int[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        elementos = new int[capacidade];
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

public class ListaExemplo {
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
