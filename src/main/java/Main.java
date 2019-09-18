import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {


    public static void main (String [] args) throws IOException {

        final String americanas = "https://www.americanas.com.br/";

        Document doc = Jsoup.connect(americanas).userAgent("mozilla/17.0").get();

        Elements temp = doc.select("div.iIuiWb");

        for (Element x : temp) {
            System.out.println(x.getElementsByTag("a").first().text());

        }

        // Informações dos produtos em americanas.com.br , utilizando o CSS Selector como query para retirar as informações


    }
}
