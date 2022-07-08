import java.util.*;  
import java.io.*;  
public class TestProps {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("ou.properties");  
      
    Properties props = new Properties();  
    props.load(reader);  
      
    System.out.println(props.getProperty("OU_NAME"));  
    System.out.println(props.getProperty("OU_Identification"));  
    
    String test = "Hello World Amit";
    String test2 ="Amit";
    if(test.contains(test2)){
    	System.out.println("PASSED");
    }
}  
}  