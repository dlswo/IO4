package org.injae;

import java.io.FileWriter;

import java.io.PrintWriter;
import java.io.Writer;

public class Main {

    //bad code
    public static void main(String[] args) throws Exception {
	    Writer writer = new FileWriter("c:\\zzz\\z1.txt");

	    PrintWriter printerWriter = new PrintWriter(writer);

	    printerWriter.println("오늘은 비가 옵니다.");

	    printerWriter.flush();
	    printerWriter.close();
    }
}
