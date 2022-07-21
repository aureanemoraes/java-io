package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
//		PrintStream ps = new PrintStream("testeescrita.txt");
		PrintWriter pw = new PrintWriter("testeescrita.txt");
		
		
		pw.println("linha 1");
		pw.println();
		pw.println();
		pw.println("linha 2 zzzzzzzzz");
		
		pw.close();
	}

}
