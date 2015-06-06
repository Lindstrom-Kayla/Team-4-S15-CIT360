/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DustinJudd;

/**
 *
 * @author dustinjudd
 */
public class HttpUrlConnection{
    public static void main(String[] args) {
        
    


URL url = new URL("http://www.dustinjudd.com/");
   HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
   try {
     InputStream input = new BufferedInputStream(urlConnection.getInputStream());
     readStream(input);
    finally {
     urlConnection.disconnect();
   }
 }
    }
}