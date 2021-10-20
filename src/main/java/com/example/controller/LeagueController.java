package com.example.controller;
import com.example.model.League;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;
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
    public String processData(@RequestParam("title")String title, @RequestParam("season") String season,@RequestParam("year")String year, Model model)
    {
        int intYear=0;
        List<String> errorList=new ArrayList<>();
        if((title.length()<5))
        {
            errorList.add("name field can not be less that 5 char");

        }

        try
        {
            intYear=Integer.parseInt(year);
        }
        catch (Exception e)
        {
            errorList.add("year field must be integer");
        }
        if (intYear!=2021)
        {
            errorList.add("year must be current year(2021)");
        }
        if (season.equals("UNKNOWN"))
        {
            errorList.add("please select appropriate season");
        }
        if (!errorList.isEmpty())
        {
            model.addAttribute("ERROR",errorList);
            return "registerLeague";
        }
        else
        {
            League league=new League();
            league.setSeason(season);
            league.setTitle(title);
            league.setYear(intYear);
            model.addAttribute("LEAGUE",league);
            return "success";
        }

    }
}
