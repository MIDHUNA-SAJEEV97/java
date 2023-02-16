package propertiesFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TextDemo {
public static void main (String[] args) throws IOException
{
	FileReader fr=new FileReader("C:\\eclipse new\\My_maven122\\src\\main\\resources\\test.properties");
	Properties pr=new Properties();
	pr.load(fr);
	System.out.println(pr.getProperty("user_id"));
	System.out.println(pr.getProperty("user-name"));
	System.out.println(pr.getProperty("password"));
	pr.setProperty("email","midhusaj97@gmail.com");
   FileWriter w=new FileWriter("C:\\eclipse new\\My_maven122\\src\\main\\resources\\test.properties");
pr.store(w, null);
//pr.store(w, "first commit");

Properties p1=new Properties();
p1.setProperty("phone", "12345");
p1.store(new FileWriter("info.properties"),null);

}
}
