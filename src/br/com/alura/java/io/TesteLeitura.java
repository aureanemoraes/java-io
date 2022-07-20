package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("teste.txt");
		InputStreamReader fsr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(fsr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			
			linha = br.readLine();
		}
		
		br.close();
	}

}
