package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.json.Json;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */


   public static void main(String[] args) throws MalformedURLException, IOException {
      // Connecting to the url
      String strUrl = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f";
      URL url = new URL(strUrl);
      URLConnection request = url.openConnection();
      request.connect();

      // Parsing
      JsonArray array = null;
      JsonParser jsonParser = new JsonParser();
      JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
      JsonObject obj = root.getAsJsonObject();
      array = obj.get("articles").getAsJsonArray();

      List<Headlines> list = new ArrayList<Headlines>();
      String source, author, title, description, tempUrl, urlToImage,publishedAt, content;
      for (int i = 0; i < array.size() - 1; i++) {
         JsonObject jObj = array.get(i).getAsJsonObject();
         JsonObject tempSource = jObj.get("source").getAsJsonObject();

         source = tempSource.get("name").toString();
         author = jObj.get("author").toString();
         title = jObj.get("title").toString();
         description = jObj.get("description").toString();
         tempUrl = jObj.get("url").toString();
         urlToImage = jObj.get("urlToImage").toString();
         publishedAt = jObj.get("publishedAt").toString();
         content = jObj.get("content").toString();

         list.add(new Headlines(source, author, title, description, tempUrl, urlToImage, publishedAt, content));
      }

      for(Headlines entry : list){
         System.out.println("Source: " + entry.getSource() + "\nAuthor: " + entry.getAuthor() + "\nTitle: "
                 + entry.getTitle() + "\nDescription: " + entry.getDescription() + "\nUrl: " + entry.getUrl()
                 + "\nUrl to Image: " + entry.getUrlToImage() + "\nPublished At: " + entry.getPublishedAt()
                 + "\nContent: " + entry.getContent() + "\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      }

   }
}
