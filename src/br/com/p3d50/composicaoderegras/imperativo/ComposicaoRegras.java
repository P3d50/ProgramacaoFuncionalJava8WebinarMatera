package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public class ComposicaoRegras {

    public static void avaliar(Cliente cli, Regra regra){
        String resultado = regra.aplicar(cli)?"Aceito":"Recusado";
        System.out.println("Resultado: "+resultado);
    }

    public static void main(String[] args){
        Cliente cliente = new Cliente("Jhon Snow",5000.0,2,false,true);
        avaliar(cliente,new RegraSalario(new RegraSPC()));
        avaliar(cliente, new RegraSalario(new RegraTempoEmpregado(new RegraSPC())));
        avaliar(cliente, new RegraSPC(new RegraTempoEmpregado(new RegraPagamentoEmAtraso())));
        avaliar(cliente, new RegraSPC(new RegraTempoEmpregado(new RegraPagamentoEmAtraso())));

    }
}
