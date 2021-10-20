package com.example.controller;

import com.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("student", new Student());
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            return "student-form";
        }
        else {
            return "student-confirmation";
        }
    }
}
