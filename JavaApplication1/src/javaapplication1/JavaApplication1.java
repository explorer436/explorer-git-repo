/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author harshavardhanedupuganti
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) 
//    {
//        System.out.println("started the program..");
//        
//        try
//        {
//            //URL url = new URL("http://www.canistream.it/search/movie/papilon");
//            URL url = new URL("https://www.netflix.com/search/papillon");
//            
//            URLConnection urlc = url.openConnection();
//            //urlc.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; "
//            //    + "Windows NT 5.1; en-US; rv:1.8.0.11) ");
//            urlc.connect();
//            
//            String headerName=null;
//            for (int i=1; (headerName = urlc.getHeaderFieldKey(i))!=null; i++) 
//            {
//                System.out.println("headerName : " + urlc.getHeaderFieldKey(i));
//                if (headerName.equals("Set-Cookie")) 
//                {                  
//                    String cookie = urlc.getHeaderField(i); 
//                    
//                    System.out.println("cookie : " + cookie);
//                    
//                    cookie = cookie.substring(0, cookie.indexOf(";"));
//                    String cookieName = cookie.substring(0, cookie.indexOf("="));
//                    System.out.println("cookieName : " + cookieName);
//                    String cookieValue = cookie.substring(cookie.indexOf("=") + 1, cookie.length());
//                    System.out.println("cookieValue : " + cookieValue);
//                }
//            }
//            
//
//            InputStream is = urlc.getInputStream();
//            int c;
//            while ((c = is.read()) != -1)
//            System.out.print((char) c);
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        
//    }
}
