package com.example.controller;

import com.example.model.League;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LeagueController {

    @RequestMapping("/listLeagueView")
    public String listLeague()
    {
        return "listLeagueView";
    }
@RequestMapping("/registerLeague")
    public String registerLeague()
    {
        return "registerLeague";
    }
    @RequestMapping("/processData")
    public String processData(HttpServletRequest httpServletRequest, Model model)
    {
        String title=httpServletRequest.getParameter("title");
        String year=httpServletRequest.getParameter("year");
        String season=httpServletRequest.getParameter("season");
        League league=new League();
        league.setSeason(season);
        league.setTitle(title);
        league.setYear(year);
        model.addAttribute("LEAGUE",league);
        return "success";
    }
}
