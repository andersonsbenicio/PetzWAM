package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {


    // 1 - Mapeamentos
    //texto do resultado para
    @FindBy(css = "h1.Categoria.nomeCategoria")
    private WebElement lblResultBy;

    // 2 - Construtor

    public List(WebDriver driver) {

        super(driver);
    }

    // 3 - Métodos e Funções baseados no Mapeamento

    //Lê o título da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }

    //Lê o frase Resultado para "Produto"

    public String readResultBy(){
        return lblResultBy.getText();
    }

    //Clique no produto desejado
    public void clickAtDesiredProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();
    }

}
