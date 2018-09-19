package br.com.exemplo.writer;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import br.com.exemplo.dto.ContatosDTO;

public class ContatosReader implements ItemReader<ContatosDTO>{

	@Override
	public ContatosDTO read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

}
