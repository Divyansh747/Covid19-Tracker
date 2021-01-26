package com.divyansh.covid19;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@Autowired
	Covid19DataService covidDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = covidDataService.getStats();
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCountry()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffOfCase()).sum();
		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalReportedCases);
		model.addAttribute("totalNewCases", totalNewCases);
		return "index";
	}
}
