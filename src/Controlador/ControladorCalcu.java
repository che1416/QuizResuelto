/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.PrincipalCalculadora;
import Modelo.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Che
 */
public class ControladorCalcu implements ActionListener {
    
    Calculadora calcu;
    PrincipalCalculadora principal;

    public ControladorCalcu(PrincipalCalculadora principal) {
        this.principal = principal;
        calcu=new Calculadora();
    }

    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Calcular"))
        {
            principal.error().setText(calcu.OperacionSuma(principal.ope().getText()));
        }
    }
}
