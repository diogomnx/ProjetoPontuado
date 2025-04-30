package com.github.jhugosc.ProjetoPontuado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
@RequestMapping("/projeto")
public String index() {
    return "index";
}

@RequestMapping("/projeto/home")
public String home() {
    return "home";
}

@RequestMapping("/projeto/getAll")
public String infos() {
    return "infos";
}
}
