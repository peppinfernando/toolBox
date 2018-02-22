package com.portal.toolbox.Util;


import com.portal.toolbox.framework.AbstractPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by 323835 on 5/18/2017.
 */
public class CommonUtil extends AbstractPage


{

    public void setValue(List<List<String>> data, String fieldName, WebElement property) throws Throwable {

        String strValue1 = datapicker(data, fieldName);
        // String strproperty = property.toString();
        //strproperty = strproperty.replace("findElement", "findElements");
        //int intlength = strproperty.length();
        if (!strValue1.equalsIgnoreCase("")) {
            property.sendKeys(strValue1);
        } else {
            System.out.println("input Field is not mandatory or Null");
        }
    }

    public void sendData(List<List<String>> data, String fieldName) throws Throwable {

        String strValue1 = datapicker(data, fieldName);
        // String strproperty = property.toString();
        //strproperty = strproperty.replace("findElement", "findElements");
        //int intlength = strproperty.length();

    }


    public void clickElement(WebElement property) throws Throwable {

        property.click();

    }

    public String datapicker(List<List<String>> data, String fieldName) {
        boolean flag = false;
        String strValue = null;

        for (int i = 0; i < data.size(); i++) {

            //System.out.println(data.size());

            for (int k = 0; k < data.get(0).size(); k++) {
                //System.out.println(data.get(0).size());
                String searchKey = data.get(0).get(k).toString();

                if (searchKey.equalsIgnoreCase(fieldName)) {

                    strValue = data.get(1).get(k).toString();
                    flag = true;
                    break;

                }
                if (flag == true) {
                    break;
                }


                //coverWiz(searchKey,data.get(i).get(j));
            }
        }
        return strValue;
    }

    public void switchFrame(String frameName) throws Throwable {

        getDriver.switchTo().frame(frameName);
    }

    public void selectElement(List<List<String>> data, String fieldName, WebElement property) throws Throwable {

        String title = datapicker(data, fieldName);
        if (!title.equalsIgnoreCase("")) {

            new Select(property).selectByVisibleText(title);
        } else {
            System.out.println("Input data is not mandatory to set  ");

        }

    }


    public void clickbyJS(WebElement strProperty) {
        JavascriptExecutor executor = getDriver;
        executor.executeScript("arguments[0].click();", strProperty);
    }

    public void tabKeypress() throws Exception {

        Actions action = new Actions(getDriver);
        action.sendKeys(Keys.TAB).build().perform();

    }

    public void setValue(String data, WebElement property) throws Throwable {

        if (!data.equalsIgnoreCase("")) {
            property.sendKeys(data);
        } else {
            System.out.println("input Field is not mandatory or Null");
        }
    }

    public String[] futuredate() {

        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        Date lastDayOfMonth = calendar.getTime();
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String[] coverStartdt = sdf.format(lastDayOfMonth).split("-");
        return coverStartdt;
    }

    public String[] currentdate() {
        Date myDate = new Date();
        SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
        String mdy = mdyFormat.format(myDate);
        String[] coverStartdt = mdy.split("-");
        return coverStartdt;
    }


}
