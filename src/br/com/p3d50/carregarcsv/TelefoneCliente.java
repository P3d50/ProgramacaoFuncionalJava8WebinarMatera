package br.com.p3d50.carregarcsv;

public class TelefoneCliente {

    private String nome;
    private String codigoArea;
    private String telefone;

    public TelefoneCliente(String nome,String codigoArea, String telefone){
        this.nome=nome;
        this.codigoArea=codigoArea;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "TelefoneCliente{" +
                "nome='" + nome + '\'' +
                ", codigoArea='" + codigoArea + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
