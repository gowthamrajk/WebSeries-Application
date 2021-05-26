package com.application.service;

import java.util.List;
import java.util.Optional;
import com.application.model.WebSeries;

public interface WebSeriesService 
{
    public WebSeries addSeries(WebSeries series);
	
	public WebSeries updateSeries(WebSeries series);
	
	public String deleteSeries(String id);
	
	public List<WebSeries> getAllSeries();
	
	public List<WebSeries> getSeriesByEpisodes(String episodes);
	
	public List<WebSeries> getSeriesByRating(String ratings);
	
	public List<WebSeries> getSeriesBySeasons(String seasons);
	
	public List<WebSeries> getSeriesByName(String seriesName);
	
	public Optional<WebSeries> getSeriesById(String seriesId);
}