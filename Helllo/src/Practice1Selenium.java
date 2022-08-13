import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowmy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.youarehome.co/";
		driver.get(url);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		int titlelength=driver.getTitle().length();
		System.out.println("The page title is "+title);
		System.out.println("The page title length is "+titlelength);
		String currentPageUrl=driver.getCurrentUrl();
		if(currentPageUrl.equals(url)) {
			System.out.println("The Page Url Verification is success ");
		}
		else {
			System.out.println("The page Url is incorrect and Verification failed ");
			System.out.println("The actual url is "+url);
			System.out.println("The expected url is "+currentPageUrl);
		}
		String pageSource=driver.getPageSource();
		int pageSourceLength=driver.getPageSource().length();
		System.out.println("The Page source length is "+pageSourceLength);
	}

}
