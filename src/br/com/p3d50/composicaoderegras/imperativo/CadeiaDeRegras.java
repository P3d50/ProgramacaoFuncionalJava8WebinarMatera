package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public abstract class CadeiaDeRegras  implements Regra{
    private Regra proxima;

    public CadeiaDeRegras(Regra proximaRegra){
        proxima = proximaRegra;
    }

    protected boolean aplicarProximaRegra(Cliente cli){
        if(proxima==null){
            return true;
        }

        return proxima.aplicar(cli);
    }
}
