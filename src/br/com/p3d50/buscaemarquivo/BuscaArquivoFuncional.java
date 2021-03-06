package br.com.p3d50.buscaemarquivo;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BuscaArquivoFuncional {

    public static void main(String[] args) throws Exception{
        String palavra = "SILVA";
        String arquivo = "nomes.txt";

        long contador = Files.lines(Paths.get(arquivo)).
                filter(linha-> linha.contains(palavra))
                .count();

            System.out.printf("A palavra [%s] ocorreu %d vezes",palavra,contador);
        }

}

