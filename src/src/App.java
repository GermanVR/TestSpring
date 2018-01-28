package src;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import mx.com.miproyecto.dao.beans.Animal;
import mx.com.miproyecto.servicio.implementacion.AnimalesServiceImp;

public class App {
	public static void main(String[] args) throws SQLException {

		Animal a = new Animal(3, "Cat", 12);

		// ApplicationContext con = new
		// ClassPathXmlApplicationContext("jdbc.xml");
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		AnimalesServiceImp ob = (AnimalesServiceImp) con.getBean(AnimalesServiceImp.class);
		// System.out.println(ob.actualizaAnimal(a));
		// System.out.println(ob.insertaAnimal(a));

		List<Animal> lista = ob.obtieneListaAnimales();
		for (Animal animal : lista) {
			System.out.println("IdAnimal: " + animal.getIdanimal());
			System.out.println("Nombre: " + animal.getNombre());
			System.out.println("Edad: " + animal.getEdad());
		}

		((AbstractApplicationContext) (con)).close();

	}
}
