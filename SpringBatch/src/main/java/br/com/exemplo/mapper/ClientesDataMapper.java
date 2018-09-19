package br.com.exemplo.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import br.com.exemplo.dto.ClientesDTO;

public class ClientesDataMapper implements FieldSetMapper<ClientesDTO>{

	@Override
	public ClientesDTO mapFieldSet(FieldSet fieldSet) throws BindException {
		ClientesDTO dto = new ClientesDTO();
		dto.setNome(fieldSet.readString(0));
		dto.setCpf(fieldSet.readString(1));
		dto.setRg(fieldSet.readString(2));
		dto.setDataNascimento(fieldSet.readString(3));
		dto.setSexo(fieldSet.readString(4));
		
		return dto;
	}
	
}
