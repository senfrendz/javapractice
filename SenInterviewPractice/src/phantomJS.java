import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class phantomJS {

	public static String statusURL;
	
	public static int statusCodeCheck(String url) throws IOException {
		
		int statusCodeURL;
		url = statusURL ;
		URL yetToCheckURL = new URL(url);
		HttpURLConnection con = ((HttpURLConnection)yetToCheckURL.openConnection());
		con.connect();
		statusCodeURL = con.getResponseCode();
		System.out.println("The status code URL is -"+statusCodeURL);
		
		
		return statusCodeURL;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("phantomjs.binary.path", "F:\\Testing Tools\\phantomjs\\bin\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();	
		
		driver.get("https://www.amazon.com/error");
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
		
		try {
		
			TakesScreenshot src = ((TakesScreenshot)driver);
			
			File srcFile = src.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(srcFile, new File("Screenshots\\" + "sen.png"));
		
			statusURL = driver.getCurrentUrl();
			
			statusCodeCheck(statusURL);	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Screenshot taken as expected");
		
		Thread.sleep(5000);
	}

}
