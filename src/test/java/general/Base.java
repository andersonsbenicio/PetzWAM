package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    public WebDriver driver; // Objeto do Selenium WebDriver, vulgo bola
    //Ao usar Page Factory mudar de public para protected

    //criar um contrutor e inicializar os elementos do Page Factory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
