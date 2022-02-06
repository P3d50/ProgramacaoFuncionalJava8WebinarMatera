package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public class RegraPagamentoEmAtraso  extends CadeiaDeRegras{

    public RegraPagamentoEmAtraso(){
        super(null);
    }

    public RegraPagamentoEmAtraso(Regra proximaRegra){
        super(proximaRegra);
    }

    public boolean aplicar(Cliente cli){
        if(!cli.isPagamentosAtraso()){
            return aplicarProximaRegra(cli);
        }
        return false;
    }

}
