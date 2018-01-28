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
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AnimalDaoImp implements AnimalDao {
	private String sql = "";
	//
	// @Autowired
	JdbcTemplate s;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.s = new JdbcTemplate(dataSource);
	}

	// @Autowired
	// DriverManagerDataSource dataSource;

	public AnimalDaoImp() {
		System.out.println("Inciai");
		// this.setDataSource(dataSource);
	}

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public int inserta(Animal entidad) throws SQLException {
		sql = AnimalSql.INSERTAR.toString();
		return s.update(sql, new Object[] { entidad.getIdanimal(), entidad.getNombre(), entidad.getEdad() });
	}

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public int actualiza(Animal entidad) throws SQLException {
		sql = AnimalSql.ACTUALIZAR.toString();
		return s.update(sql, new Object[] { entidad.getNombre(), entidad.getEdad(), entidad.getIdanimal() });
	}

	@Override
	@Transactional(propagation = Propagation.MANDATORY)
	public void borra(Animal entidad) throws SQLException {
		sql = AnimalSql.ELIMINAR.toString();
		s.update(sql, entidad.getIdanimal());
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public Animal obtenerPorId(Animal entidad) {
		sql = AnimalSql.CONSULTAR.toString() + "WHERE IDANIMAL=?";
		return s.queryForObject(sql, new Object[] { entidad.getIdanimal() }, new AnimalRowMapper());
	}

	@Override
	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public List<Animal> obtenerTodos() {
		sql = AnimalSql.CONSULTAR.toString();
		return s.query(sql, new AnimalRowMapper());
	}

}
