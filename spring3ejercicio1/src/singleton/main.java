package singleton;

import java.util.Scanner;

public class main {
    public static void main (String[]args){

        Undo n=  Undo.getInstance();
        boolean estadoMenu=true;

        while (estadoMenu==true){

            System.out.println("Opción 1= Añadir comando");
            System.out.println("Opción 2= Eliminar comando");
            System.out.println("Opción 3= Mostrar comandos");
            System.out.println("Opción 4= Salir del menú");
            switch (pideInt("Que deseas hacer?")){

                case 1:
                    n.agregar(pideString("Qué comando deseas añadir"));
                    break;

                case 2:
                    n.eliminar(pideInt("En que posición está el comando a eliminar?"));

                case 3:

                    n.mostrarHistorial();
                    break;
                case 4:
                    estadoMenu=false;
                    break;
        }


    }}
    public static String pideString(String pregunta){
        System.out.println(pregunta);
        Scanner sc =new Scanner(System.in);
        String respuesta= sc.nextLine();
        return respuesta;
    }
    public static int pideInt(String pregunta){
        System.out.println(pregunta);
        Scanner sc =new Scanner(System.in);
        int numero= sc.nextInt();
        return numero;
    }
}
