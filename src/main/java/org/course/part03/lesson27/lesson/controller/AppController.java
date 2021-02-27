package org.course.part03.lesson27.lesson.controller;

import org.course.part03.lesson27.lesson.model.User;
import org.course.part03.lesson27.lesson.service.AppService;

public class AppController {
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    public boolean login(String username, String password) {
        return appService.findByUsernameAndPassword(username, password);
    }

    public void register(User user) {
        appService.register(user);
    }
}