package com.project.project_artifact.demo.controller;
import com.project.project_artifact.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("message", new Message());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Message message, Model model) {
        model.addAttribute("submittedMessage", message.getContent());
        return "result";
    }
}
