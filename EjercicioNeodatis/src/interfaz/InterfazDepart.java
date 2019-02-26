package interfaz;

import org.neodatis.odb.ODB;

import logica.Departamento;
import logica.Excepciones.NumDepartDuplicado;

public interface InterfazDepart {
	
	public void insertarDep(ODB odb) throws NumDepartDuplicado;
	
	public void borrarDep(ODB odb);
	
	public void consultarDep(ODB odb);
	
	public void modificarDep(ODB odb);

}