package org.example.model;

public class VolleyBallCoach implements Coach{

    private FortuneService fortuneService;

    //constructor injection
    //DI
    public VolleyBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice back volley today";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getDailyFortune();
    }
}
