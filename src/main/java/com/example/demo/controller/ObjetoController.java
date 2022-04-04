package com.example.demo.controller;

import com.example.demo.beans.Mensaje;
import com.example.demo.clases.Verificaciones;
import com.example.demo.ws.ObjetoService;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ObjetoController {
    Verificaciones verificaciones = new Verificaciones();
    private static final Logger log = LoggerFactory.getLogger(ObjetoService.class);
    @RequestMapping(method = RequestMethod.POST, path = "/DevOps")
    public @ResponseBody String ejecutaEndPoint(@RequestHeader("X-Parse-REST-API-Key") String api_key, @RequestHeader("X-JWT-KWY") String x_jwt_kwy,@RequestBody String mensaje){
        ObjetoService objService = new ObjetoService();
        String msj="";
        if (!verificaciones.verifica_tokens(api_key, x_jwt_kwy)){
            msj = objService.getError("403","FORBIDDEN");
        }else{
            objService.generarEmail(mensaje);
            try{

            }catch (Exception ex){
                System.out.println(ex.toString());
            }
            msj = objService.getObjeto();
        }
        return msj;
    }

}
