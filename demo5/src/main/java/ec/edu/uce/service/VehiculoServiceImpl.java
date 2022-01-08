package ec.edu.uce.service;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IVehiculoRepo;;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	private static final Logger LOG= LogManager.getLogger(IVehiculoService.class);
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoRepo vehipesado;
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoRepo vehiliviano;

	
	@Override
	public void Generar(Vehiculo vehiculo) {
		
		String toneladas="23";
		String cilindraje="800";//de prueba
		
		LOG.info("Generando precio dependiendo del vehiculo");
		
		if(vehiculo.getTipo()=="pesado") {
			float calculado1 = (float) (vehiculo.getPrecio()*0.15);
			vehiculo.setValorMatricula(calculado1);
			
			this.vehipesado.GenerarVehiculo(vehiculo);
			LOG.info("Las toneladas han sido: "+toneladas);
			
			
		}else {
			
			float calculado2 = (float) (vehiculo.getPrecio()*0.10);
			vehiculo.setValorMatricula(calculado2);
			
			this.vehiliviano.GenerarVehiculo(vehiculo);
			LOG.info("El cilindraje ha sido: "+cilindraje);
		}
		
	}		



}
