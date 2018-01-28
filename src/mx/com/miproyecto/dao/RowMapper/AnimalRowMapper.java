package mx.com.miproyecto.dao.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mx.com.miproyecto.dao.beans.Animal;

import org.springframework.jdbc.core.RowMapper;

public class AnimalRowMapper implements RowMapper<Animal> {

	@Override
	public Animal mapRow(ResultSet rs, int arg1) throws SQLException {
		Animal a = new Animal();
		a.setIdanimal(rs.getInt("idanimal"));
		a.setNombre(rs.getString("nombre"));
		a.setEdad(rs.getInt("edad"));
		return a;
	}

}
