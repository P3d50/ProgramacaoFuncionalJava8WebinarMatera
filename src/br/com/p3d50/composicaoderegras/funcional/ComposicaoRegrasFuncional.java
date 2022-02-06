package br.com.p3d50.composicaoderegras.funcional;

import br.com.p3d50.clientesporestado.Cliente;
import br.com.p3d50.composicaoderegras.imperativo.*;

import java.util.function.Predicate;

public class ComposicaoRegrasFuncional {

    public static void avaliar(Cliente cli, Predicate<Cliente> regra){
        String resultado = regra.test(cli)?"Aceito":"Recusado";
        System.out.println("Resultado: "+resultado);
    }

    public static void main(String[] args){
        Predicate<Cliente> regraSalario = cli -> cli.getSalario()>2000.0;
        Predicate<Cliente> regraTempoEmpregado = cli -> cli.getTempoEmpregado()>0;
        Predicate<Cliente> regraPagamentoAtrasado = cli -> !cli.isPagamentosAtraso();
        Predicate<Cliente> regraRestricaoSPC = cli -> !cli.isRestricoesSPC();

        Cliente cliente = new Cliente("Jhon Snow",5000.0,2,false,true);

        avaliar(cliente,regraSalario.and(regraTempoEmpregado));
        avaliar(cliente,regraSalario.and(regraTempoEmpregado).and(regraRestricaoSPC));
        avaliar(cliente,regraSalario.and(regraTempoEmpregado).and(regraPagamentoAtrasado));
        avaliar(cliente,regraRestricaoSPC.and(regraSalario).and(regraTempoEmpregado).and(regraPagamentoAtrasado));



    }
}
