package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class GUIElementsPage {

    WebDriver driver;

    public GUIElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm() {

        driver.findElement(By.id("name"))
                .sendKeys("Aryan Raj");  

        driver.findElement(By.id("email"))
                .sendKeys("aryan@gmail.com");

        driver.findElement(By.id("phone"))
                .sendKeys("9876543210");

        driver.findElement(By.id("textarea"))
                .sendKeys("Patna, Bihar, India");
    }

    public void selectGender() {

        driver.findElement(By.id("male")).click();
    }

    public void selectDays() {

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("wednesday")).click();
        driver.findElement(By.id("friday")).click();
    }

    public void selectCountry() {

        Select country =
                new Select(driver.findElement(By.id("country")));

        country.selectByVisibleText("India");
    }

    public void selectColor() {

        Select color =
                new Select(driver.findElement(By.id("colors")));

        color.selectByVisibleText("Blue");
    }

    public void selectSortedList() {

        Select animals =
                new Select(driver.findElement(By.id("animals")));

        animals.selectByVisibleText("Cat");
    }

    public void chooseDate() {

        WebElement date =
                driver.findElement(By.id("datepicker"));

        date.sendKeys("07/07/2026");
    }
    
    public void chooseDate1() {

    	driver.findElement(By.id("txtDate")).click();

    	// Select Month
    	Select month = new Select(
    	    driver.findElement(By.className("ui-datepicker-month"))
    	);
    	month.selectByVisibleText("Jul");

    	// Select Year
    	Select year = new Select(
    	    driver.findElement(By.className("ui-datepicker-year"))
    	);
    	year.selectByVisibleText("2026");

    	// Select Day
    	driver.findElement(
    	    By.xpath("//a[text()='15']")
    	).click();
    }

    
    public void chooseDateRange() {
    	// Start Date
    	WebElement startDate = driver.findElement(By.id("start-date"));
    	startDate.sendKeys("07/01/2026");

    	// End Date
    	WebElement endDate = driver.findElement(By.id("end-date"));
    	endDate.sendKeys("07/15/2026");
    	
    	driver.findElement(
        	    By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")
        	).click();
    }
    
    public void uploadFile() {

    String filePath = System.getProperty("user.dir") + "\\Book1.xlsx";

    System.out.println("Uploading file: " + filePath);

    driver.findElement(By.id("singleFileInput"))
          .sendKeys(filePath);
}

    public void moveSlider() {

        WebElement slider =
                driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));

        Actions action = new Actions(driver);

        action.dragAndDropBy(slider, 100, 0).perform();
    }

    public void handleAlert() {

        driver.findElement(By.id("alertBtn")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
    }
    
    public void handleAlert1() {

        driver.findElement(By.id("confirmBtn")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
    }
    
    public void handleAlert2() {

        driver.findElement(By.id("promptBtn")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
    }

    public void mouseHover() {

        WebElement hoverBtn =
                driver.findElement(By.xpath("//button[text()='Point Me']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(hoverBtn).perform();
    }

    public void doubleClick() {

        WebElement field =
                driver.findElement(By.id("field1"));

        field.clear();
        field.sendKeys("Selenium");

        WebElement copyBtn =
                driver.findElement(By.xpath("//button[text()='Copy Text']"));

        Actions actions = new Actions(driver);

        actions.doubleClick(copyBtn).perform();
    }

    public void dragAndDrop() {

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, target).perform();
    }

    public boolean verifyDragDrop() {

        String text = driver.findElement(By.id("droppable")).getText();

        return text.contains("Dropped");
    }
    
    
    public void selectScrollDropdown() {

        WebElement dropdown = driver.findElement(By.id("comboBox"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", dropdown);

        Select select = new Select(dropdown);

        select.selectByVisibleText("Item 50");

        System.out.println("Selected: "
                + select.getFirstSelectedOption().getText());
    }
    
    public boolean verifyScrollDropdown() {

        Select select =
                new Select(driver.findElement(By.id("comboBox")));

        String actual =
                select.getFirstSelectedOption().getText();

        System.out.println("Actual Selected Value: " + actual);

        return actual.equalsIgnoreCase("Item 50");
    }    
    
    public void submitSection1() {

        WebElement textBox = driver.findElement(
                By.xpath("//*[@id=\"input1\"]"));

        textBox.clear();
        textBox.sendKeys("This is Section 1 data");

        driver.findElement(
                By.xpath("//*[@id=\"btn1\"]"))
                .click();
    }

    public void submitSection2() {

        WebElement textBox = driver.findElement(
                By.xpath("//*[@id=\"input2\"]"));

        textBox.clear();
        textBox.sendKeys("This is Section 2 data");

        driver.findElement(
                By.xpath("//*[@id=\"btn2\"]"))
                .click();
    }
    public void submitSection3() {

        WebElement textBox = driver.findElement(
                By.xpath("//*[@id=\"input3\"]"));

        textBox.clear();
        textBox.sendKeys("This is Section 3 data");

        driver.findElement(
                By.xpath("//*[@id=\"btn3\"]"))
                .click();
    }
    
    public void wikipedia() {

        WebElement textBox = driver.findElement(
                By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]"));

        textBox.clear();
        textBox.sendKeys("India");

        driver.findElement(
                By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input"))
                .click();
    }
    
    public void clickDynamicButton() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[@id=\"HTML5\"]/div[1]/button")))
                .click();
    }
    
    public void pagination() {

    	driver.findElement(By.xpath("//*[@id=\"pagination\"]/li[1]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"pagination\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input")).click();
    }
}
