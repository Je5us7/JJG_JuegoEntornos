import java.util.Scanner;

public class JuegoDeElecccion_JJG {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		
		int opcion;
		
		String nombre;
		
		System.out.print(" \n - Escriba su nombre para empezar el juego: ");
		nombre=scanner.next().toUpperCase();
		
		System.out.println("\n ¡¡BIENVENIDO "+nombre+" !! \n");
		
		System.out.println("Empezemos con la historia...\n");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Esta es la historia de "+nombre+", el/la cual se encontraba tumbad@ en la cama, un día cualquiera, cuando....");
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1: Se queda 20 minutos mas en la cama.\n"
						+  "2: Se levanta de la cama y se va a desayunar \n"
						+  "3: De repente escuchó un estruendo proveniente del jardín del vecino, y decide echar un vistazo por la ventana. \n");
		
		opcion=scanner.nextInt();
		
		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
	
	   opcion=scanner.nextInt();
	  
		} if (opcion == 1) {

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Al quedarse 20 minutillos mas en la cama " + nombre +" pensó que no pasaría nada,\n"
					+ "ya que solía hacerlo a menudo arriesgandose a llegar tarde, pero \n"
					+ "esta vez sería un ruido lo que cambiaría todo." );

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("1:" + nombre + " se levanta para ver que ha pasado, cree haber oído a su gato gritar de dolor de alguna manera.\n"
					+  "2:" + nombre + " como de costumbre se queda durmiendo, habrá sido su gato jugando con alguna zapatilla.");

			opcion=scanner.nextInt();


			if(opcion<=0 || opcion>3 ) {
				System.out.println("Escoge de nuevo");
				opcion=scanner.nextInt();
			}
			if (opcion == 1) {

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("En efecto se trataba de su gato juan muerto encima de la encimera de la cocina,\n" 
									+  nombre + " desesperado llama al veterinario, paralizado por los nervios,\n" 
									+ "miedo y desolación al presenciar tal imagen de su mejor amigo.");
			
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("1:El veterinario coge el telefono y se dirije rapidamente a casa de " + nombre + ".\n"
								 + "2:El veterinario no coge el telefono por lo que " + nombre + " decide reanimar el mismo a su amigo.");

				opcion=scanner.nextInt();

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				
				if(opcion<=0 || opcion>3 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}
				
				if (opcion == 1) {
					System.out.println("Al llegar hacia casa de " + nombre + ", el veterinario se pierde antes de llegar,\n" 
				                       + "por lo que el gato de " + nombre + " muere, lo sentimos.");
					
				}if (opcion == 2) {
					System.out.println("Gracias a Dios el veterinario ha llegado a tiempo a tu casa y el gato de\n " 
										+ nombre + " ha conseguido sobrevivir, felicidades.");
					
				}

			} if (opcion == 2) {

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Finalmente " + nombre + " se despierta cuatro horas más tarde, " + nombre +  " ha desperdiciado el día,\n"
						 + "la cocina huele raro, es a su gato muerto, " + nombre +  " no tendrá la conciencia tranquila de por vida\n" 
						 + "su mejor amigo ha muerto por su culpa.");
				
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("1:" + nombre + " sigue su vida con normalidad.\n"
								 + "2:" + nombre + " decide acabar con su vida en compensación hacia su gato.");

				opcion=scanner.nextInt();

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				
				if(opcion<=0 || opcion>3 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}
				
				if (opcion == 1) {
					System.out.println("Lo sentimos, pero usted no tiene sentimientos.");
					
				}if (opcion == 2) {
					System.out.println("No hay que ser tan radical, pero hay que levantarse a tiempo.");
					
				}

			}

			}

		if(opcion == 2) {

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Al bajar a la cocina "+ nombre+" se extraño, al no ver a nadie pululando por la casa, ya que eran las 10 de la mañana...");

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("1: Siguió desayunando tranquilamente.\n"
					+  "2: LLamó rapidamente a sus padres.\n");

			opcion=scanner.nextInt();

			if(opcion<=0 || opcion>2 ) {
				System.out.println("Escoge de nuevo");
				opcion=scanner.nextInt();
			}


			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



			if(opcion==1) {
				System.out.println(nombre+" se sirvió los cereales y posteriormente se fue al salón a ver la tele..");

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("1: Termino de desayunar.\n"
						+  "2: Se fue a servir otro tazón de cereales.\n");

				opcion=scanner.nextInt();

				if(opcion<=0 || opcion>2 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if(opcion==1) {
					System.out.println("Y como buen estudiante "+nombre+" responsable, se puso a estudiar hasta que dieron las tantas de la noche.\n");
					opcion=0;
				}
				if(opcion==2) {
					System.out.println("De tanto comer cereales, "+nombre+" se quedo dormido y no hizo nada productivo en el día.\n");
					opcion=0;
				}

			}




			if(opcion==2) {
				System.out.println(nombre+" subió a su habitacion a toda velocidad, cogió el teléfono y procedió a llamerles....");

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("1: Sus padres no contestaron.\n"
						+  "2: Le cogieron la llamada.\n");

				opcion=scanner.nextInt();

				if(opcion<=0 || opcion>2 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}


				if(opcion==1) {
					System.out.println("Por lo que "+nombre+" se puso muy nervioso y salio a la calle a...");


					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("1: Avisar a la policía.\n"
							+  "2: Buscar a sus padres al trabajo.\n");

					opcion=scanner.nextInt();

					if(opcion<=0 || opcion>2 ) {
						System.out.println("Escoge de nuevo");
						opcion=scanner.nextInt();
					}

					if(opcion==1) {
						System.out.println("Cuando la polícia llego al lugar donde se encontraba "+nombre+" le dio la mala noticia,\n "
								+ "de que sus padres habian muerto en un accidente.");
						opcion=0;
					}
					if(opcion==2) {
						System.out.println("Le echaron la bronca por ir hasta allí y haber interrumpido su ");
						opcion=0;
					}


				}


				if(opcion==2) {
					System.out.println("Al coger la llamada a "+nombre+" le dijeron que estaba bien, y que habian salido un poco antes para darle una sorpresa,\n ya que ese día era ¡SU CUMPLEAÑOS! ");
					opcion=0;
				}

			}
		}
		
		
		
	if (opcion == 3) {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Entre legañas, " + nombre + " se asoma por la ventana y descubre que un coche \nse ha estrellado contra la casa del vecino. Ante este panorama... \n");
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1: Avisa a la policía.\n"
				+  "2: Se pone su chaleco y va a investigar.\n");
		
		opcion=scanner.nextInt();
		
		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
			opcion=scanner.nextInt();
		}
		if (opcion == 1) {
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nombre + " cuenta lo ocurrido a la policía desde la seguridad de su casa, y minutos mas tarde, \nun par de oficiales se aproximan al coche estrellado, del cual por cierto, no ha salido nadie por el momento. \nTus vecinos no parecen haberse percatado del incidente.\nEs todo muy extraño.\nDesde la ventana observas que los policías se miran extrañados y comienzan a llamar a la puerta de tu vecino\nEn el instante en el que el puño del oficial golpea la puerta suena tu teléfono...\n");
			
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("1: Coges el teléfono.\n"
					+  "2: No coges el teléfono.\n");
			
			opcion=scanner.nextInt();
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (opcion == 1) {
				System.out.println("Escuchas como tu vecino te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobró la vida de tu vecino.\n El juez Dios está sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". ¿Tú crees que suicidó tu vecino?\n A lo que respondiste: Yo no creo eso, porque se veía bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: Así pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
			}else {
				System.out.println("A pesar de no coger el teléfono sientes como tu vecino te llama.\n Escuchas como tu vecino te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobró la vida de tu vecino.\n El juez Dios está sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". ¿Tú crees que suicidó tu vecino?\n A lo que respondiste: Yo no creo eso, porque se veía bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: Así pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
				opcion = 1;
			}
			
		}
		if (opcion == 2) {
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nombre + " se pone su chaleco y se aproxima al coche para darse cuenta, por desgracia, de que el que se ha estrellado es su vecino.\n Ante esta situación procedes a llamar a una ambulancia.\n Para tu asombro la voz que te responde es la de tu vecino, el cual, te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobró la vida de tu vecino.\n El juez Dios está sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". ¿Tú crees que suicidó tu vecino?\n A lo que respondiste: Yo no creo eso, porque se veía bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: Así pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
			
		}
		
	}	
		
		
		
		

	}
	
}

