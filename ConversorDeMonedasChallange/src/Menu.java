import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void menuInicio() throws IOException, InterruptedException {
        int opcion = 0;
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);

        String menu =  """
                    ************************
                    Escriba  el numero correspondiente a la conversion deseada
                    1. Convertir USD a MXN
                    2. Convertir PEN a ARS
                    3. Convertir USD a ARS
                    4. Convertir USD a BRL
                    5. Convertir ARS a BRL
                    6. Convertir PEN a BRL
                    ************************
                    """;

        while (continuar){
            System.out.println("Desea hacer alguna conversion? (digite  el numero 1 para si,  cualquier otro para no)" );
            double iniciarSistema = teclado.nextDouble();
            if(iniciarSistema == 1){
                double value = cantidadDigitadaUsuario();
                System.out.println(menu); // Mostrar el menu
                opcion = teclado.nextInt(); //La opcion que elige el usuario

                switch (opcion){
                    case 1:
                        ConeccionAPI.soliciud("USD","MXN",value);
                        break;
                    case 2:
                        ConeccionAPI.soliciud("PEN","ARS",value);
                        break;
                    case 3:
                        ConeccionAPI.soliciud("USD","ARS",value);
                        break;
                    case 4:
                        ConeccionAPI.soliciud("USD","BRL",value);
                        break;
                    case 5:
                        ConeccionAPI.soliciud("ARS","BRL",value);
                        break;
                    case 6:
                        ConeccionAPI.soliciud("PEN","BRL",value);
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }
            }else {
                System.out.println(" Finalizando, Gracias por usar nuestro servicio");
                continuar = false;
            }

        }
    }

    private static double cantidadDigitadaUsuario() {
        Scanner entradaUsuario = new Scanner(System.in);
        double cantidad = 0;
        System.out.println("Ingrese la cantidad a convertir");
        cantidad = entradaUsuario.nextDouble();
        return cantidad;
    }
}
