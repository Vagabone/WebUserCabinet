package ua.skarb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.skarb.service.LicenceUsersService;
import ua.skarb.service.LicenceViewService;

@Controller
public class LicenceController {

    @Autowired
    LicenceViewService licenceViewService;

    @Autowired
    LicenceUsersService licenceUsersService;

    @RequestMapping(path = "/licence", method = RequestMethod.GET)
    String getLicencePage(Model model) {
        model.addAttribute("licence", licenceViewService.getLicenceViewById(967));
        model.addAttribute("licenceUsers", licenceUsersService.findRegistratorsByLicenceId(967));
        return "licence";
    }

}
