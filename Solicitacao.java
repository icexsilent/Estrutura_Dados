public class Solicitacao {
    // Atributos definidos no documento do projeto
    private int codigo;
    private String solicitante;
    private String descricao;
    private String categoria;
    private Int prioridade;
    private String status;

    // Construtor: usado para criar uma nova solicitação já com os dados iniciais
    public Solicitacao(int codigo, String solicitante, String descricao, String categoria, int prioridade, String status) {
        this.codigo = codigo;
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.categoria = categoria;
        this.prioridade = prioridade;
        this.status = status; // Possíveis estados: AGUARDANDO, EM ATENDIMENTO, CONCLUIDA, CANCELADA
    }

   // --- GETTERS E SETTERS ---

    // 1. Código
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // 2. Solicitante
    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    // 3. Descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // 4. Categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // 5. Prioridade
    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // 6. Status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 



}