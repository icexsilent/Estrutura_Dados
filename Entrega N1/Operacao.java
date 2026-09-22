public class Operacao {
    // O tipo pode ser: CADASTRO, ATENDIMENTO ou CANCELAMENTO
    private String tipo; 
    
    // A solicitação que sofreu a operação
    private Solicitacao solicitacao; 

    public Operacao(String tipo, Solicitacao solicitacao) {
        this.tipo = tipo;
        this.solicitacao = solicitacao;
    }

    public String getTipo() {
        return tipo;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    @Override
    public String toString() {
        return "Operação: " + tipo + " | Solicitação nº: " + solicitacao.getCodigo();
    }
    
}