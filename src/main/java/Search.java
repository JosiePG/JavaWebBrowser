import java.net.HttpURLConnection;
import java.net.URL;
public class Search{

    //http://www.google.com/

    // add specific execptions and detailed info for exception

    static int getRequest(String search_url){
        try{
            URL url = new URL(search_url);
            System.out.println(url.toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int response_code  = connection.getResponseCode()
            System.out.println("Response Code:"+response_code);

            if (response_code == HttpURLConnection.HTTP_OK){
                // get response
                // pass response html to response parser

            }


            connection.disconnect();
            return response_code;
        } catch (java.lang.Exception e) {
            return -1;
        }

    }

}
