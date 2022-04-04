package com.example.demo.ws;
import com.example.demo.beans.ObjResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjetoService {
     ObjectMapper jackson = new ObjectMapper();
    ObjResponse objResponse;
    public void generarEmail(String request){
        System.out.println(request);

        objResponse=new ObjResponse("Hello Juan Perez your message will be send");
    }
    public String getObjeto(){
        String json="";
        try {
            json = jackson.writeValueAsString(objResponse);
            System.out.println(json);

        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return json;
    }
    public String getError(String code, String message){
        String json = "{\"error\":{\"code\":"+code+",\"message\":\""+message+"\"}}";
        return  json;
    }
}
