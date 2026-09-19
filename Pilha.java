public class Pilha<T> {
    private static final int TAM_DEFAULT = 100;
    private int topoPilha;
    private T[] e;

    @SuppressWarnings("unchecked")
    public Pilha(int tamanho) { // construtor 1
        this.e = (T[]) new Object[tamanho];
        this.topoPilha = -1;
    }

    public Pilha() { // construtor 2
        this(TAM_DEFAULT);
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return this.topoPilha == -1;
    }

    // Verifica se a pilha está cheia
    public boolean isFull() {
        return this.topoPilha == this.e.length - 1;
    }

    // Insere um elemento no topo da pilha
    public void push(T e) throws Exception {
        if (!this.isFull()) {
            this.e[++this.topoPilha] = e;
        } else {
            throw new Exception("overflow - Estouro de Pilha");
        }
    }

    // Remove um elemento do topo da pilha
    public T pop() throws Exception {
        if (!this.isEmpty()) {
            return this.e[this.topoPilha--];
        } else {
            throw new Exception("underflow - Esvaziamento de Pilha");
        }
    }

    // Retorna o elemento que está no topo da pilha
    public T topo() throws Exception {
        if (!this.isEmpty()) {
            return this.e[this.topoPilha];
        } else {
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    // Obtém o total de elementos armazenados na Pilha
    public int sizeElements() {
        return topoPilha + 1;
    }

    // Adicionei este método toString() para facilitar a Opção 7 (Exibir Histórico) 
    // seguindo a mesma lógica que o professor usou na FilaCircular
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Pilha Vazia";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Topo -> ");
        for (int i = topoPilha; i >= 0; i--) {
            sb.append("[").append(e[i].toString()).append("] ");
        }
        return sb.toString();
    }
}