package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {
    @When("^User successfully enters the log in details$")

    public void user_successfully_enters_the_log_in_details() throws InterruptedException {

        sign_in_portal_for_username();
        sign_in_portal_for_password();
        sign_in_portal_login_button();
    }
}
