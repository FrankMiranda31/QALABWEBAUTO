package com.nttdata.page;

import org.openqa.selenium.By;

/**
 * @author Frank Miranda
 */
public class Loger {

    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By LoginClass = By.xpath("//span[contains(@class, 'hidden-sm-down') and contains(text(), 'Iniciar sesión')]");

    public static By LoginSesion = By.xpath("//span[contains(@class, 'hidden-sm-down') and contains(text(), 'Frank Miranda Marroquin')]");

    public static By ROPA = By.xpath("//a[contains(@href, '3-clothes')]");


    public static By TIPO =By.xpath("//a[text()='Men']");


    public static By Articulo= By.xpath("//div[@class='thumbnail-container reviews-loaded']");

    public static By cantidad= By.xpath("//input[@id='quantity_wanted']");


    public static By carrito=By.xpath("//button[@data-button-action='add-to-cart']");

    public static By tittle=By.xpath("//h4[contains(@class, 'modal-title') and contains(text(), 'Producto añadido correctamente a su carrito de compra')]");


    public static By Finalizar=By.xpath("//a[contains(@class, 'btn btn-primary') and contains(@href, '//qalab.bensg.com/store/pe/carrito?action=show')]");

    public static By p=By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");

    public static By tittle2=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");

    public static By P2=By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[2]/span/strong");

}
