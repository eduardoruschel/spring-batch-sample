package br.com.exemplo.writer;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import br.com.exemplo.dto.ClientesDTO;

public class ClientesWriter implements ItemWriter<ClientesDTO> {
	
	final Logger logger = Logger.getLogger(ClientesWriter.class);

	@Override
	public void write(List<? extends ClientesDTO> items) throws Exception {
		for (ClientesDTO clientesDTO : items) {
			
			logger.info(" Writer do cliente: " + clientesDTO.getNome() );
			
		}

	}
}