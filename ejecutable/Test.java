package ejecutable;

import javax.swing.JOptionPane;

import modelo.Suma;

public class Test 
{
    public static void main(String[] args) 
    {
        // Entrada de datos 
        double x =  Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y =  Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        // Creación de un objeto suma 
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "El resultado de la de " + x + "y" + y +  "es: " + miSuma.mostrarResultado());
    }
    
}
