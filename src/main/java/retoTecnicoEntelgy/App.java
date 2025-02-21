package retoTecnicoEntelgy;

import java.util.Arrays;
import java.util.List;

import retoTecnicoEntelgy.models.abstracts.Animal;
import retoTecnicoEntelgy.models.base.AnimalAcuatico;
import retoTecnicoEntelgy.models.enums.AnimalType;
import retoTecnicoEntely.services.AnimalService;

public class App {

	public static void main(String[] args) {
		List<String> inputFormatted = Arrays.asList(args);
		List<Animal> listAnimal = AnimalService.crearAnimales(inputFormatted);
		AnimalService.imprimirAnimalesPorTipo(listAnimal);
	}

}
