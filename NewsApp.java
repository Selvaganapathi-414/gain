import java.io.*;
import java.util.Scanner;
import java.net.*;

public class NewsApp {

    private static final String apikey = "8333b2f79fce401584d85be74ba42ffb";
    private static final String baseurl = "https://newsapi.org/v2/top-headlines?";

    public static void main(String args[]){

        try{

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Category (1/2/3): ");
            System.out.println("1.Sports\n2.Technology\n3.Business");

            String category = sc.nextLine();
            String apiurl = baseurl + "Category=" + category + "&language=en&apikey=" + apikey;
            HttpURLConnection con = (HttpURLConnection) new URL(apiurl).openConnection();
            con.setRequestMethod("GET");

            BufferedReader r = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line,json="";
            while((line = r.readLine()) != null){
                json += line;
            }
            r.close();

            int index = 0;
            while((index = json.indexOf("\"title\";\"")) != 1){
                int endIndex = json.indexOf("\"" , index+9);
                System.out.println("Title : " + json.substring(index+9,endIndex));
                index = endIndex + 1;
            }
        }

        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }

    }
}
