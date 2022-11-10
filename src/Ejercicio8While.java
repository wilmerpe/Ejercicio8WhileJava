import javax.swing.*;

public class Ejercicio8While {
    public static void main(String[] args) {
        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un valor de un número: "));

        i = 1;
        while(i <=numero){
            System.out.println(i);
            i++;
        }
    }
}
