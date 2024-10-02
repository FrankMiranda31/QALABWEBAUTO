package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.Loger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author Frank Miranda
 */
public class InventarioSteps {

    private WebDriver driver;

    //contrsuctor
    public InventarioSteps(WebDriver driver){
        this.driver = driver;
    }


    public String getName(){
        return this.driver.findElement(Loger.LoginSesion).getText();
    }

    public String getTitulo(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Loger.tittle));
        WebElement tituloElement = driver.findElement(Loger.tittle);
        return tituloElement.getText();
    }

    public String getPrecio(){

        return this.driver.findElement(Loger.p).getText();
    }

    public String gettittle2(){

        return this.driver.findElement(Loger.tittle2).getText();
    }
    public String getPrecio2(){

        return this.driver.findElement(Loger.P2).getText();
    }
}
