package ec.edu.uce.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier ("pesado")
public class VehiculoPesadoRepoImpl implements IVehiculoRepo{

	private static final Logger LOG= LogManager.getLogger(VehiculoPesadoRepoImpl.class);

	//private String Toneladas;
	//Toneladas="104ton";
	
	@Override
	public void GenerarVehiculo(Vehiculo cuenta) {
		
		LOG.info("Se ha creado un vehiculo pesado: "+ cuenta);
		//LOG.info("Las toneladas del vehiculo fueron: "+Toneladas);
		
	}

}
