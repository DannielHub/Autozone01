package Features;

import ElementsSelect.ElementsLogin;
import org.testng.annotations.Test;

public class TestAutozone extends ClaseBase
{
    ElementsLogin elementsLogin = new ElementsLogin();

    @Test
    public void Login () throws InterruptedException {
        elementsLogin.Ingresar(driver).click();
        Thread.sleep(3000);

    }
}
