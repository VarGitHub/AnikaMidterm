package json.parser;

public class Headlines {
   private String source;
   private String author;
   private String title;
   private String description;
   private String url;
   private String urlToImage;
   private String publishedAt;
   private String content;

   public Headlines(String source, String author, String title, String desc, String url, String urlImg, String publAt, String content) {
      this.source = source;
      this.author = author;
      this.title = title;
      this.description = desc;
      this.url = url;
      this.urlToImage = urlImg;
      this.publishedAt = publAt;
      this.content = content;
   }

   public String getSource() {
      return source;
   }

   public String getAuthor() {
      return author;
   }

   public String getTitle() {
      return title;
   }

   public String getDescription() {
      return description;
   }

   public String getUrl() {
      return url;
   }

   public String getUrlToImage() {
      return urlToImage;
   }

   public String getPublishedAt() {
      return publishedAt;
   }

   public String getContent() {
      return content;
   }
}
