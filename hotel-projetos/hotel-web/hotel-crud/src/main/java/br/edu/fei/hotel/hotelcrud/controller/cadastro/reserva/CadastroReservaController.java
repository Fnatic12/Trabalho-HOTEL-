package br.edu.fei.hotel.hotelcrud.controller.cadastro.reserva;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import br.com.fei.hotel.common.service.CadastroClienteService;
import br.com.fei.hotel.common.service.QuartoService;
import br.com.fei.hotel.common.service.impl.CadastroClienteServiceImpl;
import br.com.fei.hotel.common.service.impl.QuartoServiceImpl;
import br.com.fei.hotel.common.utils.StringUtils;
import br.com.fei.hotel.common.utils.exceptions.CrudException;
import br.com.fei.hotel.common.utils.structure.Structure;
import br.edu.fei.hotel.common.model.ClienteVO;
import br.edu.fei.hotel.common.model.ComboboxVO;
import br.edu.fei.hotel.hotelcrud.utils.ConstantDataManager;

@Controller
@RequestMapping(value = ConstantDataManager.CADASTRO_RESERVA_CONTROLLER)
public class CadastroReservaController
{
    @RequestMapping(value = ConstantDataManager.CADASTRO_RESERVA_OPEN_METHOD)
    public static String open(final HttpServletRequest request, final Model model) throws Exception
    {
        String result = ConstantDataManager.RESULT_CADASTRO_RESERVA_OPEN_METHOD;
        
        boolean status = false;
        String message = br.com.fei.hotel.common.utils.ConstantDataManager.BLANK;
        
        try
        {
        	final CadastroClienteService clienteService = new CadastroClienteServiceImpl();
        	final Structure<ComboboxVO> listClientes = clienteService.getAllClientesCombobox();
        	
        	final QuartoService quartoService = new QuartoServiceImpl();
        	final Structure<ComboboxVO> listQuarto = quartoService.getQuartosCombobox();
        	
        	for(final ComboboxVO combo : listClientes)
        	{
        		System.out.println(combo.getValue());
        	}
        	
        	model.addAttribute(ConstantDataManager.PARAMETER_CLIENTE, listClientes);
        	model.addAttribute(ConstantDataManager.PARAMETER_QUARTO, listQuarto);
        	
            status = true;
        }
        catch(final Exception e)
        {
            message = e.getMessage();
            status = false;
            e.printStackTrace();
        }
        
        request.setAttribute(br.com.fei.hotel.common.utils.ConstantDataManager.MESSAGE, message);
        request.setAttribute(br.com.fei.hotel.common.utils.ConstantDataManager.STATUS, status);
        
        return result;
    }
    
    @RequestMapping(value = ConstantDataManager.CADASTRO_RESERVA_SAVE_METHOD, method = RequestMethod.POST)
    public static ResponseEntity<String> save(final HttpServletRequest request) throws Exception
    {
    	final Map<String, Object> result = new TreeMap<String, Object>();
    	final Gson gson = new Gson();
    	
    	String message = br.com.fei.hotel.common.utils.ConstantDataManager.BLANK;
    	boolean status = false;
    	
    	try
    	{	
    		final String nomeCliente = request.getParameter(ConstantDataManager.PARAMETER_NOME_CLIENTE);
    		if(StringUtils.isNull(nomeCliente))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_NOME_INVALIDO);
    		}
    		
    		final String dataNascimentoParameter = request.getParameter(ConstantDataManager.PARAMETER_DATA_NASCIMENTO);
    		if(StringUtils.isNull(dataNascimentoParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_DATA_NASCIMENTO_INVALIDA);
    		}
    		
    		final String telefoneParameter = request.getParameter(ConstantDataManager.PARAMETER_TELEFONE);
    		if(StringUtils.isNull(telefoneParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_TELEFONE_INVALIDO);
    		}
    		
    		final String celularParameter = request.getParameter(ConstantDataManager.PARAMETER_CELULAR);
    		if(StringUtils.isNull(celularParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_CELULAR_INVALIDO);
    		}
    		
    		final String cpfParameter = request.getParameter(ConstantDataManager.PARAMETER_CPF);
    		if(StringUtils.isNull(cpfParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_CPF_INVALIDO);
    		}
    		
    		final String rgParameter = request.getParameter(ConstantDataManager.PARAMETER_RG);
    		if(StringUtils.isNull(rgParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_RG_INVALIDO);
    		}
    		
    		final String emailParameter = request.getParameter(ConstantDataManager.PARAMETER_EMAIL);
    		if(StringUtils.isNull(emailParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_EMAIL_INVALIDO);
    		}
    		
    		//final String ativoParameter = request.getParameter(ConstantDataManager.PARAMETER_ATIVO);
    		
    		final String enderecoParameter = request.getParameter(ConstantDataManager.PARAMETER_ENDERECO);
    		if(StringUtils.isNull(enderecoParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_ENDERECO_INVALIDO);
    		}
    		
    		final String bairroParameter = request.getParameter(ConstantDataManager.PARAMETER_BAIRRO);
    		if(StringUtils.isNull(bairroParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_BAIRRO_INVALIDO);
    		}
    		
