package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public class RegraSalario extends CadeiaDeRegras{

    public RegraSalario(){
        super(null);
    }

    public RegraSalario(Regra proximaRegra){
        super(proximaRegra);
    }

    @Override
    public boolean aplicar(Cliente cli) {
        if(cli.getSalario()>2000.0){
            return aplicarProximaRegra(cli);
        }
        return false;
    }


}
