package retoTecnicoEntelgy.services;

import java.util.ArrayList;
import java.util.List;

import retoTecnicoEntelgy.models.abstracts.Animal;
import retoTecnicoEntelgy.models.base.AnimalAcuatico;
import retoTecnicoEntelgy.models.base.AnimalTerrestre;
import retoTecnicoEntelgy.models.base.AnimalVolador;
import retoTecnicoEntelgy.models.enums.AnimalType;


public class AnimalService {
	public static List<Animal> crearAnimales(List<String> input) {
		List<String> inputCopy = List.copyOf(input);
		List<Animal> animalsOutput = new ArrayList<Animal>();
		for (String singleAnimal : inputCopy) {
			String[] data = singleAnimal.split("\\|");
			if (data.length == 3) {
				final String name = data[0].trim();
				final String animalType = data[1].toUpperCase().trim();
				final String sound = data[2].trim();
				try {
					AnimalType animalTypeFormatted = AnimalType.valueOf(animalType);
					switch (animalTypeFormatted) {
					case TERRESTRE:
						animalsOutput.add(new AnimalTerrestre(name, AnimalType.TERRESTRE, sound));
						break;
					case VOLADOR:
						animalsOutput.add(new AnimalVolador(name, AnimalType.VOLADOR, sound));
						break;
					case ACUATICO:
						animalsOutput.add(new AnimalAcuatico(name, AnimalType.ACUATICO, sound));
						break;
					}
				} catch (IllegalArgumentException e) {
					System.out.println("Error en el ingreso de datos: " + e);
				}
			}
		}
		return animalsOutput;
	}

	public static void imprimirAnimalesPorTipo(List<Animal> animales) {
		List<AnimalTerrestre> listTerrestre = new ArrayList<>();
		List<AnimalVolador> listVolador = new ArrayList<>();
		List<AnimalAcuatico> listAcuatico = new ArrayList<>();

		for (Animal singleAnimal : animales) {
			try {
				switch (singleAnimal.getAnimalType()) {
				case TERRESTRE:
					listTerrestre.add((AnimalTerrestre) singleAnimal);
					break;
				case ACUATICO:
					listAcuatico.add((AnimalAcuatico) singleAnimal);
					break;
				case VOLADOR:
					listVolador.add((AnimalVolador) singleAnimal);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Error en el tipo de dato: " + e);
			}
		}

		System.out.println("Animales Terrestres:");
		for (AnimalTerrestre terrestre : listTerrestre) {
			System.out.println(terrestre.toString());
		}

		System.out.println("\nAnimales Voladores:");
		for (AnimalVolador volador : listVolador) {
			System.out.println(volador.toString());
		}

		System.out.println("\nAnimales Acuáticos:");
		for (AnimalAcuatico acuatico : listAcuatico) {
			System.out.println(acuatico.toString());
		}
	}
}
