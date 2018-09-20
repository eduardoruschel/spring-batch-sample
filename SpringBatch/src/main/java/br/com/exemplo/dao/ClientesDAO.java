package br.com.exemplo.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.exemplo.app.AppConfig;
import br.com.exemplo.mapper.ClienteRowMapper;
import br.com.exemplo.model.Cliente;

@Repository
public class ClientesDAO implements Dao<Cliente> {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		AppConfig appConfig = new AppConfig();
		dataSource = appConfig.dataSource();
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Cliente cliente) {
		if (jdbcTemplate == null)
			this.postConstruct();

		String sql = "insert into Cliente(id, cpf,nome, rg, datanascimento, sexo) values (SEQ_CLIENTE.Nextval,?,?,?,?,?)";
		jdbcTemplate.update(sql, cliente.getCpf(), cliente.getNome(), cliente.getRg(), cliente.getDataNascimento(), cliente.getSexo());
	}

	public Cliente getClienteByCpf(String cpf) {
		if (jdbcTemplate == null)
			this.postConstruct();
		
		String sql =  "select nome, cpf, RG, DATANASCIMENTO,  SEXO from CLIENTE where cpf = :cpf";
		
		try {
			Cliente cliente = (Cliente) jdbcTemplate.queryForObject(
					sql, new Object[] { cpf }, new ClienteRowMapper());
			return cliente;
		} catch (org.springframework.dao.EmptyResultDataAccessException e) {}

		return null; 
	}

	@Override
	public void update(Cliente cliente) {
		if (jdbcTemplate == null)
			this.postConstruct();

		String sql = "update Cliente set nome = ?, rg= ?, datanascimento = ?, sexo = ? where cpf = ?";
		jdbcTemplate.update(sql,  cliente.getNome(), cliente.getRg(), cliente.getDataNascimento(), cliente.getSexo(), cliente.getCpf());
		
	}
	
}
