package model;

public class Servidor {
    private String dataInical;
    private String dataFinal;
    private String lotacaoExercicio;
    private String comarcaExercicio;
    private String matricula;
    private String nome;
    private String lotacaoOrigem;
    private String comarcaOrigem;
    private String exe_his;
    private String tipoMovimentacao;
    private String cargoEfetivo;
    private String tipoServidor;

    public Servidor(String dataInical, String dataFinal, String lotacaoExercicio, String comarcaExercicio, String matricula, String nome,
                    String lotacaoOrigem, String comarcaOrigem, String exe_his, String tipoMovimentacao, String cargoEfetivo, String tipoServidor) {
        this.dataInical = dataInical;
        this.dataFinal = dataFinal;
        this.lotacaoExercicio = lotacaoExercicio;
        this.comarcaExercicio = comarcaExercicio;
        this.matricula = matricula;
        this.nome = nome;
        this.lotacaoOrigem = lotacaoOrigem;
        this.comarcaOrigem = comarcaOrigem;
        this.exe_his = exe_his;
        this.tipoMovimentacao = tipoMovimentacao;
        this.cargoEfetivo = cargoEfetivo;
        this.tipoServidor = tipoServidor;
    }

    public String getDataInical() {
        return dataInical;
    }

    public void setDataInical(String dataInical) {
        this.dataInical = dataInical;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getLotacaoExercicio() {
        return lotacaoExercicio;
    }

    public void setLotacaoExercicio(String lotacaoExercicio) {
        this.lotacaoExercicio = lotacaoExercicio;
    }

    public String getComarcaExercicio() {
        return comarcaExercicio;
    }

    public void setComarcaExercicio(String comarcaExercicio) {
        this.comarcaExercicio = comarcaExercicio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLotacaoOrigem() {
        return lotacaoOrigem;
    }

    public void setLotacaoOrigem(String lotacaoOrigem) {
        this.lotacaoOrigem = lotacaoOrigem;
    }

    public String getComarcaOrigem() {
        return comarcaOrigem;
    }

    public void setComarcaOrigem(String comarcaOrigem) {
        this.comarcaOrigem = comarcaOrigem;
    }

    public String getExe_his() {
        return exe_his;
    }

    public void setExe_his(String exe_his) {
        this.exe_his = exe_his;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getCargoEfetivo() {
        return cargoEfetivo;
    }

    public void setCargoEfetivo(String cargoEfetivo) {
        this.cargoEfetivo = cargoEfetivo;
    }

    public String getTipoServidor() {
        return tipoServidor;
    }

    public void setTipoServidor(String tipoServidor) {
        this.tipoServidor = tipoServidor;
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "dataInical='" + dataInical + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                ", lotacaoExercicio='" + lotacaoExercicio + '\'' +
                ", comarcaExercicio='" + comarcaExercicio + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", lotacaoOrigem='" + lotacaoOrigem + '\'' +
                ", comarcaOrigem='" + comarcaOrigem + '\'' +
                ", exe_his='" + exe_his + '\'' +
                ", tipoMovimentacao='" + tipoMovimentacao + '\'' +
                ", cargoEfetivo='" + cargoEfetivo + '\'' +
                ", tipoServidor='" + tipoServidor + '\'' +
                '}';
    }
}

/**
 * DataFormatada	DataFimFormatada	Exerc	Comarca-exe	Matricula
 * Nome	origem	comarca-orig	exe-his	Descricao	Descricao	Descricao
 *  Nomeacao em Cargo Comissionado -	ANALISTA JUDICIARIO - ADMINISTRADOR - Servidor Efetivo
  */
