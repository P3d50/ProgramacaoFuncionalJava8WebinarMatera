package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public class RegraSPC extends CadeiaDeRegras{

    public RegraSPC(){
        super(null);
    }

    public RegraSPC(Regra proximaRegra){
        super(proximaRegra);
    }

    @Override
    public boolean aplicar(Cliente cli) {
        if(!cli.isRestricoesSPC()){
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}
