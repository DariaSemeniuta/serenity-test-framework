package serenitytest.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Daria
 */
@DefaultUrl("http://skillsup.ua/")
public class TeamPage extends PageObject{
    public String startPage = "http://skillsup.ua/";
    public By aboutUs = By.linkText("О нас");
    public By ourTeam = By.linkText("Наша команда");
    public By path=By.className("name");
    public By position=By.className("position");
    private WebElement element;


    public Map findCoaches () {
        Map result = new HashMap<String,String>();
        List<WebElementFacade> nameCoach = findAll(path);
        String[] arrayName = new String[nameCoach.size()];
        List <WebElementFacade> positionCoach = findAll(position);
        String[] arrayPosition = new String[positionCoach.size()];
        int ind=0;
        for (WebElement i: nameCoach) {
            arrayName[ind] = i.getText();
            ind++;
        }
        ind=0;
        for (WebElement i: positionCoach) {
            arrayPosition[ind] = i.getText();
            ind++;
        }
        for (int i=0; i<ind;i++){
            result.put(arrayName[i],arrayPosition[i]);
        }
        return result;
    }


    public String getPosition (String nameCoach){
        return ((String) findCoaches().get(nameCoach)).toString();
    }

    public  void goToCoachPage () throws  Exception{
        Actions action = new Actions(getDriver());
        element=find(aboutUs);
        action.moveToElement(element);
        element=find(ourTeam);
        action.moveToElement(element);
        action.click().build().perform();
    }

}
