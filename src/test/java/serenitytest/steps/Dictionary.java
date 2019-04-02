package serenitytest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import serenitytest.steps.serenity.EndUserSteps;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the SkillsUp home page")
    public void givenTheUserSkillsUpHomePage() {
        endUser.openPage();
    }
    @When("the user go to Team Page")
    public void showCoachPage() throws Exception{ endUser.openCoachPage(); }
    @Then ("the user can see next coache <name> with position <position>")
    public void checkingCoaches (@Named("name") String name, @Named("position") String position){
        endUser.checkCoaches(name, position);
    }

    @Given("the user go to Team Page")
    public void goingToTeamPage() throws Exception{endUser.openPage(); endUser.openCoachPage();}
    @When ("the user can go to personal card of coach <name>")
    public void showCardPage (@Named("name") String name){endUser.openCard(name);}
    @Then ("the user see next course <course>")
    public void checkingCourse (@Named("course") String course){endUser.checkCourse(course);}

    @Given("the user is on the SkillsUp home page")
    public void givenTheUserHomePage() {
    endUser.openHomePage();
}
    @When ("the user type $value")
    public void searchingValue (String value){endUser.search(value);}
    @Then ("the user see next <result> with <description>")
    public void checkingResult (String result,String description){endUser.checkResults(result,description);}
    @Then ("the user doesn't see any results for $value")
    public void emptyResult(String value) {endUser.checkEmptyResult(value);}

    @When("the user go to Lider way trainig")
    public void goingToTraining() {endUser.goToTraining();}
    @Then("the user see that amount in group <amount> and price <price>")
    public void checkingContain(@Named("amount") String amount,@Named("price") String price){endUser.checkContent(amount,price);}

}
