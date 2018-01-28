package mx.com.miproyecto.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public interface Dao<T> {

	public void setDataSource(DataSource dataSource);

	public int inserta(T entidad) throws SQLException;

	public int actualiza(T entidad) throws SQLException;

	public void borra(T entidad) throws SQLException;

	public int contar();

	public T obtenerPorId(T entidad);

	public List<T> obtenerTodos();

}
