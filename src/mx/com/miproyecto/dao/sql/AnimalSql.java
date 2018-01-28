package mx.com.miproyecto.dao.sql;

public enum AnimalSql {
	INSERTAR, CONSULTAR, ACTUALIZAR, ELIMINAR;

	public String toString() {
		switch (this) {
		case ACTUALIZAR:
			return "UPDATE ANIMAL SET NOMBRE=?, EDAD=? WHERE IDANIMAL=?";
		case CONSULTAR:
			return "SELECT IDANIMAL, NOMBRE, EDAD FROM ANIMAL ";
		case ELIMINAR:
			return "DELETE FROM ANIMAL WHERE IDANIMAL=? ;";
		case INSERTAR:
			return "INSERT INTO ANIMAL (IDANIMAL, NOMBRE, EDAD) VALUES(?, ?, ?);";
		}
		return null;
	}
}
