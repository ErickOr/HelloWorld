
package javaapplication1;
import java.io.Serializable;
public class Proveedor implements Serializable {
    private String nombre;
    private int  price;
    private int quantity;
    private int providerCode;

        public Proveedor(String nombre, int price, int quantity, int providerCode) {
            this.nombre = nombre;
            this.price = price;
            this.quantity = quantity;
            this.providerCode = providerCode;
        }
 

    public Proveedor() {
            }
   
    @Override
    public String toString() {
        return "nombre :" + nombre + ", price" + price + ", quantity:" + quantity + ", providerCode:" +providerCode;
    }
    
}