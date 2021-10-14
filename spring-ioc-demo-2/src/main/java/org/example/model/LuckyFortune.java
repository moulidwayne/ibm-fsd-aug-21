package org.example.model;

import org.example.model.FortuneService;

public class LuckyFortune implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "today is your lucky day...!";
    }
}
