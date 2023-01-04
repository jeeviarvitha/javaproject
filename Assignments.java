package CalandarControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.get("http://ineuron-courses.vercel.app/login");
		
		Thread.sleep(3000);
          driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
          driver.findElement(By.id("password1")).sendKeys("ineuron");
          driver.findElement(By.xpath("//button[text()='Sign in']")).click();
          Thread.sleep(5000);
          driver.manage().window().maximize();
          WebElement element=driver.findElement(By.xpath("//span[text()='Manage']"));
          Actions act=new Actions(driver);
          act.moveToElement(element).perform();
          Thread.sleep(50000);
          driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
          Thread.sleep(60000);
       driver.findElement(By.xpath("//button[text()='Add New Course ']"));
       driver.findElement(By.id("thumbnail")).sendKeys("C:/Users/user/Desktop/15-04-2022.PNG");
       driver.findElement(By.id("name")).sendKeys("Automation");
       driver.findElement(By.id("description")).sendKeys("Automation");
       driver.findElement(By.id("instructorNameId")).sendKeys("Mukesh");
       driver.findElement(By.name("price")).sendKeys("7000");
       driver.findElement(By.name("startDate")).click();
       driver.findElement(By.xpath("//div[text()='10']")).click();
       driver.findElement(By.name("endDate")).sendKeys("03/15/2023");
       driver.findElement(By.xpath("//div[text()='Select Category']")).click();
       driver.findElement(By.xpath("//button[text()='Testing']")).click();
       Thread.sleep(8000);
       driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']//following::td[88]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']//following::td[88]")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

	}

}
