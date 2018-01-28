package mx.com.miproyecto.servicio.implementacion;

import java.sql.SQLException;
import java.util.List;

import mx.com.miproyecto.dao.beans.Animal;
import mx.com.miproyecto.dao.implementacion.AnimalDaoImp;
import mx.com.miproyecto.dao.implementacion.PerroDaoImp;
import mx.com.miproyecto.servicio.definicion.Animales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalesServiceImp implements Animales {

	@Autowired
	private AnimalDaoImp animales;

	@Override
	public Animal obtieneAnimalPorId(Animal a) {
		return animales.obtenerPorId(a);
	}

	@Override
	public void borrarAnimal(Animal a) throws SQLException {
		// TODO Auto-generated method stub
	}

	@Override
	public int actualizaAnimal(Animal a) throws SQLException {
		return animales.actualiza(a);
	}

	@Override
	public List<Animal> obtieneListaAnimales() {
		List<Animal> lista = animales.obtenerTodos();

		return lista;
	}

	@Override
	public int insertaAnimal(Animal a) throws SQLException {
		return animales.inserta(a);

	}

}
