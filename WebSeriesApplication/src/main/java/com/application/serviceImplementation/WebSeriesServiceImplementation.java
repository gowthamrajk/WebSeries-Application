package com.application.serviceImplementation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.dao.WebSeriesRepository;
import com.application.model.WebSeries;
import com.application.service.WebSeriesService;

@Service
public class WebSeriesServiceImplementation implements WebSeriesService
{
	@Autowired
	private WebSeriesRepository webSeriesRepo;
	
	@Override
	public WebSeries addSeries(WebSeries series) 
	{
		return webSeriesRepo.save(series);
	}

	@Override
	public WebSeries updateSeries(WebSeries series)
	{
		return webSeriesRepo.save(series);
	}

	@Override
	public String deleteSeries(String id) 
	{
		webSeriesRepo.deleteById(id);
		return null;
	}

	@Override
	public List<WebSeries> getAllSeries()
	{
		return (List<WebSeries>)webSeriesRepo.findAll();
	}

	@Override
	public List<WebSeries> getSeriesByEpisodes(String episodes) 
	{
		return webSeriesRepo.getSeriesByEpisodes(episodes);
	}

	@Override
	public List<WebSeries> getSeriesByRating(String ratings) 
	{
		return webSeriesRepo.getSeriesByRating(ratings);
	}

	@Override
	public List<WebSeries> getSeriesBySeasons(String seasons)
	{
		return webSeriesRepo.getSeriesBySeasons(seasons);
	}

	@Override
	public List<WebSeries> getSeriesByName(String seriesName) 
	{
		return webSeriesRepo.getSeriesByName(seriesName);
	}

	@Override
	public Optional<WebSeries> getSeriesById(String seriesId)
	{
		return webSeriesRepo.findById(seriesId);
	}
}