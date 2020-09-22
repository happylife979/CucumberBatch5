package StepDefinition;


import Pages.WebOrderHomePage;
import Pages.WebOrdersLongInPage;
import Utilities.CommonUtils;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ListOfAllOrdersAppSteps {
WebDriver driver = Driver.getDriver("chrome");
WebOrdersLongInPage webOrdersLongInPage = new WebOrdersLongInPage();
WebOrderHomePage webOrderHomePage = new WebOrderHomePage();

    @Given("User navigates to WebOrders application and  provides username {string} and password {string}")
    public void user_navigates_to_web_orders_application_and_provides_username_and_password(String username, String password) {
        driver.get(CommonUtils.getProperty("WebOrdersURL"));
        webOrdersLongInPage.logIn(username,password);
    }
    @When("User clicks Edit button and update customer Name {string}")
    public void user_clicks_edit_button_and_update(String name) {
        webOrderHomePage.editButton.click();
       //webOrderHomePage.customerNameInTableOfOrders(name);
    }
    @Then("Use validates information is updated to {string}")
    public void use_validates_information_is_updated_to(String expectedName) {
        Assert.assertEquals(webOrderHomePage.customerNameInTableOfOrders.getText(), expectedName);
    }
    @When("User clear customerName field and update")
    public void user_clicks_edit_button_and_clear_customer_name_field_and_update() {
//        orderPage.updateButton.click();
//        orderPage.clearCustomerName();
//        Assert.assertTrue(orderPage.emptyErrorMessage.isDisplayed());
//    }
//    @Then("User is able to view {string}")
//    public void user_is_able_to_view(String string) {
//        Assert.assertTrue(orderPage.emptyErrorMessage.isDisplayed());

    }
}
