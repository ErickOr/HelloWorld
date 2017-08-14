
package javaapplication1;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Andrew
 */
public class FileManager {
    FileOutputStream fichero = null;
    String nombrearchivo=null;

    public FileManager(String nombrearchivo) {
        this.nombrearchivo= nombrearchivo;
        File af = new File(nombrearchivo);
        if (af.exists()) {
            System.out.println("El fichero  existe");
        }else{
            System.out.println("El fichero no existe creando el fichero....");
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(nombrearchivo));
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        }
    }
    public void escribir(Object hm ) {
         try
        {   
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(nombrearchivo,true));
            oos.writeObject(hm);
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void leeFichero(String fichero)
    {
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            // Se lee el primer objeto
            Object aux = ois.readObject();
            // Mientras haya objetos
            while (aux!=null)
            {   
                System.out.println(aux);
                aux = ois.readObject();
            }
        ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
    }
    }