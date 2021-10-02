package com.web.chxkun.service;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{

    @Override
    public String mainView() {
        return "content/main";
    }
}
