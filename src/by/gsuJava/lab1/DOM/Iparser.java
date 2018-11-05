package by.gsuJava.lab1.DOM;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.xml.sax.SAXException;
import by.gsuJava.lab1.beans.News;

public interface Iparser {
  public List<News> getNewsDOM()throws IOException, ParserConfigurationException,SAXException;
  public List<News> getNewsSax()throws IOException, ParserConfigurationException, SAXException;
  public List<News> getNewsStax(InputStream stream)throws IOException, ParserConfigurationException, XMLStreamException;


}
