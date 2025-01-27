import java.util.ArrayList;

public class ConjuntoAula2 {
    private ArrayList<Integer> elementos;

    // Construtor
    public ConjuntoAula2() {
        elementos = new ArrayList<>();
    }

    // Adicionar um elemento ao ConjuntoAula2 (sem duplicados)
    public void inserir(int elemento) {
        if (!pertence(elemento)) {
            elementos.add(elemento);
        }
    }

    // Remover um elemento do conjunto
    public void remover(int elemento) {
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i) == elemento) {
                // "Shift" manual para evitar o uso direto de .remove()
                for (int j = i; j < elementos.size() - 1; j++) {
                    elementos.set(j, elementos.get(j + 1));
                }
                elementos.remove(elementos.size() - 1);
                break;
            }
        }
    }

    // Testar se um elemento pertence ao conjunto
    public boolean pertence(int elemento) {
        for (int el : elementos) {
            if (el == elemento) {
                return true;
            }
        }
        return false;
    }

    // União de dois conjuntos
    public ConjuntoAula2 uniao(ConjuntoAula2 outro) {
        ConjuntoAula2 resultado = new ConjuntoAula2();
        for (int el : this.elementos) {
            resultado.inserir(el);
        }
        for (int el : outro.elementos) {
            resultado.inserir(el);
        }
        return resultado;
    }

    // Interseção de dois conjuntos
    public ConjuntoAula2 intersecao(ConjuntoAula2 outro) {
        ConjuntoAula2 resultado = new ConjuntoAula2();
        for (int el : this.elementos) {
            if (outro.pertence(el)) {
                resultado.inserir(el);
            }
        }
        return resultado;
    }

    // Diferença de dois conjuntos
    public ConjuntoAula2 diferenca(ConjuntoAula2 outro) {
        ConjuntoAula2 resultado = new ConjuntoAula2();
        for (int el : this.elementos) {
            if (!outro.pertence(el)) {
                resultado.inserir(el);
            }
        }
        return resultado;
    }

    // Exibir os elementos do conjunto
    public void exibir() {
        System.out.print("{");
        int i = 0;
        for (int el : elementos) {
            System.out.print(el);
            if (i < elementos.size() - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        // Criação de conjuntos
        ConjuntoAula2 conjunto1 = new ConjuntoAula2();
        ConjuntoAula2 conjunto2 = new ConjuntoAula2();

        conjunto1.inserir(1);
        conjunto1.inserir(2);
        conjunto1.inserir(3);
        conjunto1.inserir(4);

        conjunto2.inserir(3);
        conjunto2.inserir(4);
        conjunto2.inserir(5);
        conjunto2.inserir(6);

        // União
        System.out.print("União: ");
        conjunto1.uniao(conjunto2).exibir();

        // Interseção
        System.out.print("Interseção: ");
        conjunto1.intersecao(conjunto2).exibir();

        // Diferença
        System.out.print("Diferença (conjunto1 - conjunto2): ");
        conjunto1.diferenca(conjunto2).exibir();

        // Teste de pertencimento
        System.out.println("3 está em conjunto1? " + conjunto1.pertence(3));
        System.out.println("5 está em conjunto1? " + conjunto1.pertence(5));

        // Inserção de um elemento
        conjunto1.inserir(5);
        System.out.print("Conjunto1 após inserir 5: ");
        conjunto1.exibir();

        // Remoção de um elemento
        conjunto1.remover(2);
        System.out.print("Conjunto1 após remover 2: ");
        conjunto1.exibir();
    }
}