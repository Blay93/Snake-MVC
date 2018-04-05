package Cliente;

import javax.swing.JOptionPane;

public class CMain {
    public static void main(String[] args) {
        try{
            String IP = JOptionPane.showInputDialog("Ingrese IP: ");
            if (IP.equals(null)) System.exit(0);
            int puerto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Puerto: "));
            CControlador controlador = new CControlador(IP,puerto);
            new CVista(controlador).setVisible(true);
        }
        catch(Exception e){System.exit(0);}
    }
}
