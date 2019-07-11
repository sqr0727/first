package test;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            StringWriter stringWriter= new StringWriter();
            PrintWriter writer= new PrintWriter(stringWriter);
            e.printStackTrace(writer);
            StringBuffer buffer= stringWriter.getBuffer();
            String error = buffer.toString();
            System.out.println(error);
        }
    }
}
