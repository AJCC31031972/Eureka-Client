package cjava.mef.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@ResponseBody
	@RequestMapping(value = "/getSaludos/{name}", method = RequestMethod.GET)
	public String getSaludos(@PathVariable(value = "name")   String name) {
        return "Hola Mundo "+name;
    }
 
}
