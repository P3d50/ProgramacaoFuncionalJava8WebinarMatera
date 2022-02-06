package br.com.p3d50.clientesporestado;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientesPorEstadoFuncional {

    public static Map<String,List<Cliente>> agrupaPorEstado(List<Cliente> clientes){
      return clientes.stream()
              .collect(Collectors.groupingBy(Cliente::getEstado));
     }

    public static void main(String[] args){
        List<Cliente> clientes= new ArrayList();

        clientes.add(new Cliente("Jośe", "Campinas","SP"));
        clientes.add(new Cliente("Pedro", "Campinas","SP"));
        clientes.add(new Cliente("João", "São Paulo","SP"));
        clientes.add(new Cliente("Ana", "Recife","PE"));
        clientes.add(new Cliente("Fabiana", "Campo Grande","MS"));
        clientes.add(new Cliente("Cristiane", "Rio de Janeiro","RJ"));
        clientes.add(new Cliente("Fabricio", "Campinas","SP"));
        clientes.add(new Cliente("Júlia", "Campo Grande","MS"));
        clientes.add(new Cliente("Fábio", "São Paulo","SP"));
        Map<String,List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);

        clientesPorEstado.keySet().forEach(estado->System.out.println(estado+":"+clientesPorEstado.get(estado)));

    }
}
