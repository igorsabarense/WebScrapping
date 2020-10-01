import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
*@author Igor.Sabarense
*@version 1.0.1
*/

public class Main {


    public static void main (String [] args) throws IOException {

        final String URL = "https://www.americanas.com.br/";

        List<String> data = getData(URL);
        
        data.forEach( products -> System.out.println(products) );

        // Informações dos produtos em americanas.com.br , utilizando o CSS Selector como query para retirar as informações


    }
    
    public static List<String> getData(String URL){
        List<String> list = new ArrayList<String>();
        
        Document doc = Jsoup.connect(americanas).userAgent("mozilla/17.0").get();

        Elements temp = doc.select("div.iIuiWb");

        for (Element x : temp) {
            list.add(x.getElementsByTag("a").first().text());

        }
        
        return list;
        
    }
}
