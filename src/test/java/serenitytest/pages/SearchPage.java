package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dsemeniuta
 */
@DefaultUrl("http://skillsup.ua/")
public class SearchPage extends PageObject {
    private By inputSearch = By.id("u5016-2");
    private By buttonSearch = By.id("u1552-2");
    private By searchResult = By.className("xsltsearch_result");
    private By searchResultTitle = By.className("xsltsearch_title");
    private By searchResultDescription = By.className("xsltsearch_description");

    private WebElement element;

    public void enterSearchValue(String value) {
        element = find(inputSearch);
        element.sendKeys(value);
        WebElement buttonFind=find(buttonSearch);
        buttonFind.click();
    }

    public Map findResult() {
        Map result = new HashMap<String, String>();
        List<WebElementFacade> titles = findAll(searchResultTitle);
        List<WebElementFacade> description = findAll(searchResultDescription);
        String[] arrayTitle = new String[titles.size()];
        String[] arrayDescription = new String[description.size()];
        int ind = 0;
        for (WebElement i : titles) {
            arrayTitle[ind] = i.getText();
            ind++;
        }
        ind = 0;
        for (WebElement i : description) {
            arrayDescription[ind] = i.getText();
            ind++;
        }
        for (int i = 0; i < ind; i++) {
            result.put(arrayTitle[i], arrayDescription[i]);
        }
        return result;
    }
    public String getDescription (String title){
        return findResult().get(title).toString();
    }
}
