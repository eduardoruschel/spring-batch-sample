package br.com.exemplo.writer;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import br.com.exemplo.dao.ClientesDAO;
import br.com.exemplo.dao.Dao;
import br.com.exemplo.dto.ClientesDTO;
import br.com.exemplo.model.Cliente;

public class ClientesWriter implements ItemWriter<ClientesDTO> {
	
	final Logger logger = Logger.getLogger(ClientesWriter.class);
	
	private Dao<Cliente> clienteDAO = new ClientesDAO();
	
	@Override
	public void write(List<? extends ClientesDTO> items) throws Exception {
		for (ClientesDTO clientesDTO : items) {
			
			logger.info(" Writer do cliente: " + clientesDTO.getNome() );
			
			logger.info(" Verificando se o cliente: " + clientesDTO.getNome() + " ja consta em base");
			Cliente clienteExiste = clienteDAO.getClienteByCpf(clientesDTO.getCpf());
			
			if (clienteExiste == null) {
				logger.info(" Cliente: " + clientesDTO.getNome() + " nao consta em base");
				clienteDAO.save(this.convertCliente(clientesDTO));
				logger.info(" Cliente: " + clientesDTO.getNome() + " incluido em base");
			} else {
				logger.info(" Cliente: " + clientesDTO.getNome() + " já consta em base, incluido em processamento anterior");
			}
			
		}
	}
	
	private Cliente convertCliente(ClientesDTO clientesDTO) {
		Cliente cliente = new Cliente();
		cliente.setCpf(clientesDTO.getCpf());
		cliente.setDataNascimento(clientesDTO.getDataNascimento());
		cliente.setNome(clientesDTO.getNome());
		cliente.setRg(clientesDTO.getRg());
		cliente.setSexo(clientesDTO.getSexo());
		return cliente;
	}
	
}