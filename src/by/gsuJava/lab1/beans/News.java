package by.gsuJava.lab1.beans;

public class News {
  private String titel;
  private String description;
  private String pubDate;

  public String getTitel() {
    return titel;
  }

  public String getDescription() {
    return description;
  }

  public String getPubDate() {
    return pubDate;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public News() {
    super();
  }

  public News(String titel, String description, String pubDate) {
    super();
    this.titel = titel;
    this.description = description;
    this.pubDate = pubDate;
  }

  @Override
  public String toString() {
    return "News [titel=" + titel + ", description=" + description + ", pubDate=" + pubDate + "]";
  }
}
