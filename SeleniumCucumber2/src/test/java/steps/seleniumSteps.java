package steps;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.utils.FileUtil;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class seleniumSteps {

	public static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("wendriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\Workspace_Ibm_Manipal_Selenim_Cucumber_Nov2020\\SeleniumCucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		// Screen shot on failure
		if (scenario.isFailed()) {
			//To embed screenshot in extent report with cucumber
			String scenarioName = scenario.getName();
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			/*
			 *Embeds data into the report(s). Some reporters (such as the progress one) don't embed data, but others do (html and json). 
			 *Refer the website and go to EMBED method section --> //https://www.javadoc.io/doc/info.cukes/cucumber-core/1.2.5/cucumber/api/Scenario.html#embed-byte:A-java.lang.String-
			*/
			scenario.embed(screenshotBytes, "image/png");
			scenario.write(scenarioName);
			
			//To put screenshot in a folder with scenario name and date format
			Date d = new Date();
			String date = d.toString().replace(":", "_").replace("", "_");
			File fileTemp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File filePerm = new File("C:\\Users\\AshwiniND\\"+scenarioName+"_"+date+".png");
			FileUtils.copyFile(fileTemp, filePerm);
			
			
			
		}

		if (driver != null) {
			driver.quit();
		}

	}

	@Given("navigate to {string}")
	public void navigate_to(String url) {

		driver.get(url);

	}

	
	@When("We click on Sign up button page will redirect to registration page")
	public void we_click_on_Sign_up_button_page_will_redirect_to_registration_page() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
	}

	@Then("enter firstName {string} lastName {string} eMail {string} userName {string} Pass {string} confirmPass {string}")
	public void enter_firstName_lastName_eMail_userName_Pass_confirmPass(String fname, String lname, String email, String Uname, String pass, String confPass) throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"registration_firstname\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//*[@id=\"registration_lastname\"]")).sendKeys(lname);
		driver.findElement(By.xpath("//*[@id=\"registration_email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Uname);
		driver.findElement(By.xpath("//*[@id=\"pass1\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"pass2\"]")).sendKeys(confPass);
	}

	@Then("We click on Register button")
	public void we_click_on_Register_button() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"registration_submit\"]")).click();
	}
	@Then("We validate the {string} and {string}")
	public void we_validate_the(String Fname, String Lname) throws InterruptedException {
		System.out.println("Validating the registartion page");
		Thread.sleep(5000L);
		//String actualKeyword = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]/text()[2]")).getText();
		//Assert.assertEquals(keyword, actualKeyword);
		String actualText = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]")).getText();
		System.out.println(actualText);
		Assert.assertEquals(Fname.contains("Ashwini"), actualText.contains("Ashwini"));
		Assert.assertEquals(Lname.contains("N D"), actualText.contains("N D"));
		
	}

	@Then("click on img icon in top right corner")
	public void click_on_img_icon_in_top_right_corner() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
	}

	@Then("validate email id{string} which is entered.")
	public void validate_email_id_which_is_entered(String validateEmail) throws InterruptedException {
		System.out.println(validateEmail);
		Thread.sleep(5000L);
		String actualKeyword = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		System.out.println(actualKeyword);
		Assert.assertEquals(validateEmail, actualKeyword);
	}
	

	@Then("click on Home page tab to return to home page")
	public void click_on_Home_page_tab_to_return_to_home_page() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a")).click();
	}

	@Then("click on Compose link to send message to other user.")
	public void click_on_Compose_link_to_send_message_to_other_user() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();
		System.out.println("clicked on compose link");
	}

	@Then("enter Send to email id{string} and subject {string}")
	public void enter_Send_to_email_id_and_subject(String emailId, String subject) throws InterruptedException {
		Thread.sleep(5000L);
		//driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("naveen" + Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("naveen");
		driver.findElement(By.xpath("//li[contains(text(),'naveen1 naveen1 (naveen1)')]")).click();
				
		driver.findElement(By.xpath("//*[@id=\"compose_message_title\"]")).sendKeys("Subject of test mail");
	
	}

	@Then("enter Message description.")
	public void enter_Message_description() throws InterruptedException {
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		WebElement element= driver.findElement(By.xpath("//*[@class=\"cke_wysiwyg_frame cke_reset\"]"));
		driver.switchTo().frame(element);
		System.out.println("we are into iframe");
		driver.findElement(By.xpath("//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("Hi Naveen,"+ Keys.ENTER +" This is Test mail.."+ Keys.ENTER+" Thanks");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
	    
	}

	@Then("Click on send message")
	public void click_on_send_message() throws InterruptedException {
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"compose_message_compose\"]")).click();
	}

	@Then("validate the acknoledgement message displayed.")
	public void validate_the_acknoledgement_message_displayed() throws InterruptedException {
		String email_to = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]/b")).getText();
		System.out.println(email_to);
		Thread.sleep(5000);
	    Assert.assertEquals("naveen1 naveen1 (naveen1)", email_to);
	    System.out.println("user successfully acknoledged");
	}


}
