package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public class RegraTempoEmpregado extends CadeiaDeRegras{
    public RegraTempoEmpregado(){
        super(null);
    }

    public RegraTempoEmpregado(Regra proximaRegra){
        super(proximaRegra);
    }

    @Override
    public boolean aplicar(Cliente cli) {
        if(cli.getTempoEmpregado()>0){
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}

