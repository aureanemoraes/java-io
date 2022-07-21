package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// entrada de arquivo
		//InputStream fis = new FileInputStream("teste.txt");
		
		// entrada do console
		InputStream fis = System.in;
		Reader fsr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(fsr);
		
		// saída em um arquivo
		//OutputStream fos = new FileOutputStream("testescrita.txt");
		// saída no console
		OutputStream fos = System.out;
		
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
