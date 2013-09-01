/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationFichier;

import com.romanseval.preprocess.TokenizerPipeline;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Rihani Asma
 */
public class LimmatizerRequete {

     public static void main(String[] args) throws FileNotFoundException, IOException {
     
     
      String file="data/Only_NARR_field/ambigous_querieslimmatizer.txt";
       FileManager managefile=new FileManager();
       Vector result= new Vector();
         Vector vec=managefile.fileToVector("data/Only_NARR_field/ambigous_queries_stemmed_trec2003.txt", "UTF-8");
       for(int i=0;i<vec.size();i++){
         String ligne=vec.elementAt(i).toString();
       if(ligne.startsWith("<narr>"))
         {
             String req=ligne.replace("<narr>", "");
             req=req.replace("</narr>", "");
             req=req.replaceAll("\\d", " ");
            String ligne2=TokenizerPipeline.tokenizeSentence(req);
         result.add(ligne2);
       }  
     }
      vec.clear();
         managefile.creation_fichier(file, result, "UTF-8");
         result.clear();
     }
    
}
