import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookieValidation {

	public static String statusURL;
	public static String testURL = "http://demo.guru99.com/test/cookie/selenium_aut.php";

	public static Set<Cookie> cookiestore = new HashSet<>();

	public static String cookieName, cookieValue, cookiePath, cookieDomain;
	
	public static Date cookieExpiry;
	
	public static Boolean cookieSecure;
	
	public static Cookie testCookie;
	
	static Cookie filecontains;

/*	public static int statusCodeCheck(String url) throws IOException {

		int statusCodeURL;
		url = statusURL;
		URL yetToCheckURL = new URL(url);
		HttpURLConnection con = ((HttpURLConnection) yetToCheckURL.openConnection());
		con.connect();
		statusCodeURL = con.getResponseCode();
		System.out.println("The status code URL is -" + statusCodeURL);

		return statusCodeURL;

	}
*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(testURL);

		driver.findElement(By.name("username")).sendKeys("abc123");
		driver.findElement(By.name("password")).sendKeys("123xyz");
		driver.findElement(By.name("submit")).click();

		cookiestore = driver.manage().getCookies();

		System.out.println("Cookies Size" + cookiestore.size());

		System.out.println(cookiestore);
		
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
		
			for (Cookie ck : cookiestore) {
				Bwrite.write(ck.toString());
			}
			Bwrite.close();
			fileWrite.close();
			
	driver.quit();
	fetchCookie();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}}

	public static void fetchCookie() {
		 try{			
		     
		        File file = new File("Cookies.data");							
		        FileReader fileReader = new FileReader(file);							
		        BufferedReader Buffreader = new BufferedReader(fileReader);							
		        String strline;			
		        while((strline=Buffreader.readLine())!=null){									
		        	filecontains = new Cookie(strline, strline);
		        System.out.println("The File contains :"+strline);
		        }
		        
		        System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v84\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.manage().addCookie(filecontains);
				driver.get(testURL);
				System.out.println(driver.getTitle());
		        driver.quit();
		        
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}