package by.gsuJava.lab1.DOM;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import by.gsuJava.lab1.beans.Handler;
import by.gsuJava.lab1.beans.News;

public class AllParser implements Iparser {

  @Override
  public List<News> getNewsDOM() throws IOException, ParserConfigurationException, SAXException {
    List <News> NewsList = new ArrayList<>();
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();

    URL url = new URL("https://naviny.by/rss/alls.xml");
    InputStream stream = url.openStream();
    Document document = builder.parse(stream);

    String elem = document.getDocumentElement().getNodeName();
   System.out.println(elem);
   NodeList itemList = document.getElementsByTagName("item");
     String titel; String description; String pubDate;
      for(int i = 0; i < itemList.getLength(); i++) {
         Element element = (Element)itemList.item(i);
         titel = element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue();
         System.out.println(titel);
         description = element.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
         System.out.println(description);
         pubDate = element.getElementsByTagName("pubDate").item(0).getChildNodes().item(0).getNodeValue();
         System.out.println(pubDate);
         System.out.println("=================");
         NewsList.add(new News(titel, description, pubDate));
      }
      System.out.println(NewsList);
    return NewsList;
  }

  @Override
  public List<News> getNewsSax() throws IOException, ParserConfigurationException, SAXException {
    List <News> NewsList = new ArrayList<>();
    Handler handler = new Handler();
    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
    SAXParser parser = saxParserFactory.newSAXParser();
    
    URL url = new URL("https://naviny.by/rss/alls.xml");
    InputStream stream = url.openStream();
    parser.parse(stream, handler);
    

      
    return NewsList;
  }

  @Override
  public List<News> getNewsStax() throws IOException, ParserConfigurationException {
    // TODO Auto-generated method stub
    return null;
  }

}
