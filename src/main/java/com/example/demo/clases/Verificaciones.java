package com.example.demo.clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Verificaciones {
    Properties propiedades = new Properties();
    Boolean respuesta;
    public boolean verifica_tokens(String api_key, String token_secreto){
    try {
        propiedades.load(new FileReader("properties.properties"));
    }catch(FileNotFoundException ex){
        System.out.println(ex.toString());
    }catch (IOException ex){
        System.out.println(ex.toString());
    }
    String property_api_key = propiedades.getProperty("API_KEY");
    String property_token_secret = propiedades.getProperty("TOKEN_SECRET");
    if (property_api_key.equals(api_key) && property_token_secret.equals(token_secreto)){
        respuesta = true;
    }else{
        respuesta = false;
    }
    return respuesta;
    }
}
