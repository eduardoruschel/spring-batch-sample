package br.com.exemplo.writer;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import br.com.exemplo.model.Contato;

public class ContatosWriter implements ItemStreamWriter<Contato>, InitializingBean {

	private ItemWriter<Contato> delegate;

	public void setDelegate(ItemWriter<Contato> delegate) {
		this.delegate = delegate;
	}

	@Override
	public void write(List<? extends Contato> items) throws Exception {

		for (Contato contato : items) {

			System.out.println(contato.getId());

		}

	}

	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		System.out.println("open " + executionContext.toString());
		if (delegate instanceof ItemStream) {
			((ItemStream) delegate).open(executionContext);
		}
	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		System.out.println("update " + executionContext.toString());
		if (delegate instanceof ItemStream) {
			((ItemStream) delegate).update(executionContext);
		}
	}

	@Override
	public void close() throws ItemStreamException {
		System.out.println("close ");
		if (delegate instanceof ItemStream) {
			((ItemStream) delegate).close();
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(delegate, "A delegate ItemWriter must be provided.");

	}

}
