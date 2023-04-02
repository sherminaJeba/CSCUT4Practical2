import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws Exception{
    	Scanner console = new Scanner(System.in);
        System.out.println("input file: ");
        String inputFile = console.next();
        System.out.println("output file : ");
        String outputFileName = console.next();
        
        File inputFileN = new File(inputFile);
        
       Scanner in = new Scanner(inputFileN);
      PrintWriter out = new PrintWriter(outputFileName);  
      
      
      while (in.hasNextLine())
     {
           String Line = in.nextLine();
         
        // out.println(Line);
         
      // System.out.println("output  file ");
        StringTokenizer st;
       st = new StringTokenizer(Line);
       
       
       while (st.hasMoreTokens()) {
            String Word1 =st.nextToken();
            String Word2 =st.nextToken();
            String Word3 =st.nextToken();
   
              String W11 =Word1.substring(0,1);
             String W12 =W11.toUpperCase();
             String W13 =Word1.substring(1);
            
             String W1 =W12+W13;
             
             
             String W21 =Word2.substring(0,1);
             String W22 =W21.toUpperCase();
            
             String W23 =Word2.substring(1);
            String W2 =W22+W23;
            
            String W31 =Word3.substring(0,2);
            String W32 =Word3.substring(2,4);
            String W33 =Word3.substring(4);
           String W3 = W31+"/"+W32+"/"+W33+"\n";
           out.print(W1+" "+W2+" "+W3);
           //System.out.printf("-%8s-%8s%10s\n",W1,W2,W3);
           out.println("\n");


    }
       
     
            
        }
      in.close();
      out.close(); 
    
}
}

