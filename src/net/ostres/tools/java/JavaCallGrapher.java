package net.ostres.tools.java;
import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class JavaCallGrapher {

	public static void main(String[] args) {
		processSourceFile("/tmp/JavaCallGrapher.java");
	}
	
private static void processSourceFile(String fileName) {
    
	CompilationUnit cu = null;	
    FileInputStream in = null;
	
    try {

		in = new FileInputStream(fileName);
        cu = JavaParser.parse(in);
        
        listClass(cu);
        listMethods(cu);
        
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
    } catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
    } catch (@SuppressWarnings("hiding") IOException e) {
		e.printStackTrace();        	
	} finally {
        try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

private static void listMethods(CompilationUnit cu) {
	// TODO Auto-generated method stub
	
}

private static void listClass(CompilationUnit cu) {
	// TODO Auto-generated method stub
	
}
}
