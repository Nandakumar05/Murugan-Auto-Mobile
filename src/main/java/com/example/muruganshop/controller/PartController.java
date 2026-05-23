package com.example.muruganshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.muruganshop.entity.Part;
import com.example.muruganshop.repository.PartRepository;

@Controller
public class PartController {

    @Autowired
    private PartRepository repo;

    // Home Page
    @GetMapping("/")
    public String home(Model model) {

        List<Part> parts = repo.findAll();

        model.addAttribute("parts", parts);

        return "index";
    }
    @GetMapping("/edit/{id}")
    public String editPart(@PathVariable Long id, Model model) {

        Part part = repo.findById(id).orElse(null);

        model.addAttribute("part", part);

        return "edit";
    }

    // Save Part
    @PostMapping("/save")
    public String savePart(Part part) {

        repo.save(part);

        return "redirect:/";
    }

    // Delete Part
    @GetMapping("/delete/{id}")
    public String deletePart(@PathVariable Long id) {

        repo.deleteById(id);

        return "redirect:/";
    }
    @PostMapping("/update")
    public String updatePart(Part part) {

        repo.save(part);

        return "redirect:/";
    }
}