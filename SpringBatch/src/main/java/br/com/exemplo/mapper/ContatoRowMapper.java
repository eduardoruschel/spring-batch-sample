package br.com.exemplo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.exemplo.model.Contato;

public class ContatoRowMapper implements RowMapper<Contato> {

	@Override
	public Contato mapRow(ResultSet rs, int rowNum) throws SQLException {

		Contato contato = new Contato();
		contato.setId(rs.getInt("id"));
		contato.setDdd(rs.getString("ddd"));
		contato.setTelefone(rs.getString("telefone"));
		contato.setNomeContato(rs.getString("nomecontato"));
		
		return contato;
	}

}
