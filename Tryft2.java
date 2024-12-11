package taskASSINGMENT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tryft2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//for failed login test
WebDriver driver0=new ChromeDriver();
		
		driver0.manage().window().maximize();
		
//**login provided credentials**//	
		driver0.get("https://kanban.jagadishk.dev/");
		WebElement usernameField0 = driver0.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
        usernameField0.sendKeys("testadmi");

        // Fill in the password
        WebElement passwordField0 = driver0.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
        passwordField0.click();  // click before sending keys if necessary
        passwordField0.sendKeys("Testadmin12345");

        // Click the Sign in button
        WebElement signInButton0 = driver0.findElement(By.xpath("//button[text()='Sign in']"));
        signInButton0.click();
		
		driver0.quit();
		
		
		
		
		// Fill in the username
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//**login provided credentials**//	
		driver.get("https://kanban.jagadishk.dev/");
		WebElement usernameField = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
        usernameField.sendKeys("testadmin");

        // Fill in the password
        WebElement passwordField = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
        passwordField.click();  // click before sending keys if necessary
        passwordField.sendKeys("Testadmin123");

        // Click the Sign in button
        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        signInButton.click();

        // Click on 'Test Admin '
        WebElement testAdminLink = driver.findElement(By.xpath("//*[@class='avatar avatar-20 avatar-inline']"));
        testAdminLink.click();

        // Click on 'My profile'
        WebElement myProfileLink = driver.findElement(By.xpath("(//a[contains(text(), 'My profile')])[2]"));
        myProfileLink.click();

        // Click on 'Change password'
        WebElement changePasswordLink = driver.findElement(By.xpath("//a[text()='Change password']"));
        changePasswordLink.click();

        // Fill in the current password
        WebElement currentPasswordField = driver.findElement(By.xpath("//*[@name='current_password']"));
        currentPasswordField.click();  // click before sending keys if necessary
        currentPasswordField.sendKeys("Testadmin123");

        // Fill in the new password
        WebElement newPasswordField = driver.findElement(By.xpath("//*[@name='password']"));
        newPasswordField.click();
        newPasswordField.sendKeys("Testadmin1234");

        // Fill in the confirmation password
        WebElement confirmPasswordField = driver.findElement(By.xpath("//*[@name='confirmation']"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys("Testadmin1234");

        // Click the 'Save' button
        WebElement saveButton = driver.findElement(By.xpath("//*[@type='submit']"));
        saveButton.click();

  
        // LOG OUT 
        
     //   
        
        // Add any necessary assertions or waits here if needed
//** create new user**//
       
        // Click on 'New user'


        WebElement newUserLink = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
        newUserLink.click();

       
        

        
        Thread.sleep(2000);
        WebElement usernameField1 = driver.findElement(By.xpath("//*[@id='form-username']"));
        usernameField1.click();
        usernameField1.sendKeys("testmanager");
        
        WebElement role = driver.findElement(By.xpath("//*[@name='role']"));
        Select s= new Select(role);
        s.selectByVisibleText("Manager");

        WebElement passwordField1 = driver.findElement(By.xpath("//*[@name='password']"));
        passwordField1.click();
        passwordField1.sendKeys("testmanager");

        WebElement confirmPasswordField1 = driver.findElement(By.xpath("//*[@name='confirmation']"));
        confirmPasswordField1.click();
        confirmPasswordField1.sendKeys("testmanager");
        
        WebElement saveButton1 = driver.findElement(By.xpath("//*[@type='submit']"));
        saveButton1.click();

    
        Thread.sleep(2000);
        WebElement newUserLink2 = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
        newUserLink2.click();
        
        Thread.sleep(2000);
       WebElement usernameField2 = driver.findElement(By.xpath("//*[@id='form-username']"));
        usernameField2.click();
         usernameField2.sendKeys("testuser");
         
         WebElement role2 = driver.findElement(By.xpath("//*[@name='role']"));
         Select s2= new Select(role2);
         s2.selectByVisibleText("User");

         WebElement passwordField2 = driver.findElement(By.xpath("//*[@name='password']"));
         passwordField2.click();
         passwordField2.sendKeys("testuser");

         WebElement confirmPasswordField2 = driver.findElement(By.xpath("//*[@name='confirmation']"));
         confirmPasswordField2.click();
         confirmPasswordField2.sendKeys("testuser");

         WebElement saveButton2 = driver.findElement(By.xpath("//*[@type='submit']"));
         saveButton2.click();
       
        
        
         Thread.sleep(2000);
         WebElement newUserLink3 = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
         newUserLink3.click();
         
         Thread.sleep(2000);
        WebElement usernameField3 = driver.findElement(By.xpath("//*[@id='form-username']"));
         usernameField3.click();
          usernameField3.sendKeys("testviewer");
          
         
          
         Thread.sleep(2000);
         WebElement passwordField3 = driver.findElement(By.xpath("//*[@name='password']"));
      
          passwordField3.click();
          passwordField3.sendKeys("testviewer");

          WebElement confirmPasswordField3 = driver.findElement(By.xpath("//*[@name='confirmation']"));
          confirmPasswordField3.click();
          confirmPasswordField3.sendKeys("testviewer");
          
       
          WebElement role3 = driver.findElement(By.xpath("//*[@id='form-role']"));
          Thread.sleep(2000);
          Select s3= new Select(role3);
          s3.selectByVisibleText("User");
          

          WebElement saveButton3 = driver.findElement(By.xpath("//*[@type='submit']"));
          saveButton3.click();
       
          
  //***************create new project****//
   

          
          WebElement testAdminLink1 = driver.findElement(By.xpath("//strong[text()='testadmin']"));
         testAdminLink1.click();
       //strong[text()='testadmin']"
         ////*[@class='avatar avatar-20 avatar-inline']
       //   WebElement dashbord = driver.findElement(By.xpath("//*[@title='Dashboard']"));
         // dashbord.click();
      
        WebElement projectsManagementLink = driver.findElement(By.xpath("(//*[@href='/projects'])[2]"));
        projectsManagementLink.click();

          // Click on 'New project'
          WebElement newProjectLink = driver.findElement(By.xpath("(//*[text()='New project'])[1]"));
          newProjectLink.click();

          // Fill out the project details
          WebElement nameField = driver.findElement(By.xpath("//*[@name='name']"));
          nameField.sendKeys("Tests Project");

          WebElement identifierField = driver.findElement(By.xpath("//*[@name='identifier']"));
          identifierField.click();
          identifierField.sendKeys("xTP");

          // Click the 'Save' button
       WebElement saveButton6 = driver.findElement(By.xpath("//*[@type='submit']"));
        saveButton6.click();
          
          //4
        //  WebElement testAdminLink = driver.findElement(By.xpath("//a[text()='testadmin ']"));
          testAdminLink.click();

          // Click on 'Logout'
          WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Logout']"));
          logoutLink.click();


    }


	}
