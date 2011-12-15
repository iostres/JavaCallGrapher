import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class JavaCallGrapher {

	public static void main(String[] args) {
        CompilationUnit cu = null;
		
		// creates an input stream for the file to be parsed
        FileInputStream in = null;
		try {

				in = new FileInputStream("/tmp/JavaCallGrapher.java");

            // parse the file
            cu = JavaParser.parse(in);
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

        // prints the resulting compilation unit to default system output
        System.out.println(cu.toString());

	}

}
