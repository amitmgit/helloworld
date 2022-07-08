import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;


public class URLOpener {

	public static void main(String[] args) {
		String filePath = "C:/File/Urls5.txt";
		String url = "";
		int passedCounter = 1;
		try {
		      File myObj = new File(filePath);
		      Scanner myReader = new Scanner(myObj);
		      int counter = 1;
		      
		      while (myReader.hasNextLine()) {
		        url = myReader.nextLine();
		        //System.out.println(url+"\n\r");
		        try{
			        String htmlBankState = Jsoup.connect(url).get().html();
			        //System.out.println(htmlBankState);
			        String chkContent = "happybirthdaycake24.com";
			        if(htmlBankState.contains(chkContent)){
			             //System.out.println(counter+" : "+url);
			             
			        }
		        }catch(Exception e){
		        	System.out.println(url);
		        	passedCounter++;
		        	continue;
		        }
		        //Desktop.getDesktop().browse(new URI(data));
		        //if(counter==40){
		        	//break;
		       // }
		        counter++;
		      }
		      myReader.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred."+url);
		      
		      //e.printStackTrace();
		    }
		System.out.println("Total missing backlinks : "+passedCounter);
	}

}
