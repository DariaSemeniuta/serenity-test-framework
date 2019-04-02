package serenitytest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.PagePersonalCard;
import serenitytest.pages.SearchPage;
import serenitytest.pages.TeamPage;
import serenitytest.pages.TrainingPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class EndUserSteps extends ScenarioSteps {
    TeamPage coachPage;
    PagePersonalCard card;
    SearchPage searchPage;
    TrainingPage trainingPage;
    @Step
    public void openPage () {
        coachPage.open();
    }
    @Step
    public void openCoachPage () throws Exception {
        coachPage.goToCoachPage();
    }
    @Step
    public void checkCoaches(String nameCoach,String position){
        assertTrue(coachPage.findCoaches().containsKey(nameCoach));
        assertEquals(position, coachPage.getPosition(nameCoach));
    }
    @Step
    public void openCard(String nameCoach) {
        card.goToCard(nameCoach);
    }
    @Step
    public void checkCourse (String course){
        assertEquals(course, card.findCourses());
    }

    @Step
    public void openHomePage() {searchPage.open();}
    @Step
    public void search (String value){
        searchPage.enterSearchValue(value);
    }
    @Step
    public void checkResults (String title, String description ){
        assertTrue(searchPage.findResult().containsKey(title));
        assertTrue(searchPage.getDescription(title).contains(description));
    }
    @Step
    public void checkEmptyResult(String result){
        assertFalse(searchPage.findResult().containsKey(result));
    }
    @Step
    public void goToTraining () {trainingPage.goToTraining();}
    @Step
    public void checkContent (String amount,String price){
        assertTrue(trainingPage.getAmount().contains(amount));
        assertTrue(trainingPage.getPrice().contains(price));
    }
}
