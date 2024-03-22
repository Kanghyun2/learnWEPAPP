package app13;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlSaramIN {
   private static Set<String> getLinks(String page) throws IOException {
      String url = "https://www.saramin.co.kr/zf_user/search?searchType=search&searchword=java&recruitPageCount=20&recruitPage=" 
            + page;
      
      Document document = Jsoup.connect(url).timeout(3000).get();
      Elements select = document.select("a[href]");
      
      Set<String> urls = new HashSet<>();	
      
      for (Element e : select) {
         String href = e.attr("href");
         if (href.startsWith("/zf_user/jobs/relay/view")) {
            urls.add("http://www.saramin.co.kr" + href);
         }
      }
      return urls;
   }
   
   private static String getJobInfo(String documentUrl) throws IOException {
      Document document = Jsoup.connect(documentUrl).timeout(3000).get();
      String jobInfo = document.select("meta[name=description]").first().attr("content");
      
      return jobInfo;
   }
   
   public static void main(String[] args) throws IOException {
      Set<String> links = getLinks("1");
      for (String l : links) {
         System.out.println(getJobInfo(l));
      }
   }
}
