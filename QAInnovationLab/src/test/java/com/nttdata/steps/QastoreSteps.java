package com.nttdata.steps;

import com.nttdata.page.Loger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author Frank Miranda
 */
public class QastoreSteps {

    private WebDriver driver;

    //constructor
    public QastoreSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */



    public void onsesion(){

        this.driver.findElement(Loger.LoginClass).click();

    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(Loger.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Loger.loginButton));


    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(Loger.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(Loger.loginButton).click();
    }




    public void Menuropa(){
        this.driver.findElement(Loger.ROPA).click();

    }
    public void Menutipo(){
        this.driver.findElement(Loger.TIPO).click();

    }

    public void Selectropa(){
        this.driver.findElement(Loger.Articulo).click();
    }

    public void agregarcantidad(int i){
        WebElement userInputElement = driver.findElement(Loger.cantidad);

        userInputElement.clear();
        userInputElement.sendKeys(Keys.CONTROL+"a");
        userInputElement.sendKeys(Keys.DELETE);
        userInputElement.sendKeys(String.valueOf(i));

    }
    public void botoncarrito(){
        this.driver.findElement(Loger.carrito).click();

    }

    public void finalizarcompra(){
        this.driver.findElement(Loger.Finalizar).click();

    }

}
