package retoTecnicoEntelgy.models.abstracts;

import retoTecnicoEntelgy.models.enums.AnimalType;

public abstract class Animal {
	private String name;
	private AnimalType animalType;

	public Animal(String name, AnimalType animalType) {
		this.name = name;
		this.animalType = animalType;
	}

	protected abstract String makeSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

}
