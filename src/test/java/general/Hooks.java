package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {

    private Base base; //objeto local para a comunicação com o objeto da classe extendida

    //Construtor para a classe Base
    //public Hooks(WebDriver driver) {
    //    super(driver);
    //}
    public Hooks(Base base){
        super(base.driver);
        this.base = base;
    }

    //Before
    @Before
    public void setup(){

        //Onde esta o driver do browser
        System.setProperty("webdriver.chrome.driver","drivers/chrome/88/chromedriver.exe");

        //Instanciar o driver do chrome
        base.driver = new ChromeDriver();

        //Maximizar a tela
        base.driver.manage().window().maximize();

        //Definir espera implicita do Selenium WebDriver
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    //After
    @After
    public void tearDown(){

        base.driver.quit();//Destruir o objeto Selenium

    }
}
