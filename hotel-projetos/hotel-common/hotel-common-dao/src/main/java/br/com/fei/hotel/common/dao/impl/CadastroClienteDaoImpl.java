package br.com.fei.hotel.common.dao.impl;

import br.com.fei.hotel.common.dao.CadastroClienteDao;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.com.fei.hotel.common.utils.structure.impl.DoublyLinkedListImpl;
import br.edu.fei.hotel.common.model.ClienteVO;
import br.edu.fei.hotel.common.model.ComboboxVO;

public class CadastroClienteDaoImpl implements CadastroClienteDao
{
	private static final Structure<ClienteVO> LIST_CLIENTES = new DoublyLinkedListImpl<ClienteVO>();;
	
	public CadastroClienteDaoImpl()
	{
		//
	}

	public ClienteVO findClienteByNome(final ClienteVO cliente) throws Exception
	{
		return CadastroClienteDaoImpl.LIST_CLIENTES.find(cliente);
	}

	public boolean save(final ClienteVO cliente) throws Exception
	{
		return CadastroClienteDaoImpl.LIST_CLIENTES.add(cliente);
	}

	public boolean remove(long codigoCliente) throws Exception
	{
		final ClienteVO cliente = CadastroClienteDaoImpl.LIST_CLIENTES.find(Integer.valueOf(String.valueOf(codigoCliente)));
		return CadastroClienteDaoImpl.LIST_CLIENTES.remove(cliente);
	}

	public Structure<ComboboxVO> getAllClientesCombobox()
	{
		Structure<ComboboxVO> listCombo = new DoublyLinkedListImpl<ComboboxVO>();
		for(final ClienteVO cliente : CadastroClienteDaoImpl.LIST_CLIENTES)
		{
			final ComboboxVO comboboxVo = new ComboboxVO();
			comboboxVo.setKey(String.valueOf(cliente.getCodigo()));
			comboboxVo.setValue(String.valueOf(cliente.getNome()));
			
			listCombo.add(comboboxVo);
		}
		
		return listCombo;
	}
}