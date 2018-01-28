package mx.com.miproyecto.servicio.definicion;

import java.sql.SQLException;
import java.util.List;

import mx.com.miproyecto.dao.beans.Animal;

public interface Animales {

	public Animal obtieneAnimalPorId(Animal a);

	public void borrarAnimal(Animal a) throws SQLException;

	public int actualizaAnimal(Animal a) throws SQLException;

	public int insertaAnimal(Animal a) throws SQLException;

	public List<Animal> obtieneListaAnimales();

}
