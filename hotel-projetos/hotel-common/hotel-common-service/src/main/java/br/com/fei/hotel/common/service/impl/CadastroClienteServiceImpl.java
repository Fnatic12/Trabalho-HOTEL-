package br.com.fei.hotel.common.service.impl;

import br.com.fei.hotel.common.dao.CadastroClienteDao;
import br.com.fei.hotel.common.dao.impl.CadastroClienteDaoImpl;
import br.com.fei.hotel.common.service.CadastroClienteService;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ClienteVO;
import br.edu.fei.hotel.common.model.ComboboxVO;

public class CadastroClienteServiceImpl implements CadastroClienteService
{
	private CadastroClienteDao dao;
	
	public CadastroClienteServiceImpl()
	{
		dao = new CadastroClienteDaoImpl();
	}
	
	public ClienteVO findClienteByNome(final ClienteVO cliente) throws Exception
	{
		return this.dao.findClienteByNome(cliente);
	}

	public boolean save(final ClienteVO cliente) throws Exception
	{
		return this.dao.save(cliente);
	}

	public boolean remove(final long codigoCliente) throws Exception
	{
		return this.dao.remove(codigoCliente);
	}

	public Structure<ComboboxVO> getAllClientesCombobox() throws Exception
	{
		return this.dao.getAllClientesCombobox();
	}
}