package retoTecnicoEntelgy.models.base;

import retoTecnicoEntelgy.models.abstracts.Animal;
import retoTecnicoEntelgy.models.enums.AnimalType;

public class AnimalTerrestre extends Animal {

	private final String sound;

	public AnimalTerrestre(String name, AnimalType animalType, String sound) {
		super(name, animalType);
		this.sound = sound;
	}

	@Override
	protected String makeSound() {
		return sound;
	}
	
	public String getSound() {
		return sound;
	}

	@Override
	public String toString() {
		return "[ nombre:" + getName() + ", tipo:" + getAnimalType() +", onomatopeya:" + getSound() + " ]";
	}

}
