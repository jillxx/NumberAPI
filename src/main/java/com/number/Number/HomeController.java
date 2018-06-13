package com.number.Number;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.number.Number.model.Fact;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/datefact")			//can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView dateFact(@RequestParam("day") String day, @RequestParam("month") String month) {
		ModelAndView mv = new ModelAndView("number");		//page of the jsp that should be returned
		
		//adding hearders to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "C2dSsl3ZZimshYcaG1DxLka4xNBfp1LE8XQjsnI9GIXkl310MN");
		headers.add("Accept", MediaType.TEXT_PLAIN_VALUE);
		
		//to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity will help us get the data from the API
		ResponseEntity<Fact> response = restTemplate.exchange("https://numbersapi.p.mashape.com/"+month +"/"+day+"/date?fragment=true&json=true", HttpMethod.GET, entity, Fact.class);
		
		System.out.println(response.getBody());  //for testing purposes
		mv.addObject("fact", response.getBody());
		
		return mv;
	
}
	
	@RequestMapping("/random")			//can get either getmapping or requestmapping not postmapping here tho
	public ModelAndView randomFact(@RequestParam("type") String type) {
		ModelAndView mv = new ModelAndView("random");		//page of the jsp that should be returned
		
		//adding hearders to our API request
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "C2dSsl3ZZimshYcaG1DxLka4xNBfp1LE8XQjsnI9GIXkl310MN");
		headers.add("Accept", MediaType.TEXT_PLAIN_VALUE);
		
		//headers.setContentType(MediaType.APPLICATION_JSON);

		
		//to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity will help us get the data from the API
		ResponseEntity<Fact> response = restTemplate.exchange("https://numbersapi.p.mashape.com/random/"+type+"?fragment=true&json=true&max=20&min=10", HttpMethod.GET, entity, Fact.class);
		
		System.out.println(response.getBody());  //for testing purposes
		mv.addObject("random", response.getBody());
		
		return mv;
	}
}
