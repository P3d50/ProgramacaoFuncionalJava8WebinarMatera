package br.com.p3d50.buscaemarquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuscaArquivoImperativo {

    public static void main(String[] args) throws Exception{
        String palavra = "SILVA";
        String arquivo = "nomes.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
            long contador = 0;
            String linha = null;
            while((linha=bufferedReader.readLine())!=null){
                if(linha.contains(palavra)){
                    contador++;
                }
            }

            System.out.printf("A palavra [%s] ocorreu %d vezes",palavra,contador);
        }

    }

}
