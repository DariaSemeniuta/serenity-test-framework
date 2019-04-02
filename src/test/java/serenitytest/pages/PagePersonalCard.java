package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Daria
 */
public class PagePersonalCard extends PageObject {
    private By name = By.className("greenHeader");
    private String pathToCard = "//div[@class='team-list clearfix']/div[@class='member']/a/span[contains(text(),'";
    private By pathToListCourses = By.xpath("//div [@class='text']/ul/li");
    WebElement element;

    public void goToCard(String coachName) {
        element=find(By.xpath(pathToCard+coachName+"')]"));
        element.click();
    }
    public String findNameHeader() throws Exception{
        element=find(name);
        return element.getText();
    }
    public String findCourses (){
        String listCourses = "";
        try {
            List<WebElementFacade> courses = findAll(pathToListCourses);
            for (WebElement i : courses)
                listCourses = listCourses + i.getText();
        }
        catch ( NoSuchElementException e){
            listCourses="";
        }
        return listCourses;
    }
}
