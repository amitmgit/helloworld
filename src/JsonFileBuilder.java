import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class JsonFileBuilder {

	public static void main(String[] args) throws IOException {
		/****************Category File**************/
		String fileName = "25_LovePhotoFrame.json";
		/*******************************************/
		
		/*****************Keywords*****************/
		String[] arrKeyWords = {"Making Love Pictures With Text Edit","Online Love Frame Edit","Distress Banner Love Frame","Add Halo To Photo"};
		/*******************************************/
		
		String filePath = "C:/Users/Amit/Documents/Amit/ProjectOwn/HappyBirthdayCake24.com/Json_files/Category/";
		String destFilePath = "C:/Users/Amit/Documents/Amit/ProjectOwn/HappyBirthdayCake24.com/Json_files/FileGenerated/";
		generateCategoryJsonFile(arrKeyWords,filePath+fileName,destFilePath);
	}
	private static List<String> getJsonFileContent(String[] arrKeyWords){
		List<String> list  = new ArrayList<String>();
		String finalContent = "",str = "";
		String forSearchConsole = "";
		String site = "https://happybirthdaycake24.com/";
		String imgPUrl = "https://happybirthdaycake24.b-cdn.net/wp-content/uploads/";
		for(int i=0 ;i<arrKeyWords.length;i++){
			String articleParam = arrKeyWords[i].toLowerCase().replace(" ", "-");
			str = "{\"title\":\""+arrKeyWords[i]+"\",\"post_url\":\"/"+articleParam+"/\",\"img_url\":\""+imgPUrl+articleParam+".jpg\"},";
			finalContent += str; 
			forSearchConsole += (site+articleParam+"\n");
		}
		list.add(forSearchConsole);
		list.add(finalContent);
		return list;
	}
	
	private static void generateCategoryJsonFile(String[] arrKeyWords,String filePath,String destFilePath) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
		String addContent = "["+getJsonFileContent(arrKeyWords).get(1);
		String fContent = br.readLine().replace("[", addContent);
		//br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(destFilePath+"25.json")));
		//bw.write(fContent);
		//bw.close();
		System.out.println(getJsonFileContent(arrKeyWords).get(1));
		System.out.println(getJsonFileContent(arrKeyWords).get(0));
		System.out.println("****File Generated****");
	}
	private static void generateHomeJsonFile(String[] arrKeyWords,String filePath,String destFilePath) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
	}
}
