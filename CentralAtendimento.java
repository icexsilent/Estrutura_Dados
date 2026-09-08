import _AFilaCircularGenerica.FilaCircular;
// Importe a sua Pilha aqui também quando criá-la

public class CentralAtendimento {
    private FilaCircular<Solicitacao> filaDeEspera;
    private Pilha<Operacao> historico; // Assumindo que você criou a Pilha baseada no PDF da aula 5

    public CentralAtendimento() {
        // Inicializando as estruturas com uma capacidade razoável para o projeto
        this.filaDeEspera = new FilaCircular<>(50); 
        this.historico = new Pilha<>(50);
    }

    // Opção 1: Cadastrar nova solicitação
    public void cadastrarSolicitacao(Solicitacao s) {
        try {
            if (!filaDeEspera.qIsFull()) {
                filaDeEspera.enqueue(s);
                historico.push(new Operacao("CADASTRO", s));
                System.out.println("Solicitação cadastrada com sucesso e inserida na fila!");
            } else {
                System.out.println("A fila de espera está cheia!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    // Opção 2: Consultar próxima solicitação
    public void consultarProxima() {
        try {
            if (!filaDeEspera.qIsEmpty()) {
                Solicitacao proxima = filaDeEspera.front();
                System.out.println("Próxima solicitação: Código " + proxima.getCodigo() + " - " + proxima.getDescricao());
            } else {
                System.out.println("Não há solicitações aguardando na fila.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar: " + e.getMessage());
        }
    }

    // Opção 3: Atender próxima solicitação
    public void atenderProxima() {
        try {
            if (!filaDeEspera.qIsEmpty()) {
                Solicitacao atendida = filaDeEspera.dequeue();
                atendida.setStatus("EM ATENDIMENTO");
                historico.push(new Operacao("ATENDIMENTO", atendida));
                System.out.println("Solicitação " + atendida.getCodigo() + " está em atendimento.");
            } else {
                System.out.println("A fila está vazia. Não há o que atender.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao atender: " + e.getMessage());
        }
    }

    // Opção 4: Exibir fila de solicitações
    public void exibirFila() {
        // O seu professor implementou um ótimo método toString() na FilaCircular!
        System.out.println(filaDeEspera.toString());
    }

    // Opção 5: Exibir quantidade de solicitações
    public void exibirQuantidade() {
        System.out.println("Quantidade de solicitações aguardando: " + filaDeEspera.totalElementos());
    }
}