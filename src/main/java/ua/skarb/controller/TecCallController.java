package ua.skarb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.skarb.service.TecCallViewService;

import java.util.Date;

@Controller
public class TecCallController {

    @Autowired
    TecCallViewService tecCallService;

    @RequestMapping(path = "/calls", method = RequestMethod.GET)
    public String getTecCallPage() {
        return "calls";
    }

    @RequestMapping(path = "/calls", method = RequestMethod.POST)
    public String getTecCallsForIdAndDate(@RequestParam("licenceId") Integer licenceId,
                                          @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                          @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
                                          Model model) {
        model.addAttribute("tecCallList", tecCallService.getCallsByLicenceAndDatePeriod(licenceId, startDate, endDate));
        return "calls";
    }
}
