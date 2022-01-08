package ec.edu.uce.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;

@Repository
@Qualifier("liviano")
public class VehiculoLivianoRepoImpl implements IVehiculoRepo{

	private static final Logger LOG= LogManager.getLogger(VehiculoPesadoRepoImpl.class);

	//private String Cilindraje;
	
	@Override
	public void GenerarVehiculo(Vehiculo cuenta) {
		
		LOG.info("Se ha generado un vehiculo liviano: "+cuenta);
		//LOG.info("El silindraje ha sido: "+Cilindraje);
		
	}

}
