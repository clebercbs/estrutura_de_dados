public class PilhaAula2
 {
    private int capacidade; // Capacidade máxima da pilha
    private int[] elementos; // Array para armazenar os elementos da pilha
    private int topo; // Índice do topo da pilha

    // Construtor para inicializar a pilha
    public PilhaAula2(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade]; // Cria um array com a capacidade fornecida
        this.topo = -1; // Inicializa o topo como -1, indicando que a pilha está vazia
    }

    // Método para empilhar um elemento
    public void empilhar(int item) {
        if (topo == capacidade - 1) {
            System.out.println("Erro: Pilha cheia. Não é possível empilhar.");
            return;
        }
        topo++; // Incrementa o topo
        elementos[topo] = item; // Adiciona o item na posição do topo
        System.out.println("Item '" + item + "' empilhado.");
    }

    // Método para desempilhar um elemento
    public int desempilhar() {
        if (topo == -1) {
            System.out.println("Erro: Pilha vazia. Não é possível desempilhar.");
            return -1; // Retorna um valor indicando que a pilha está vazia
        }
        int item = elementos[topo]; // Obtém o item do topo
        elementos[topo] = 0; // Remove o item do topo
        topo--; // Decrementa o topo
        System.out.println("Item '" + item + "' desempilhado.");
        return item;
    }

    // Método para verificar o elemento no topo
    public int verTopo() {
        if (topo == -1) {
            System.out.println("A pilha está vazia.");
            return -1; // Retorna um valor indicando que a pilha está vazia
        }
        return elementos[topo];
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Método para obter o tamanho atual da pilha
    public int tamanho() {
        return topo + 1;
    }

    // Método para exibir os elementos da pilha
    public void exibir() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Pilha atual: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

    // Método principal para demonstração do uso da pilha
    public static void main(String[] args) {
        System.out.println("Conceito de Pilha: LIFO (Last In, First Out)");
        System.out.println("Os últimos elementos a serem adicionados são os primeiros a serem removidos.\n");

        int capacidade = 5;
        PilhaAula2 pilha = new PilhaAula2(capacidade);

        // Empilhando elementos
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60); // Tentativa de empilhar além da capacidade

        // Exibindo a pilha
        pilha.exibir();

        // Verificando o topo
        System.out.println("Elemento no topo: " + pilha.verTopo());

        // Desempilhando elementos
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();

        // Exibindo a pilha novamente
        pilha.exibir();

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + (pilha.estaVazia() ? "Sim" : "Não"));
    }
}
