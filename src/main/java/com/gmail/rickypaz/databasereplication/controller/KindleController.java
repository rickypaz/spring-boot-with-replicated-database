package com.gmail.rickypaz.databasereplication.controller;

// KindleController.java

import com.gmail.rickypaz.databasereplication.domain.Kindle;
import com.gmail.rickypaz.databasereplication.repository.master.MasterKindleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KindleController {

    @Autowired
    private MasterKindleRepository masterKindleRepository;

    @GetMapping("/kindles")
    public String showKindles(Model model) {
        model.addAttribute("kindles", masterKindleRepository.findAll());
        return "kindleList";
    }

    @GetMapping("/kindles/new")
    public String showKindleForm(Model model) {
        model.addAttribute("kindle", new Kindle());
        return "kindleForm";
    }

    @PostMapping("/kindles/new")
    public String saveKindle(Kindle kindle) {
        masterKindleRepository.save(kindle);
        return "redirect:/kindles";
    }

}