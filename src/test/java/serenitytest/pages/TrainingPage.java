package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Daria on 11.06.2016.
 */
@DefaultUrl("http://skillsup.ua/")
public class TrainingPage extends PageObject {

    private By meny=By.id("menu1078");
    private By trainings = By.id("subMenuSubNodes1190");
    private By liderWay = By.linkText("Путь лидера");
    private WebElement element;
    private By amountPath = By.xpath("//div[@id='page_position_content']/div[3]/div/div/div[1]/div/p[5]");
    private By pricePath = By.xpath("//div[@id='page_position_content']/div[3]/div/div/div[1]/div/p[9]");
    private Actions action=new Actions(getDriver());
    public void goToTraining() {
        element=find(meny);
        action.moveToElement(element);
        element=find(trainings);
        action.moveToElement(element);
        element=find(liderWay);
        action.moveToElement(element).click().perform();
    }
    public String getAmount(){
        element=find(amountPath);
        return element.getText();
    }
    public String getPrice(){
        element = find(pricePath);
        return element.getText();
    }

}
