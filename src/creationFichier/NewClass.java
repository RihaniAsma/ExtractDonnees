/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationFichier;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.*;

/**
 *
 * @author Administrateur
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
            CSVWriter writer = new CSVWriter(new OutputStreamWriter(new FileOutputStream("data/extract/extractMotSentence/extract1.csv"), "UTF-8"), '\t',CSVWriter.NO_QUOTE_CHARACTER);
      CSVWriter writer1 = new CSVWriter(new OutputStreamWriter(new FileOutputStream("data/extract/extractMotSentence/extract2.csv"), "UTF-8"), '\t',CSVWriter.NO_QUOTE_CHARACTER);
      CSVWriter writer2 = new CSVWriter(new OutputStreamWriter(new FileOutputStream("data/extract/extractMotSentence/extract3.csv"), "UTF-8"), '\t',CSVWriter.NO_QUOTE_CHARACTER);
    CSVWriter writer3 = new CSVWriter(new OutputStreamWriter(new FileOutputStream("data/extract/extractMotSentence/extract4.csv"), "UTF-8"), '\t',CSVWriter.NO_QUOTE_CHARACTER);
    
        int i=1;
    CSVReader scanner=new CSVReader(new FileReader("data/extract/extractMotSentence/extractword.csv"),'\t');
    String[] line;
     while((line=scanner.readNext())!=null && i<508378){
        if(i<150000){
             writer.writeNext(line);
        }
        else{
        if(i>=150000 && i<300000){
        writer1.writeNext(line);
        }
        else{
        if(i>=300000 && i<450000)
            {
        writer2.writeNext(line);
        }
         else{
        if(i>=450000 && i<508378)
            {
        writer3.writeNext(line);
        }
        }
        }
        } 
       i++;
    }
      writer.close();
       writer1.close();
        writer2.close();
        writer3.close();
     }
}
    

