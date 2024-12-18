package com.Examen.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class StoreStep {
    Response response;
    private String URL_Base;

    public void denifiniendoURL(String url) {
        URL_Base = url;

    }

    public void consultarOrderID(String storeOrder) {
        response = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .baseUri(URL_Base)
                .log().all()
                .get("/order/"+ storeOrder)
                .then()
                .log().all()
                .extract().response();
    }

    public void ValidaciondeRespuesta(int statuscode) {
        Assert.assertEquals("validacion de respuesta",statuscode,response.statusCode());

    }

    public void CrearOrden(String storeOrder) {
        String body = "{\n" +
                "  \"id\": " + storeOrder +",\n" +
                "  \"petId\": 15,\n" +
                "  \"complete\": true\n" +
                "}";

        response = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .baseUri(URL_Base)
                .header("Content-Type","application/json")
                .body(body)
                .log().all()
                .post("/order")
                .then()
                .log().all()
                .extract().response()
                ;
    }
}
