/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;

/**
 *
 * @author harshavardhane
 */
public class PrintFileNamesInAFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //String folderLocation = "/Users/harshavardhane/Desktop/eBooks/Kindle Library (Final)/K";
        String folderLocation = "/Volumes/SIGNATURE/eBooks/Kindle Library (Final)/K";  
        
        int count = 1;
        
        readAuthors(folderLocation, count);
    }
    private static void readAuthors(String folderLocation, int count)
    {
        File folder = new File(folderLocation);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) 
        {
          if (listOfFiles[i].isFile()) 
          {
            System.out.println("File " + listOfFiles[i].getName());
          } 
          else if (listOfFiles[i].isDirectory()) 
          {
            //System.out.println("Author : "+listOfFiles[i].getName());
              count = readBooks(folderLocation+"/"+listOfFiles[i].getName(), count);
          }
        }
    }
    private static int readBooks(String location, int count)
    {
        File folder = new File(location);
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++) 
        {
          if (listOfFiles[i].isFile()) 
          {
            //System.out.println("File " + listOfFiles[i].getName());
          } 
          else if (listOfFiles[i].isDirectory()) 
          {
              System.out.println(count + ". " + location.substring(51) +" :: " + listOfFiles[i].getName());  
            //System.out.println( location +" } " + listOfFiles[i].getName()); 
            //System.out.println("Book : " + listOfFiles[i].getName());
              count++;
          }
        }
        return count;
    }
}
