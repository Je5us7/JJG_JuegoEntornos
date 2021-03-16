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

		System.out.println("Esta es la hístoria de  "+nombre+" el cual se encontraba tumbado en la cama, un día cualquiera, cuando....");

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1: Se queda 20 minutos mas en la cama.\n"
				+  "2: Se levanto de la cama y se fue a desayunar \n"
				+  "3: De repente se escucho un estruendo. \n");

		opcion=scanner.nextInt();

		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
			opcion=scanner.nextInt();
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




	}

}
