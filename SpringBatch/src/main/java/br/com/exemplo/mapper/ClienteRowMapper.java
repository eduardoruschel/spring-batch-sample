package br.com.exemplo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.exemplo.model.Cliente;

public class ClienteRowMapper  implements RowMapper<Cliente> {

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {

		Cliente cliente = new Cliente();
		cliente.setCpf(rs.getString("CPF"));
		cliente.setDataNascimento(rs.getString("DATANASCIMENTO"));
		cliente.setNome(rs.getString("NOME"));
		cliente.setRg(rs.getString("RG"));
		cliente.setSexo(rs.getString("SEXO"));
		
		return cliente;
	}

}
