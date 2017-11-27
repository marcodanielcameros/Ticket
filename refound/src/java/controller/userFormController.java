/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vista.html")
public class userFormController {
    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model){
        model.addAttribute("hola", "hola mundo");
        return "index";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String completo(@RequestParam("product") String product){
        
    }
}
