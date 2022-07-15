
package org.reneyuman.system;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import org.reneyuman.bean.Division;
import org.reneyuman.bean.Multiplicacion;
import org.reneyuman.bean.Resta;
import org.reneyuman.bean.Salir;
import org.reneyuman.bean.Suma;

/*Programador : Rene Alejandro Yuman Barco
*inicio 13/04/2021
*Calculadora con clases
*/
public class Principal {

 
    public static void main(String[] args) {
        int op, n1, n2,numw = 3;
        
        Suma sum = new Suma(0,0);
        Resta res = new Resta(0,0);
        Multiplicacion multi = new Multiplicacion(0,0);
        Division div = new Division(0,0);
        Salir salida = new Salir();
        
        JOptionPane.showMessageDialog(null,"Programador:\n"
                + "Rene Alejandro Yuman Barco");   
        do{
        op = parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"
                + "1 == suma\n"
                + "2 == resta\n"
                + "3 == multiplicacion\n"
                + "4 == division\n"
                + "5 == salir"));
        switch (op){
            case 1:
            sum.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor","Suma",JOptionPane.INFORMATION_MESSAGE)));
            sum.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor","Suma",JOptionPane.INFORMATION_MESSAGE)));
            JOptionPane.showMessageDialog(null,"El resultado es: "+String.valueOf(sum.operacions(sum.getNum1(),sum.getNum2())),"Suma",JOptionPane.INFORMATION_MESSAGE);
            
                break;
  
            case 2:
            res.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor","Resta",JOptionPane.INFORMATION_MESSAGE)));
            res.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor","Resta",JOptionPane.INFORMATION_MESSAGE)));
            JOptionPane.showMessageDialog(null,"El resultado es: "+String.valueOf(res.operacionr(res.getNum1(),res.getNum2())),"Resta",JOptionPane.INFORMATION_MESSAGE);
            
                break;
            
            case 3:
            multi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor","Multiplicacion",JOptionPane.INFORMATION_MESSAGE)));
            multi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor","Multiplicacion",JOptionPane.INFORMATION_MESSAGE)));
            JOptionPane.showMessageDialog(null,"El resultado es: "+String.valueOf(multi.operacionm(multi.getNum1(),multi.getNum2())),"Multiplicacion",JOptionPane.INFORMATION_MESSAGE);
            
                break;
            
            case 4:
            div.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor","Division",JOptionPane.INFORMATION_MESSAGE)));
            div.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor","Division",JOptionPane.INFORMATION_MESSAGE)));
            JOptionPane.showMessageDialog(null,"El resultado es: "+String.valueOf(div.operaciond(div.getNum1(),div.getNum2())),"Division",JOptionPane.INFORMATION_MESSAGE);
            
                break;
            
            case 5:
                salida.salida();
                break;
            
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                break;
        }

        
        }while(numw == 3);
        
    }
    
}
