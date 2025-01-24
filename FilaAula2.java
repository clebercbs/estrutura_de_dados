public class FilaAula2 {
    private int capacidade; // Capacidade máxima da fila
    private int[] itens;    // Array para armazenar os itens da fila
    private int inicio;     // Índice do início da fila
    private int fim;        // Índice do fim da fila
    private int tamanho;    // Quantidade atual de elementos na fila

    // Construtor para inicializar a fila
    public FilaAula2(int capacidade) {
        this.capacidade = capacidade;
        this.itens = new int[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    // Método para enfileirar um item
    public void enfileirar(int item) {
        if (tamanho == capacidade) {
            System.out.println("Erro: Fila cheia. Não é possível enfileirar.");
            return;
        }
        itens[fim] = item; // Adiciona o item no índice do fim
        fim = (fim + 1) % capacidade; // Move o fim circularmente
        tamanho++;
        System.out.println("Item '" + item + "' enfileirado.");
    }

    // Método para desenfileirar um item
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Erro: Fila vazia. Não é possível desenfileirar.");
            return -1; // Retorna -1 indicando que a fila está vazia
        }
        int item = itens[inicio]; // Obtém o item no início
        itens[inicio] = 0; // Remove o item do início (opcional: define como 0 para limpar)
        inicio = (inicio + 1) % capacidade; // Move o início circularmente
        tamanho--;
        System.out.println("Item '" + item + "' desenfileirado.");
        return item;
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para exibir os elementos da fila
    public void exibir() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Fila atual: ");
            for (int i = 0; i < tamanho; i++) {
                int indice = (inicio + i) % capacidade; // Índice circular
                System.out.print(itens[indice] + " ");
            }
            System.out.println();
        }
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        int capacidade = 5;
        FilaAula2 fila = new FilaAula2(capacidade);

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        fila.exibir();

        fila.desenfileirar();

        fila.exibir();
    }
}
