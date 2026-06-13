package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.GUIElementsPage;
import utils.DriverFactory;

public class GUIElementsTest {

    WebDriver driver;
    GUIElementsPage page;

    @BeforeClass
    public void setup() {

        driver = DriverFactory.getDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        page = new GUIElementsPage(driver);
    }

    @Test(priority = 1)
    public void testFillForm() throws InterruptedException {

        page.fillForm();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void testSelectGender() throws InterruptedException {

        page.selectGender();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void testSelectDays() throws InterruptedException {

        page.selectDays();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void testSelectCountry() throws InterruptedException {

        page.selectCountry();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void testSelectColor() throws InterruptedException {

        page.selectColor();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void testSelectSortedList() throws InterruptedException {

        page.selectSortedList();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void testDatePicker1() throws InterruptedException {

        page.chooseDate();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void testDatePicker2() throws InterruptedException {

        page.chooseDate1();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void testDateRangePicker() throws InterruptedException {

        page.chooseDateRange();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void testFileUpload() throws InterruptedException {

        page.uploadFile();
        Thread.sleep(2000);
    }

    @Test(priority = 19)
    public void testSlider() throws InterruptedException {

        page.moveSlider();
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void testSimpleAlert() throws InterruptedException {

        page.handleAlert();
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void testConfirmationAlert() throws InterruptedException {

        page.handleAlert1();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void testPromptAlert() throws InterruptedException {

        page.handleAlert2();
        Thread.sleep(2000);
    }

    @Test(priority = 16)
    public void testMouseHover() throws InterruptedException {

        page.mouseHover();
        Thread.sleep(2000);
    }

    @Test(priority = 17)
    public void testDoubleClick() throws InterruptedException {

        page.doubleClick();
        Thread.sleep(2000);
    }

    @Test(priority = 18)
    public void testDragAndDrop() throws InterruptedException {

        page.dragAndDrop();
        Thread.sleep(2000);

        Assert.assertTrue(
                page.verifyDragDrop(),
                "Drag and Drop failed");
    }
    
//    @Test(priority = 18)
//    public void testScrollingDropdown() throws InterruptedException {
//
//        page.selectScrollDropdown();
//
//        Thread.sleep(2000);
//
//        Assert.assertTrue(
//                page.verifyScrollDropdown(),
//                "Scrolling Dropdown selection failed");
//    }
    
    @Test(priority = 21)
    public void testSection1Submit() throws InterruptedException {

        page.submitSection1();
        Thread.sleep(2000);
    }

    @Test(priority = 22)
    public void testSection2Submit() throws InterruptedException {

        page.submitSection2();
        Thread.sleep(2000);
    }

    @Test(priority = 23)
    public void testSection3Submit() throws InterruptedException {

        page.submitSection3();
        Thread.sleep(2000);
    }
    
    @Test(priority = 12)
    public void testDynamicButton() throws InterruptedException {

        page.clickDynamicButton();

        Thread.sleep(2000);

        System.out.println("Dynamic Button Clicked");
    }
    
    @Test(priority = 11)
    public void testWikipedia() throws InterruptedException {

        page.wikipedia();
        Thread.sleep(2000);
    }
    
    @Test(priority = 20)
    public void testPagination() throws InterruptedException {

        page.pagination();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {

        //driver.quit();
    }
}