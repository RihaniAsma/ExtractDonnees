/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creationFichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author acer
 */
public class FichierMots {
        public static void main(String[] args) throws FileNotFoundException, IOException{
    
//Scanner scanner=new Scanner(new File("data/input/essai.txt"), "UTF-8");
Scanner scanner=new Scanner(new File("data/Only_NARR_field/ambigous_querieslimmatizer.txt"), "UTF-8");
        Set<String> mots=new TreeSet<String>();
// On boucle sur chaque champ detecté
while (scanner.hasNextLine()) {
    String sentence = scanner.nextLine().toLowerCase();
 
         if(!sentence.isEmpty()&&!sentence.startsWith(" ")&&!sentence.contains("$")&&!sentence.contains("&"))
         {
             String[] listmot=sentence.split(" ");
             for(String mot:listmot)
                 if(!mot.contains("|"))
                 mots.add(mot.toLowerCase());
  
         }
       
}
 Vector vec= new  Vector();
 int i=1;
 for(String mot:mots){
     if(!vec.contains(mot))
     vec.add(mot);
 }
 FileManager managefile=new FileManager();
 managefile.creation_fichier("data/Only_NARR_field/mots_queries.txt",vec, "UTF-8");
        
    scanner.close();
    }
}
