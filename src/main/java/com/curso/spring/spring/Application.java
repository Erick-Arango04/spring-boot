	package com.curso.spring.spring;

	import com.curso.spring.spring.Ioc.Motor;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.ConfigurableApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.curso.spring.spring.Ioc.Carro;



	@SpringBootApplication
	// implementar implements CommandLineRunner
	public class Application {

		public static void main(String[] args) throws Exception {

			// esté código se analizara a detalle despues, su uso es idéntico al código de abajo
		   // sirve para obtener beans que no son creados con archivos xml si no con anotaciones

	        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

			Carro carro = context.getBean(Carro.class);

		    System.out.println(carro);

		  /*
		   * ApplicationContext es la representación del contenedor de spring
		   *   esta nos permite obtener beeans

			ApplicationContext context = new ClassPathXmlApplicationContext( "Carro.xml");

			para obtener un bean tomen el (context) y utilicen el metodo .getBean(clase del obj)

			*
			*/

		}


		/*
		 * este código se elaboro para demostrar como trabajamos de forma
		 * normal sin utilizar terminos como Inversión de control y
		 * inyección de dependencias
		 *
		 * por ende se crean objetos de forma manual y se passan por constructor
		 * para probar este código debes de descomentar las lineas que
		 * abarcan el método run y implemetar la interfaz ComanLineRunner
		 */

		/*
		@Override
		public void run(String... args){

			Motor mo1 = new Motor();
			Estereo es1 = new Estereo();
			SistemaSeguros si1 = new SistemaSeguros();

			// inyeccion por constructor
			Carro carro = new Carro();

			// inyeccion por seter
			carro.setEstereo(es1);
			carro.setMotor(mo1);
			carro.setSeguros(null);

				try {
					carro.correr();
				} catch (Exception e) {
					e.printStackTrace();
				}

		}

		*/

	}
