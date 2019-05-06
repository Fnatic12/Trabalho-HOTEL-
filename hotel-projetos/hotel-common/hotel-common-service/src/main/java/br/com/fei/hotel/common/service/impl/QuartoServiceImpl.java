package br.com.fei.hotel.common.service.impl;

import br.com.fei.hotel.common.dao.QuartoDao;
import br.com.fei.hotel.common.dao.impl.QuartoDaoImpl;
import br.com.fei.hotel.common.service.QuartoService;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ComboboxVO;

public class QuartoServiceImpl implements QuartoService
{
	private QuartoDao dao;
	
	public QuartoServiceImpl()
	{
		this.dao = new QuartoDaoImpl();
	}
	
	public Structure<ComboboxVO> getQuartosCombobox() throws Exception
	{
		return this.dao.getQuartosCombobox();
	}
}