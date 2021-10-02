package com.web.chxkun.controller;

import com.web.chxkun.service.MainService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @RequestMapping("/")
    public String mainView() {
        return mainService.mainView();
    }
}
