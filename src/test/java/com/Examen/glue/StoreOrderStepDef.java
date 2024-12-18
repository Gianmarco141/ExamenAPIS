package com.Examen.glue;

import com.Examen.steps.StoreStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StoreOrderStepDef {
    @Steps
    StoreStep store;

    @Given("la URL es {string}")
    public void laURLEs(String url) {
        store.denifiniendoURL(url);
    }

    @When("consulto el numero de la orden {string}")
    public void consultoElNumeroDeLaOrden(String storeOrder) {
        store.consultarOrderID(storeOrder);
    }
    @Then("valido que el codigo de respuesta sea {int}")
    public void validoQueElCodigoDeRespuestaSea(int statuscode) {
        store.ValidaciondeRespuesta(statuscode);
    }

    @When("Creo la orden {string}")
    public void creoLaOrden(String storeOrder) {
        store.CrearOrden(storeOrder);
    }
}

