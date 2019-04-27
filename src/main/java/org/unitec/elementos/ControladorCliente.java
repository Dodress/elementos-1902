package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorCliente {
    @Autowired RepoCliente repoC;    
//1.-guardar :save()
    @PostMapping("/cliente")
    Estatus guardar(@RequestBody String json)throws Exception{
        
        ObjectMapper maper=new ObjectMapper();
        Cliente c=maper.readValue(json, Cliente.class);
        repoC.save(c);
        Estatus e=new Estatus("Cliente guardado",true);
        return e;
    }
    
    //2. buscar todos
    @GetMapping("/cliente")
    List<Cliente> buscarTodos(){
        return repoC.findAll();
    }
}
