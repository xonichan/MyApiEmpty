package com.oniFactory.MyApiEmpty.controllers;

import com.oniFactory.MyApiEmpty.models.PostRq;
import com.oniFactory.MyApiEmpty.repo.RqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RqController {

    @Autowired
    private RqRepository rqRepository;


    @GetMapping("/blog/addRq")
    public String blogAddRq(Model model) {
        return "blog-add-rq";
    }

    @PostMapping("/blog/addRq")
    public String blogRqAdd(@RequestParam String rq_text, Model model) {
        PostRq postRq = new PostRq(rq_text);
        rqRepository.save(postRq);
        return "redirect:/table";
    }

    @GetMapping("/table")
    public String rqTable(Model model) {
        Iterable<PostRq> postsRq = rqRepository.findAll();
        model.addAttribute("postsRq", postsRq);
        return "rq-table";
    }
}
