package br.com.exemplo.processor;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.exemplo.app.MainParallel;
import br.com.exemplo.model.Contato;

@Component("itemProcessor")
@Scope(value = "step")
public class ContatosProcessor implements ItemProcessor<Contato, Contato> {
	
	final static Logger logger = Logger.getLogger(ContatosProcessor.class);

	@Value("#{stepExecutionContext[name]}")
	private String threadName;

	@Override
	public Contato process(Contato item) throws Exception {
		
		logger.info(threadName + " processing : " + item.getId() + " : " + item.getNomeContato());

		return item;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
