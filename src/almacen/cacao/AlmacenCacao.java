/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen.cacao;

/**
 *
 * @author Usuario
 */
public class AlmacenCacao extends MenuInicio {

    public AlmacenCacao() {
        super();
        setTitle("Almacen Cacao");
    }

    public void mostrar() {
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlmacenCacao almacen = new AlmacenCacao();
        almacen.mostrar();
    }
}
