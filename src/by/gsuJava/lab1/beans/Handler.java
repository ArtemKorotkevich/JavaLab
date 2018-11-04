package by.gsuJava.lab1.beans;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

  private List<News> newsList;
  private News news;

  public List<News> getNews(){
    return newsList;
  }

  boolean bTitel = false;
  boolean bDescription = false;
  boolean bPubDate = false;

  @Override
  public void startDocument() throws SAXException {
    System.out.println("start pars");
  }

  @Override
  public void endDocument() throws SAXException{
    System.out.println("end parse");
  }

  @Override
  public void startElement(String namespace, String localName, String qName, Attributes attributes) {
    if(qName.equals("title")) {
      news = new News();
       if(newsList == null) {
        newsList = new ArrayList<>();
      }
      else if (qName.equals("title")) {
        String titel = attributes.getValue("title");
        news.setTitel(titel); 
        bTitel = true;
      }
     if (qName.equals("description")) {
        String description = attributes.getValue("description");
        news.setDescription(description);
        bDescription = true;
      }
      if (qName.equals("pubDate")) {
        String pubDate = attributes.getValue("pubDate");
        news.setPubDate(pubDate);
        bPubDate = true;
      }
    }
  }

  @Override
  public void endElement(String namespace, String localName, String qName) throws SAXException{
    if(qName.equalsIgnoreCase("item")) {
      newsList.add(news);
    }
  }

  @Override
  public void characters(char []ch, int start, int end) {
    if(bTitel) {
      news.setTitel(new String(ch, start, end));
      bTitel = false;
    }
    else if (bDescription) {
      news.setDescription(new String(ch, start, end));
      bDescription = false;
    }
    else if (bPubDate) {
      news.setPubDate(new String(ch, start, end));
    }
  }
}
