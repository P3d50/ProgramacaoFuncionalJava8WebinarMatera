package br.com.p3d50.clientesporestado;

public class Cliente {

    private String nome;
    private String cidade;
    private String estado;
    private double salario;
    private int tempoEmpregado;
    private boolean restricoesSPC;
    private boolean pagamentosAtraso;


    public Cliente(String nome, String cidade, String estado) {

        this.nome=nome;
        this.cidade=cidade;
        this.estado=estado;
    }

    public Cliente(String nome, double salario, int tempoEmpregado, boolean restricoesSPC, boolean pagamentosAtraso) {
        this.nome=nome;
        this.salario=salario;
        this.tempoEmpregado=tempoEmpregado;
        this.restricoesSPC=restricoesSPC;
        this.pagamentosAtraso=pagamentosAtraso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoEmpregado() {
        return tempoEmpregado;
    }

    public void setTempoEmpregado(int tempoEmpregado) {
        this.tempoEmpregado = tempoEmpregado;
    }

    public boolean isRestricoesSPC() {
        return restricoesSPC;
    }

    public void setRestricoesSPC(boolean restricoesSPC) {
        this.restricoesSPC = restricoesSPC;
    }

    public boolean isPagamentosAtraso() {
        return pagamentosAtraso;
    }

    public void setPagamentosAtraso(boolean pagamentosAtraso) {
        this.pagamentosAtraso = pagamentosAtraso;
    }

    @Override
    public String toString() {
        return  nome;
    }
}
