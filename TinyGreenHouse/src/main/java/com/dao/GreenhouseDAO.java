package com.dao;

import java.util.List;

import com.divo.domain.Greenhouse;

public interface GreenhouseDAO {
	
	public void addGreenhouse(Greenhouse gh);
	public void updateGreenhouse(Greenhouse gh);
	public List<Greenhouse> listGreenhouses();
	public Greenhouse getGreenhouseById(int id);
	public void removeGreenhouse(int id);
}
