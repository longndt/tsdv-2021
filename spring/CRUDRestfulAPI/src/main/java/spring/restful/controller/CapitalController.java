package spring.restful.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;
import spring.restful.bean.Capital;
import spring.restful.exception.CapitalNotFoundException;
import spring.restful.service.CapitalService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CapitalController {
    CapitalService capitalService = new CapitalService();

    @RequestMapping(value = "/capitals", method = RequestMethod.GET,
            headers = "accept=application/json")
    public List getCapitals() {
        List capitalList = capitalService.getAllCapitals();
        return capitalList;
    }

    @RequestMapping(value = "/capital/{id}", method = RequestMethod.GET,
            headers = "Accept=application/json")
    public Capital getCapitalById(@PathVariable("id") int id) {
        Capital capital = capitalService.getCapital(id);
        if (capital == null) throw new CapitalNotFoundException(id);
        return capitalService.getCapital(id);
    }

    @RequestMapping(value = "/capitals", method = RequestMethod.POST,
            headers = "Accept=application/json")
    public Capital addCapital(@RequestBody Capital capital) {
        return capitalService.addCapital(capital);
    }

    @RequestMapping(value = "/capitals", method = RequestMethod.PUT,
            headers = "Accept=application/json")
    public Capital updateCapital(@RequestBody Capital capital) {
        return capitalService.updateCapital(capital);
    }

    @RequestMapping(value = "/capital/{id}", method = RequestMethod.DELETE,
            headers = "Accept=application/json")
    public void deleteCapital(@PathVariable("id") int id) {
        capitalService.deleteCapital(id);
    }

    @RequestMapping(value = "/test", headers = "Accept=application/json")
    public Map<Integer, String> test() {
        int id = 1;
        String name = "Hello World";
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(id, name);
        return map;
    }
}