    		final String cepParameter = request.getParameter(ConstantDataManager.PARAMETER_CEP);
    		if(StringUtils.isNull(cepParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_CEP_INVALIDO);
    		}
    		
    		final String cidadeParameter = request.getParameter(ConstantDataManager.PARAMETER_CIDADE);
    		if(StringUtils.isNull(cidadeParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_CIDADE_INVALIDO);
    		}
    		
    		final String estadoParameter = request.getParameter(ConstantDataManager.PARAMETER_ESTADO);
    		if(StringUtils.isNull(estadoParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_ESTADO_INVALIDO);
    		}
    		
    		final String paisParameter = request.getParameter(ConstantDataManager.PARAMETER_PAIS);
    		if(StringUtils.isNull(paisParameter))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_PAIS_INVALIDO);
    		}
    		
    		final ClienteVO cliente = new ClienteVO();
    		cliente.setNome(nomeCliente);
    		cliente.setDataNascimento(dataNascimentoParameter);
    		cliente.getDadosContato().setTelefone(telefoneParameter);
    		cliente.getDadosContato().setCelular(celularParameter);
    		cliente.getDadosDocumentos().setCpf(cpfParameter);
    		cliente.getDadosDocumentos().setRg(rgParameter);
    		cliente.getDadosContato().setEmail(emailParameter);
    		cliente.getDadosEndereco().setEndereco(enderecoParameter);
    		cliente.getDadosEndereco().setBairro(bairroParameter);
    		cliente.getDadosEndereco().setCep(cepParameter);
    		cliente.getDadosEndereco().setCidade(cidadeParameter);
    		cliente.getDadosEndereco().setEstado(estadoParameter);
    		cliente.getDadosEndereco().setPais(paisParameter);
    		
    		final CadastroClienteService service = new CadastroClienteServiceImpl();
    		status = service.save(cliente);
    		
    		message = ConstantDataManager.MESSAGE_CLIENTE_GRAVADO_SUCESSO;
    	}
    	catch(final Exception e)
    	{
    		message = e.getMessage();
    		status = false;
    	}
    	
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.MESSAGE, message);
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.STATUS, status);
    	
    	final String json = gson.toJson(result);
    	System.out.println(json);
    	return ResponseEntity.ok(json);
    }
    
    @RequestMapping(value = ConstantDataManager.CADASTRO_RESERVA_BUSCA_METHOD, method = RequestMethod.POST)
    public static ResponseEntity<String> buscarCliente(final HttpServletRequest request) throws Exception
    {
    	final Map<String, Object> result = new TreeMap<String, Object>();
    	final Gson gson = new Gson();
    	
    	String message = br.com.fei.hotel.common.utils.ConstantDataManager.BLANK;
    	boolean status = false;
    	
    	try
    	{ 
    		final String nomeCliente = request.getParameter(ConstantDataManager.PARAMETER_NOME_CLIENTE);
    		if(StringUtils.isNull(nomeCliente))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_NOME_INVALIDO);
    		}
    		
    		ClienteVO cliente = new ClienteVO();
    		cliente.setNome(nomeCliente);
    		
    		final CadastroClienteService service = new CadastroClienteServiceImpl();
    		cliente = service.findClienteByNome(cliente);
    		
    		status = true;
    		
    		result.put(ConstantDataManager.PARAMETER_CLIENTE, cliente);
    	}
    	catch(final Exception e)
    	{
    		message = e.getMessage();
    		status = false;
    	}
    	
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.MESSAGE, message);
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.STATUS, status);
    	
    	final String json = gson.toJson(result);
    	System.out.println(json);
    	return ResponseEntity.ok(json);
    }
    
    @RequestMapping(value = ConstantDataManager.CADASTRO_RESERVA_DELETAR_METHOD, method = RequestMethod.POST)
    public static ResponseEntity<String> deletarCliente(final HttpServletRequest request) throws Exception
    {
    	final Map<String, Object> result = new TreeMap<String, Object>();
    	final Gson gson = new Gson();
    	
    	String message = br.com.fei.hotel.common.utils.ConstantDataManager.BLANK;
    	boolean status = false;
    	
    	try
    	{ 
    		final String codigoCliente = request.getParameter(ConstantDataManager.PARAMETER_CODIGO_CLIENTE);
    		if(StringUtils.isNull(codigoCliente))
    		{
    			throw new CrudException(ConstantDataManager.MESSAGE_PARAMETER_CODIGO_CLIENTE_INVALIDO);
    		}
    		
    		final CadastroClienteService service = new CadastroClienteServiceImpl();
    		status = service.remove(Long.valueOf(codigoCliente));
    		
    		message = ConstantDataManager.MESSAGE_CLIENTE_DELETADO_SUCESSO;
    	}
    	catch(final Exception e)
    	{
    		message = e.getMessage();
    		status = false;
    	}
    	
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.MESSAGE, message);
    	result.put(br.com.fei.hotel.common.utils.ConstantDataManager.STATUS, status);
    	
    	final String json = gson.toJson(result);
    	System.out.println(json);
    	return ResponseEntity.ok(json);
    }
}