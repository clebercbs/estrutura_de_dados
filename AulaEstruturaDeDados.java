// Aula Prática de Estrutura de Dados em Java: Introdução à Linguagem e Estruturas de Dados Básicas

// Capítulo 1: Conhecendo a Sintaxe Básica
/*public: Torna a classe acessível de qualquer lugar.
class: Palavra-chave usada para declarar uma classe em Java.
AulaEstruturaDeDados: Nome da classe que segue a convenção de capitalização (CamelCase).*/

public class AulaEstruturaDeDados {

/* public 
Significado: Este modificador de acesso torna o método acessível de qualquer lugar.
Por que é necessário?: O método main precisa ser acessível pelo ambiente de execução Java 
(Java Virtual Machine - JVM), que inicia o programa. Sem o modificador public, a JVM não 
poderia acessar o método para começar a execução.*/

/*static 
Significado: O método pertence à classe, não a uma instância da classe (objeto criado a partir de uma classe).
Por que é necessário?: Como o método main é chamado pela JVM antes que qualquer objeto da classe 
seja criado, ele precisa ser static. Isso permite que a JVM execute o método sem criar uma instância 
da classe. */

/*void
Significado: O método não retorna nenhum valor.
Por que é necessário?: O main não precisa retornar nada para a JVM; ele apenas executa as instruções dentro dele. */

/*main
Significado: É o nome do método que a JVM procura para iniciar a execução do programa.
Por que é necessário?: Este é o nome padrão definido pela especificação da linguagem Java. A JVM exige que o método 
de entrada se chame exatamente main.
 */

 /*String[] args
Significado: Um array de strings que contém os argumentos passados para o programa pela linha de comando.
Detalhes:
String[]: Define que o argumento é um array de strings.
args: É apenas o nome da variável que armazena os argumentos. Você pode renomeá-lo se desejar (exemplo: String[] 
parametros).
  */
    public static void main(String[] args) {
        // Exemplo: Tipos de Dados Básicos
        int numeroInteiro = 10;        // int
        double numeroDecimal = 3.14;  // float
        String texto = "Olá, mundo!"; // String
        boolean valorBooleano = true; // boolean

        System.out.println("Número inteiro: " + numeroInteiro + " - " + ((Object) numeroInteiro).getClass().getSimpleName());
        System.out.println("Número decimal: " + numeroDecimal + " - " + ((Object) numeroDecimal).getClass().getSimpleName());
        System.out.println("Texto: " + texto + " - " + texto.getClass().getSimpleName());
        System.out.println("Valor booleano: " + valorBooleano + " - " + ((Object) valorBooleano).getClass().getSimpleName());

        // Operadores básicos
        int a = 10, b = 5;
        System.out.println("\nOperadores básicos:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("a é igual a b? " + (a == b));
        System.out.println("a é maior que b? " + (a > b));
        System.out.println("a é maior que 0 e b é menor que 10? " + (a > 0 && b < 10));
    }
        /*

        // Estruturas condicionais
        int idade = 20; // Exemplo de entrada
        if (idade >= 18) {
            System.out.println("\nVocê é maior de idade.");
        } else if (idade >= 12) {
            System.out.println("\nVocê é adolescente.");
        } else {
            System.out.println("\nVocê é criança.");
        }

        // Laços de repetição
        System.out.println("\nLaço for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("\nLaço while:");
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Operações com listas (em Java, usamos ArrayList)
        System.out.println("\nOperações com listas:");
        java.util.List<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista inicial: " + numeros);
        numeros.add(40); // Adiciona ao final
        System.out.println("Após adicionar 40: " + numeros);
        numeros.remove((Integer) 30); // Remove elemento
        System.out.println("Após remover 30: " + numeros);

        // Tuplas (em Java, usamos classes ou arrays para representar tuplas)
        System.out.println("\nTuplas (representadas como arrays):");
        int[] tupla = {1, 2, 3, 4, 5};
        System.out.println("Primeiro elemento: " + tupla[0]);
        System.out.println("Último elemento: " + tupla[tupla.length - 1]);

        // Operações com conjuntos
        System.out.println("\nOperações com conjuntos:");
        java.util.Set<Integer> conjunto1 = new java.util.HashSet<>();
        java.util.Set<Integer> conjunto2 = new java.util.HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);
        java.util.Set<Integer> uniao = new java.util.HashSet<>(conjunto1);
        uniao.addAll(conjunto2); // União
        java.util.Set<Integer> intersecao = new java.util.HashSet<>(conjunto1);
        intersecao.retainAll(conjunto2); // Interseção
        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);

        // Dicionários (em Java, usamos HashMap)
        System.out.println("\nDicionário:");
        java.util.Map<String, Double> notas = new java.util.HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("João", 7.0);
        notas.put("Carla", 9.0);
        System.out.println("Nota de Ana: " + notas.get("Ana"));
        notas.put("Pedro", 6.5); // Adiciona novo elemento
        System.out.println("Dicionário atualizado: " + notas);

        // Definindo funções (em Java, usamos métodos)
        saudacao("Cleber");

        // Importação de bibliotecas
        System.out.println("\nExemplo de bibliotecas:");
        double raizQuadrada = Math.sqrt(16);
        System.out.println("Raiz quadrada de 16: " + raizQuadrada);
        int numeroAleatorio = new java.util.Random().nextInt(10) + 1;
        System.out.println("Número aleatório: " + numeroAleatorio);
    }

    // Função para saudação
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo à aula.");
    } */
}
