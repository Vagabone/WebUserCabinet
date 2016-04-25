package ua.skarb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.skarb.service.FirmService;

@Controller
public class FirmController {

    @Autowired
    FirmService firmService;

    @RequestMapping(path = "/firminfo", method = RequestMethod.GET)
    String getFirmPage(Model model) {
        //Only for testing
        model.addAttribute("firm", firmService.getFirmById(3077));
        return "firminfo";
    }

}
