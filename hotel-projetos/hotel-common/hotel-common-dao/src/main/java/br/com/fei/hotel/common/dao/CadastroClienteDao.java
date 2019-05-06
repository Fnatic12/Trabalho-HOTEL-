package br.com.fei.hotel.common.dao;

import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ClienteVO;
import br.edu.fei.hotel.common.model.ComboboxVO;

public interface CadastroClienteDao
{
	ClienteVO findClienteByNome(ClienteVO cliente) throws Exception;
	boolean save(ClienteVO cliente) throws Exception;
	boolean remove(long codigoCliente) throws Exception;
	Structure<ComboboxVO> getAllClientesCombobox();
}