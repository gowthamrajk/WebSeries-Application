package com.application.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.application.model.WebSeries;

@Repository
public interface WebSeriesRepository extends CrudRepository<WebSeries, String>
{
	public Optional<WebSeries> findById(String id);
	
	public List<WebSeries> getSeriesByName(String name);
	
	public List<WebSeries> getSeriesBySeasons(String seasons); 
	
	public List<WebSeries> getSeriesByEpisodes(String episodes); 
	
	public List<WebSeries> getSeriesByRating(String rating); 
}