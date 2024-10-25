package com.example.weeklist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeeklistApplicationTests {

	private WeeklistApplication daysWeek;

	@BeforeEach
	public void setup() {
		daysWeek = new WeeklistApplication();
		daysWeek.crearDiasSemana();
	}

	@Test
	public void testCreateDaysOfWeek() {
		List<String> days = daysWeek.getDaysWeek();
		assertEquals(7, days.size());
		

	}
	//test returns the days of the week
	@Test
	public void listaDias() {
		List<String> days = daysWeek.getDaysWeek();
		List<String> esperado = List.of("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
		assertNotNull(days);
		assertEquals(esperado, daysWeek.getDaysWeek());
	}

	@Test
	public void largoDias(){
		assertEquals(7, daysWeek.getSizeWeek());
 	}

	/* @Test
    public void testEliminarDia() {
		WeeklistApplication diasDeLaSemana = new WeeklistApplication();
        
        // Eliminar "Miércoles" y verificar
        diasDeLaSemana.eliminarDia("Miércoles");
        
        // Lista esperada después de eliminar "Miércoles"
        List<String> diasEsperados = List.of("Lunes", "Martes", "Jueves", "Viernes", "Sábado", "Domingo");

        assertEquals(diasEsperados, diasDeLaSemana.retornarListaSemana(), "El día no fue eliminado correctamente.");

    }*/

	/*@Test
	public void retornarDia(){
		assertEquals("Lunes", diasSemana.retornarDia("Lunes"));
	}*/

}
