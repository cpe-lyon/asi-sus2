package com.sus_society.sus2.controller;

import com.sus_society.model.Poney;
import com.sus_society.model.PoneyFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestCrt {

    private static final String messageLocal = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";

    @Autowired
    PoneyDao poneyDao;
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("messageLocal", messageLocal);

        return "index";
    }

    @RequestMapping(value = { "/uk" }, method = RequestMethod.GET)
    public String ukIndex(Model model) {
        model.addAttribute("messageLocal", messageLocal);
        return "uk/index";
    }

    @RequestMapping(value = { "/view" }, method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("myPoney", poneyDao.getRandomPoney());
        return "poneyView";
    }

    @RequestMapping(value = { "/uk/view" }, method = RequestMethod.GET)
    public String ukView(Model model) {
        model.addAttribute("myPoney", poneyDao.getRandomPoney());
        return "uk/poneyView";
    }

    @RequestMapping(value = { "/uk/addPoney" }, method = RequestMethod.GET)
    public String ukAddPoney(Model model) {
        PoneyFormDTO poneyForm = new PoneyFormDTO();
        model.addAttribute("poneyForm", poneyForm);
        return "uk/poneyForm";
    }

    @RequestMapping(value = { "/uk/addPoney" }, method = RequestMethod.POST)
    public String ukAddPoney(Model model, @ModelAttribute("poneyForm") PoneyFormDTO poneyForm) {
        Poney p = poneyDao.addPoney(poneyForm.getName(), poneyForm.getColor(), poneyForm.getSuperPower(), poneyForm.getImgUrl());
        model.addAttribute("myPoney", p);
        return "uk/poneyView";
    }

    @RequestMapping(value = { "/uk/list" }, method = RequestMethod.GET)
    public String ukViewList(Model model) {
        model.addAttribute("poneyList", poneyDao.getPoneyList());
        return "uk/poneyViewList";
    }

}
