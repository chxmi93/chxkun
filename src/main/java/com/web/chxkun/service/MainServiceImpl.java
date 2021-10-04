package com.web.chxkun.service;

import com.web.chxkun.dao.MainDao;
import com.web.chxkun.entity.User;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService{
    private final MainDao mainDao;

    @Override
    public String mainView() {
        Optional<User> user1 = mainDao.findById(1L);
        Optional<User> user2 = mainDao.findById(2L);
        Optional<User> user3 = mainDao.findById(3L);

        log.info("user1: " + user1.toString());
        log.info("user2: " + user2.toString());
        log.info("user3: " + user3.toString());

        return "content/main";
    }
}
