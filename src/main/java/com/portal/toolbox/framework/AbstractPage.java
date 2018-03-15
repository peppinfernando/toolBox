package com.portal.toolbox.framework;

import com.google.common.base.Function;
import com.portal.toolbox.Util.GlobalVariables;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class AbstractPage  {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractPage.class);
    private static final int DRIVER_WAIT_TIME = 15;
    private static final int DEBUG_WAIT = 1000;
    private static final String ON_BEFORE_UNLOAD = "window.onbeforeunload = function(e){};";
    private static final String LOG_CONTEXT = "context";
    public static RemoteWebDriver getDriver;
    public HashMap<String, WebElement> commonElements = new HashMap();

    public AbstractPage() {
        //  WebDriver getDriver = new ChromeDriver();

        new WebDriverDiscovery();
        getDriver = WebDriverDiscovery.getRemoteWebDriver();
        new GlobalVariables();
    }

    private static Function<WebDriver, WebElement> presenceOfElementLocated(final By locator) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        return new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver getDriver) {
                return getDriver.findElement(locator);
            }
        };
    }

    public static WebElement findElementUsingFluentWait(final By by, int timeoutSeconds) {
        FluentWait<WebDriver> wait = (new FluentWait(getDriver)).withTimeout((long) timeoutSeconds, TimeUnit.SECONDS).pollingEvery(500L, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
        return (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return AbstractPage.getDriver.findElement(by);
            }
        });
    }

    public void deleteCookies() {
        getDriver.manage().deleteAllCookies();
    }

    public WebElement findElement(By by) {
        return getDriver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return getDriver.findElements(by);
    }

    public WebElement waitForUnstableElement(By by) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var3) {
            LOG.error(var3.getMessage());
        }

        return this.waitForElementPresent(by);
    }

    public WebElement waitForElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver, 15L);

        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (UnhandledAlertException var4) {
            LOG.info("context", var4);
            getDriver.switchTo().alert().dismiss();
            return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (NoAlertPresentException var5) {
            LOG.info("context", var5);
            getDriver.switchTo().alert().dismiss();
            return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }
    }

    public WebElement waitForElementPresent(By by, By sub_by) {
        WebDriverWait wait = new WebDriverWait(getDriver, 15L);

        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            return (WebElement) wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, sub_by));
        } catch (UnhandledAlertException var5) {
            LOG.info("context", var5);
            getDriver.switchTo().alert().dismiss();
            return (WebElement) wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, sub_by));
        } catch (NoAlertPresentException var6) {
            LOG.info("context", var6);
            getDriver.switchTo().alert().dismiss();
            return (WebElement) wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, sub_by));
        }
    }

    public List<WebElement> waitForElementsPresent(By by) {
        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            Wait<WebDriver> wait = new WebDriverWait(getDriver, 15L, 100L);
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return this.findElements(by);
        } catch (TimeoutException var3) {
            LOG.info("context", var3);
            return this.findElements(by);
        }
    }

    public WebElement waitForElementToBeClickableAndReturnElement(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        Wait<WebDriver> wait = new WebDriverWait(getDriver, 15L, 100L);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return getDriver.findElement(by);
    }

    public WebElement waitForExpectedElement(By by, int timeout) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        Wait<WebDriver> wait = new WebDriverWait(getDriver, (long) timeout);
        wait.until(this.visibilityOfElementLocated(by));
        return getDriver.findElement(by);
    }
    public WebElement checkForPresenceOfElement(By by, int timeout) {


        try{
            getDriver.findElement(by).isDisplayed();
            return getDriver.findElement(by);
        }
        catch(Exception e){
            return null;
        }
    }
    public WebElement waitAndFindElement(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        return this.waitForExpectedElement(by, 5);
    }
    public WebElement checkForElement(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        return this.checkForPresenceOfElement(by, 5);
    }

    public WebElement findEnabledElement(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        return this.waitForElementPresent(by);
    }

    public void waitForElementEnabled(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        Wait<WebDriver> wait = new WebDriverWait(getDriver, 15L);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement waitForElementVisible(By by) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        Wait<WebDriver> wait = new WebDriverWait(getDriver, 15L);
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) {
        return new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var3) {
                    AbstractPage.LOG.error(var3.getMessage());
                }

                AbstractPage.getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
                WebElement element = AbstractPage.getDriver.findElement(by);
                return element.isDisplayed() ? element : null;
            }
        };
    }

    protected WebElement retryingFindElement(By by) {
        int attempts = 0;

        while (attempts < 2) {
            try {
                return this.waitForExpectedElement(by, 2);
            } catch (Exception var4) {
                LOG.warn("Exceeding time to find element in retryingFindElement(): " + by, var4.getMessage());
                ++attempts;
            }
        }

        throw new PageOperationException("Unable to find the element:" + by);
    }

    protected List<WebElement> retryingFindElements(By by) {
        int attempts = 0;

        while (attempts < 3) {
            try {
                return this.waitForElementsVisible(by, 10);
            } catch (Exception var4) {
                LOG.warn("Exceeding time to find elements in retryingFindElements(): " + by, var4.getMessage());
                ++attempts;
            }
        }

        throw new PageOperationException("Unable to find the elements:" + by);
    }

    public List<WebElement> waitForElementsVisible(By by, int timeout) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver, (long) timeout);
        return (List) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void waitForMoreTime() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var2) {
            LOG.error(var2.getMessage());
        }

    }
    public void waitForMoreTime(int Value) {
        try {
            Thread.sleep(Value*1000L);
        } catch (InterruptedException var2) {
            LOG.error(var2.getMessage());
        }

    }

    public Boolean waitForElementInVisible(By by) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver, 15L);
        return (Boolean) wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void retryingClick(By by) {
        int attempts = 0;

        while (attempts < 30) {
            try {
                getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
                getDriver.findElement(by).click();
                break;
            } catch (Exception var4) {
                LOG.error("context", var4);
                ++attempts;
            }
        }

    }

    public void retryingElementClick(WebElement element) {
        int attempts = 0;

        while (attempts < 50) {
            try {
                getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
                element.click();
                break;
            } catch (Exception var4) {
                LOG.error("context", var4);
                ++attempts;
            }
        }

    }

    public Object executeScript(String string, WebElement element) {
        RemoteWebDriver jse = getDriver;

        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            return jse.executeScript(string, new Object[]{element});
        } catch (StaleElementReferenceException var5) {
            LOG.warn("context", var5);
            this.waitForPageLoad();
            return jse.executeScript(string, new Object[]{element});
        }
    }

    public Object executeScript(String script) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        return getDriver.executeScript(script, new Object[0]);
    }

    public String executeReturnScript(String script) {
        getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
        String imgeJs = getDriver.executeScript(script, new Object[0]).toString();
        return imgeJs;
    }

    public boolean elementDisplayed(By by) {
        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            Wait<WebDriver> wait = new WebDriverWait(getDriver, 5L);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            this.findElement(by);
            return true;
        } catch (Exception var3) {
            LOG.info("context", var3);
            return false;
        }
    }

    public boolean elementDisplayed(WebElement wb) {
        try {
            return wb.isDisplayed() ? true : true;
        } catch (Exception var3) {
            LOG.info("context", var3);
            return false;
        }
    }

    public boolean elementPresent(By by) {
        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            Wait<WebDriver> wait = new WebDriverWait(getDriver, 1L);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            this.findElement(by);
            return true;
        } catch (Exception var3) {
            LOG.info("context", var3);
            return false;
        }
    }

    public boolean elementClickable(By by) {
        try {
            getDriver.executeScript("window.onbeforeunload = function(e){};", new Object[0]);
            Wait<WebDriver> wait = new WebDriverWait(getDriver, 1L);
            wait.until(ExpectedConditions.elementToBeClickable(by));
            this.findElement(by);
            return true;
        } catch (Exception var3) {
            LOG.info("context", var3);
            return false;
        }
    }

    public void waitForPageLoad() {
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException var2) {
            LOG.info("context", var2);
        }

    }



    public void closeTabByIndex(int iWindowIndex) {
        Set<String> handles = getDriver.getWindowHandles();
        if (handles.size() > iWindowIndex) {
            String handle = handles.toArray()[iWindowIndex].toString();
            getDriver.switchTo().window(handle);
            getDriver.close();
        }

    }

    public void switchToWindowByIndex(int iWindowIndex) {
        Set<String> handles = getDriver.getWindowHandles();
        if (handles.size() > iWindowIndex) {
            String handle = handles.toArray()[iWindowIndex].toString();
            getDriver.switchTo().window(handle);
        }

    }

    public void switchToPopUpWindow() {
        String parentWindowHandler = getDriver.getWindowHandle();
        String subWindowHandler = null;
        Set<String> handles = getDriver.getWindowHandles();

        for (Iterator iterator = handles.iterator(); iterator.hasNext(); subWindowHandler = (String) iterator.next()) {
            ;
        }

        getDriver.switchTo().window(subWindowHandler);
    }

    public void switchToFrameById(WebElement wbFrame) {
        getDriver.switchTo().frame(wbFrame);
    }

    public void switchToParentFrame() {
        getDriver.switchTo().parentFrame();
    }

    public void switchToFrameByIndex(int i) {
        getDriver.switchTo().frame(i);
    }

    public void switchToDefault() {
        getDriver.switchTo().defaultContent();
    }

    public void switchToLastOpenWindow() {
        Set<String> handles = getDriver.getWindowHandles();
        if (handles.size() > 0) {
            String handle = handles.toArray()[handles.size() - 1].toString();
            getDriver.switchTo().window(handle);
        }

    }

    public void btnClick(WebElement btn) {
        getDriver.executeScript("arguments[0].click();", new Object[]{btn});
    }

    public void selectDrop(WebElement webSel, String strText) {
        Select oSelect = new Select(webSel);
        oSelect.selectByVisibleText(strText);
    }

    public WebElement findParentNode(WebElement wbChild) {
        WebElement myParent = (WebElement) this.executeScript("return arguments[0].parentNode;", wbChild);
        return myParent;
    }

    public void navigateBackward() {
        getDriver.navigate().back();
    }

    public class PageOperationException extends RuntimeException {
        public PageOperationException(String msg) {
            super(msg);
        }
    }
    public boolean isElementDisplayed(WebElement element){

        try{
            element.isDisplayed();
            return true;
        }
        catch(Exception e){
            return false;
        }


    }



    public void logCaseDeatils(String entity) {

        String title=getDriver.getTitle();
        String caseid=title.split("-")[0];
        GlobalVariables.entityname=entity.split(",")[0];
        String Scenario=GlobalVariables.scenarioname;


        BufferedWriter bw = null;
        FileWriter fw = null;
        String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);


        try {
            File file = new File(System.getProperty("user.dir") + "//Caseids.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(sdf.format(cal.getTime()));
            bw.newLine();
            bw.write("Entity name : " + entity);
            bw.newLine();
            bw.write(Scenario + " : " + caseid);
            bw.newLine();
            bw.write("*****************************************************************************");
            bw.newLine();


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }


        }
    }



}
