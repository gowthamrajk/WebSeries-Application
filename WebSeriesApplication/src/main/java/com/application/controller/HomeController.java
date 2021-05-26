package com.application.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.model.WebSeries;
import com.application.serviceImplementation.WebSeriesServiceImplementation;

@RestController
@CrossOrigin("*")
public class HomeController 
{
	@Autowired
	private WebSeriesServiceImplementation webSeriesServiceImpl;
	
	@PostMapping(value = "/addSeries")
	public ResponseEntity<WebSeries>  addSeries(@RequestBody WebSeries series)
	{
		webSeriesServiceImpl.addSeries(series);
		System.out.println("Series Saved Successfully !!!");
		return new ResponseEntity<WebSeries>(series, HttpStatus.OK);
	}
	
	@GetMapping(value = "/series")
	public ResponseEntity<List<WebSeries>>  getAllSeries()
	{
		List<WebSeries> series = webSeriesServiceImpl.getAllSeries();
		return new ResponseEntity<List<WebSeries>>(series, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<WebSeries> updateSeries(@RequestBody WebSeries series)
	{
		webSeriesServiceImpl.addSeries(series);
		System.out.println("Changes Updated Successfully!!!");
		return new ResponseEntity<WebSeries>(series, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSeries(@PathVariable String id)
	{
		webSeriesServiceImpl.deleteSeries(id);
		return new ResponseEntity<String>("Series Removed !"+id, HttpStatus.OK);
	}
	
	@GetMapping(value = "/series/id/{seriesId}")
	public ResponseEntity<Optional<WebSeries>> getSeriesById(@PathVariable String seriesId)
	{
		Optional<WebSeries> series = webSeriesServiceImpl.getSeriesById(seriesId);
		return new ResponseEntity<Optional<WebSeries>>(series,HttpStatus.OK);
	}
	
	@GetMapping("/series/name/{seriesName}")
	public ResponseEntity<List<WebSeries>> getSeriesByName(@PathVariable String seriesName) {
		List<WebSeries> Webseries = webSeriesServiceImpl.getSeriesByName(seriesName);
		return new ResponseEntity<List<WebSeries>>(Webseries,HttpStatus.OK);
	}
	
	@GetMapping("/series/episode/{episodes}")
	public ResponseEntity<List<WebSeries>> getSeriesByEpisodes(@PathVariable String episodes) {
		List<WebSeries> Webseries = webSeriesServiceImpl.getSeriesByEpisodes(episodes);
		return new ResponseEntity<List<WebSeries>>(Webseries,HttpStatus.OK);
	}
	
	@GetMapping("/series/season/{seasons}")
	public ResponseEntity<List<WebSeries>> getSeriesBySeasons(@PathVariable String seasons) {
		List<WebSeries> Webseries = webSeriesServiceImpl.getSeriesBySeasons(seasons);
		return new ResponseEntity<List<WebSeries>>(Webseries,HttpStatus.OK);
	}
	
	@GetMapping("/series/rating/{ratings}")
	public ResponseEntity<List<WebSeries>> getSeriesByRating(@PathVariable String ratings) {
		List<WebSeries> Webseries = webSeriesServiceImpl.getSeriesByRating(ratings);
		return new ResponseEntity<List<WebSeries>>(Webseries,HttpStatus.OK);
	}
}