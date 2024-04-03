package singleton;

import java.awt.*;
import java.util.ArrayList;

public class Undo {

     private static Undo instance;
     private static ArrayList<String> listadeComandos;
     private Undo(){
          listadeComandos=new ArrayList<>();
     }

     public static Undo getInstance(){
          if (instance==null){
               instance=new Undo();
          }

          return instance;
     }

     public void agregar (String comando){
          listadeComandos.add(comando);
     }
     public void eliminar (int posicionComando){
          listadeComandos.remove(posicionComando);
     }

     public void mostrarHistorial(){
          for(String comando:listadeComandos){
          System.out.println(comando);}

     }
}
