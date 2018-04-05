package Servidor;
import javax.swing.JOptionPane;

public class SMain {
    public static void main(String[] args) {
        System.out.println("SERVIDOR");
        SModelo modeloM = new SModelo();
        SControlador controladorM = new SControlador(modeloM);
    }
    
}
