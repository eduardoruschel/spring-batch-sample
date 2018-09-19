package br.com.exemplo.processor;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import br.com.exemplo.dto.ClientesDTO;

public class ClienteItemProcessor implements ItemProcessor<ClientesDTO, ClientesDTO> {
	
	final Logger logger = Logger.getLogger(ClienteItemProcessor.class);

	@Override
	public ClientesDTO process(ClientesDTO item) throws Exception {
		logger.info("Processando o item " + item);
		return item;
	}

}