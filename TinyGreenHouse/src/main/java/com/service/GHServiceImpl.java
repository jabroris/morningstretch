package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.GreenhouseDAO;
import com.divo.domain.Greenhouse;

@Service
@Component("gHService")
public class GHServiceImpl implements GHService{
	
	@Autowired
	private GreenhouseDAO greenhouseDAO;

	public void setGreenhouseDAO(GreenhouseDAO greenhouseDAO) {
		
		this.greenhouseDAO = greenhouseDAO;
	}
	
	@Override
	@Transactional
	public void addGreenhouse(Greenhouse gh) {
		
		this.greenhouseDAO.addGreenhouse(gh);
	}

	@Override
	@Transactional
	public void updateGreenhouse(Greenhouse gh) {
		
		this.greenhouseDAO.updateGreenhouse(gh);
	}

	@Override
	@Transactional
	public List<Greenhouse> listGreenhouses() {
		
		return this.greenhouseDAO.listGreenhouses();
	}

	@Override
	@Transactional
	public Greenhouse getGreenhouseById(int id) {
		
		return this.greenhouseDAO.getGreenhouseById(id);
	}

	@Override
	@Transactional
	public void removeGreenhouse(int id) {
		
		this.greenhouseDAO.removeGreenhouse(id);
	}

}
