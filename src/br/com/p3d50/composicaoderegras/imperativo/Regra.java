package br.com.p3d50.composicaoderegras.imperativo;

import br.com.p3d50.clientesporestado.Cliente;

public interface Regra {

    boolean aplicar(Cliente cli);
}
