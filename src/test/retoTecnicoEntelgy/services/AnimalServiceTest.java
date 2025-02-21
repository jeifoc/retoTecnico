package retoTecnicoEntelgy.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import retoTecnicoEntelgy.models.abstracts.Animal;
import retoTecnicoEntelgy.models.base.AnimalAcuatico;
import retoTecnicoEntelgy.models.base.AnimalTerrestre;
import retoTecnicoEntelgy.models.base.AnimalVolador;

public class AnimalServiceTest {

    @Test
    public void testCrearAnimales() {
        List<String> input = Arrays.asList(
                "León|TERRESTRE|Rugido",
                "Águila|VOLADOR|Grito",
                "Delfín|ACUATICO|Chirrido"
        );

        List<Animal> animals = AnimalService.crearAnimales(input);

        assertEquals("Debe haber 3 animales válidos en la lista", 3, animals.size());
        assertTrue("El primer animal debe ser terrestre", animals.get(0) instanceof AnimalTerrestre);
        assertTrue("El segundo animal debe ser volador", animals.get(1) instanceof AnimalVolador);
        assertTrue("El tercer animal debe ser acuático", animals.get(2) instanceof AnimalAcuatico);
    }

    @Test
    public void testCrearAnimalesConEntradaVacia() {
        List<String> input = Arrays.asList();
        List<Animal> animals = AnimalService.crearAnimales(input);
        assertTrue("La lista debe estar vacía si la entrada está vacía", animals.isEmpty());
    }

    @Test
    public void testCrearAnimalesConFormatoIncorrecto() {
        List<String> input = Arrays.asList(
                "León|TERRESTRE",
                "|VOLADOR|Grito",
                "Delfín|ACUáTICO|"
        );

        List<Animal> animals = AnimalService.crearAnimales(input);
        assertTrue("No debe crear animales si los datos son incorrectos", animals.isEmpty());
    }
}

