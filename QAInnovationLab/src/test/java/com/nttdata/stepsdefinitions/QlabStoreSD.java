package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventarioSteps;
import com.nttdata.steps.QastoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

/**
 * @author Frank Miranda
 */
public class QlabStoreSD {

    private WebDriver driver;

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }

    @When("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        QastoreSteps qastoreSteps = new QastoreSteps(driver);
        qastoreSteps.onsesion();
        qastoreSteps.typeUser(user);
        qastoreSteps.typePassword(password);
        qastoreSteps.login();
        screenShot();

    }
    @Then("valido inicion de sesion {string}")
    public void validoInicionDeSesion(String nombre) {
        String texto = new InventarioSteps(driver).getName();
        Assertions.assertEquals(nombre, texto);
        screenShot();

    }
    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) {
        QastoreSteps qastoreSteps = new QastoreSteps(driver);
        qastoreSteps.Menuropa();
        qastoreSteps.Menutipo();
        screenShot();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cant) {
        QastoreSteps qastoreSteps = new QastoreSteps(driver);
        qastoreSteps.Selectropa();
        qastoreSteps.agregarcantidad(cant);
        qastoreSteps.botoncarrito();
        screenShot();

    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
      String texto = new InventarioSteps(driver).getTitulo().replace("", "").trim();;
      //driver.switchTo().frame("blockcart-modal");
      Assertions.assertEquals("Producto añadido correctamente a su carrito de compra", texto);
      screenShot();

    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        String texto = new InventarioSteps(driver).getPrecio();
        Assertions.assertEquals("S/ 38.24", texto);
        screenShot();

    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        QastoreSteps qastoreSteps = new QastoreSteps(driver);
        qastoreSteps.finalizarcompra();
        screenShot();

    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        String texto = new InventarioSteps(driver).gettittle2();
        Assertions.assertEquals("CARRITO", texto);
        screenShot();

    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        String texto = new InventarioSteps(driver).getPrecio2();
        Assertions.assertEquals("S/ 38.24", texto);
        screenShot();

    }


}
