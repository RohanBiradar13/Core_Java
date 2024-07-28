package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopyFP3 {

	public static void main(String[] args) {
	  try(Scanner sc = new Scanner(System.in)){
		  System.out.println("Enter the source file name");
		  //Java<---BufferReader<----File (chain of io streams)
		  BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));//src
		  //Java--->BufferedReader--->File
		  System.out.println("Enter the destination file name");
		  PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()));//dest
		  //now copy data from src to dest
			/*
			 * String line = null; while((line=br.readLine())!=null) { pw.println(line); }
			 * pw.close();//if the data is not copied from src file then it's not closed the
			 * printWriter
			 */		  
		 // br.lines().forEach(pw::println);
		  br.lines().//Stream<String> : all lines from src
		  filter(s->s.length()>40).// Stream of all strings whose length > 40,itermediate operation
		  //mapToInt(s->s.length()).//length of that strings whose length > 40, itermediate operation
		  mapToInt(String::length).//IntSteam : contais stream of ints(Primitive): itermediate operation
		  forEach(pw::println);//terminal operation
		  pw.close();
		  System.out.println("copy done!");
	  }catch (Exception e) {
		e.printStackTrace();
	}
	  System.out.println("main over...");

	}

}
