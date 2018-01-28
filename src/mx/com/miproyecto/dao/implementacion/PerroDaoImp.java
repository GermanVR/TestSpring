package mx.com.miproyecto.dao.implementacion;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import mx.com.miproyecto.dao.RowMapper.AnimalRowMapper;
import mx.com.miproyecto.dao.beans.Animal;
import mx.com.miproyecto.dao.definicion.AnimalDao;
import mx.com.miproyecto.dao.sql.AnimalSql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PerroDaoImp implements AnimalDao {

	private String sql = "";

	JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int inserta(Animal entidad) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualiza(Animal entidad) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void borra(Animal entidad) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Animal obtenerPorId(Animal entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public List<Animal> obtenerTodos() {
		sql = AnimalSql.CONSULTAR.toString();
		return jdbcTemplate.query(sql, new AnimalRowMapper());
	}

}
