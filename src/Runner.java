import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import by.gsuJava.lab1.DOM.AllParser;

public class Runner {

  public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
    AllParser parser = new AllParser();
    parser.getNewsSax();
  }

}
