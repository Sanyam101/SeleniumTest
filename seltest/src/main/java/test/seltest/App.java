package test.seltest;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Hello world!
 *
 */
public class App 
{
   
        public static void main(String[] args) 
	{
		abc obj = new abc();
		File file = new File("/home/chawla_sanyam101/phantomjs-2.1.1-linux-i686/bin/phantomjs");	
        
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
		WebDriver driver = new PhantomJSDriver();	
		driver.get("http://35.200.188.228:8082/");  
		System.out.println("hi");
		boolean element = driver.getPageSource().contains("Hello World");
		obj.printMessage(element);
	}
	
	public String printMessage(boolean element){
		
		if(element==true)
		{
			System.out.println("successfull deployment");
			return "successfull deployment";
		}
		else
		{
			System.out.println("unsuccessfull deployment");
			return "unsuccessfull deployment";
		}
	}
    }

