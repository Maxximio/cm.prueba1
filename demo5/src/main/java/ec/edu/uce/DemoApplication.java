package ec.edu.uce;


import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.service.IVehiculoService;
import ec.edu.uce.service.IPropietarioService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private IPropietarioService propietarioS;
	
	@Autowired
	private IVehiculoService vehiculo1;
	
	private static final Logger LOG= LogManager.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("-----Empezando el programa-----");
		
		Propietario propi = new Propietario();
		
		propi.setNombre("Carlos");
		propi.setApellido("Montalvo");
		propi.setEdad(21);
		
		this.propietarioS.InsertarPropietario(propi);
		
		
		
		Vehiculo vehiculoP=new Vehiculo();
		
		vehiculoP.setMarca("toyota");
		vehiculoP.setModelo("12345");
		vehiculoP.setPlaca("123456SDF");
		vehiculoP.setTipo("pesado");
		vehiculoP.setPropietario(propi);
		vehiculoP.setPrecio(10600);
		
		if(vehiculoP.getPrecio()<=0) {
			LOG.error("el precio es incorrecto.");
			System.exit(0);
		}else if(vehiculoP.getPrecio()<1000) {
			LOG.warn("El precio es muy bajo");
		}else {
			LOG.info("El precio es adecuado");
			this.vehiculo1.Generar(vehiculoP);
		}
		
	}

}
