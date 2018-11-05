import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import by.gsuJava.lab1.DOM.AllParser;
import by.gsuJava.lab1.beans.News;

public class Runner {

  public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
    AllParser parser = new AllParser();
    parser.getNewsDOM();
   // parser.getNewsSax();
//    URL url = new URL("https://naviny.by/rss/alls.xml");
//    InputStream stream = url.openStream();
//    List<News>listNews = parser.getNewsStax(stream);
//    System.out.println(listNews);
//    for(News news : listNews) {
//      System.out.println(news);
//    }    
  }

}
