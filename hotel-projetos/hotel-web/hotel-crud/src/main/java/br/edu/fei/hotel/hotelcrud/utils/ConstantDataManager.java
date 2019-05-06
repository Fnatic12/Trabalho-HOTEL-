package br.edu.fei.hotel.hotelcrud.utils;

/**
 *
 * @author vitor
 */
public final class ConstantDataManager
{
    private ConstantDataManager()
    {
        //
    }
    
    //Inicio
    public static final String INICIO_CONTROLLER = "/inicio";
    public static final String INICIO_OPEN_METHOD = "/open";
    
    public static final String RESULT_INICIO_OPEN_METHOD = "inicio/inicio";
    
    //Cadastro de Cliente
    public static final String CADASTRO_CLIENTE_CONTROLLER = "/cadastro/cliente";
    public static final String CADASTRO_CLIENTE_OPEN_METHOD = "/open";
    public static final String CADASTRO_CLIENTE_SAVE_METHOD = "/save";
    public static final String CADASTRO_CLIENTE_BUSCA_METHOD = "/busca";
    public static final String CADASTRO_CLIENTE_DELETAR_METHOD = "/deletar";
    
    public static final String PARAMETER_CODIGO_CLIENTE = "codigoCliente";
    public static final String PARAMETER_NOME_CLIENTE = "nomeCliente";
    public static final String PARAMETER_DATA_NASCIMENTO = "dataNascimento";
    public static final String PARAMETER_TELEFONE = "telefone";
    public static final String PARAMETER_CELULAR = "celular";
    public static final String PARAMETER_CPF = "cpf";
    public static final String PARAMETER_RG = "rg";
    public static final String PARAMETER_EMAIL = "email";
    public static final String PARAMETER_ATIVO = "ativo";
    public static final String PARAMETER_ENDERECO = "endereco";
    public static final String PARAMETER_BAIRRO = "bairro";
    public static final String PARAMETER_CEP = "cep";
    public static final String PARAMETER_CIDADE = "cidade";
    public static final String PARAMETER_ESTADO = "estado";
    public static final String PARAMETER_PAIS = "pais";
    public static final String PARAMETER_CLIENTE = "cliente";
    
    public static final String RESULT_CADASTRO_CLIENTE_OPEN_METHOD = "cadastro/cliente/cliente";
    
    public static final String MESSAGE_PARAMETER_CODIGO_CLIENTE_INVALIDO = "Código do Cliente inválido.";
    public static final String MESSAGE_PARAMETER_NOME_INVALIDO = "Nome inválido.";
    public static final String MESSAGE_PARAMETER_DATA_NASCIMENTO_INVALIDA = "Data de Nascimento inválida.";
    public static final String MESSAGE_PARAMETER_TELEFONE_INVALIDO = "Telefone inválido.";
    public static final String MESSAGE_PARAMETER_CELULAR_INVALIDO = "Celular inválido.";
    public static final String MESSAGE_PARAMETER_CPF_INVALIDO = "CPF inválido.";
    public static final String MESSAGE_PARAMETER_RG_INVALIDO = "RG inválido.";
    public static final String MESSAGE_PARAMETER_EMAIL_INVALIDO = "E-Mail obrigatório.";
    public static final String MESSAGE_PARAMETER_ENDERECO_INVALIDO = "Endereço inválido.";
    public static final String MESSAGE_PARAMETER_BAIRRO_INVALIDO = "Bairro inválido.";
    public static final String MESSAGE_PARAMETER_CEP_INVALIDO = "CEP inválido.";
    public static final String MESSAGE_PARAMETER_CIDADE_INVALIDO = "Cidade inválido.";
    public static final String MESSAGE_PARAMETER_ESTADO_INVALIDO = "Estado inválido.";
    public static final String MESSAGE_PARAMETER_PAIS_INVALIDO = "Pais inválido.";
    
    public static final String MESSAGE_CLIENTE_GRAVADO_SUCESSO = "Cliente gravado com sucesso.";
    public static final String MESSAGE_CLIENTE_DELETADO_SUCESSO = "Cliente deletado com sucesso";
    
    //Reserva
    public static final String CADASTRO_RESERVA_CONTROLLER = "/cadastro/reserva";
    public static final String CADASTRO_RESERVA_OPEN_METHOD = "/open";
    public static final String CADASTRO_RESERVA_SAVE_METHOD = "/save";
    public static final String CADASTRO_RESERVA_BUSCA_METHOD = "/busca";
    public static final String CADASTRO_RESERVA_DELETAR_METHOD = "/deletar";
    
    public static final String RESULT_CADASTRO_RESERVA_OPEN_METHOD = "cadastro/reserva/reserva";
    
    public static final String PARAMETER_QUARTO = "quarto";
}