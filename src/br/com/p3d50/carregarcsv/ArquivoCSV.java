package br.com.p3d50.carregarcsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ArquivoCSV{

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("src/br/com/p3d50/carregarcsv/telefones-clientes.csv");
        List<TelefoneCliente> telefones = Files.lines(arquivo).map(linha -> linha.split(";"))
                .map(arr->new TelefoneCliente(arr[0],arr[1],arr[2]))
                .filter(tel->tel.getCodigoArea().equals("19"))
                .collect(Collectors.toList());

        telefones.stream().forEach(System.out::println);
    }
}
