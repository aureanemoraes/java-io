package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("testeescrita.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("testeescrita.txt"));
		
		
		bw.write("linha 1");
		bw.newLine();
		bw.newLine();
		bw.write("linha 2");
		
		bw.close();
	}

}
