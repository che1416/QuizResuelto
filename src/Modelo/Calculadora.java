/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Che
 */
public class Calculadora {
    
    ArrayList<Pattern>arrayCalculadora;
    Pattern cantidades=Pattern.compile("");
    
    public Calculadora()
    {
        arrayCalculadora=new ArrayList<>();
        Operaciones();
    }
    
    public void Operaciones()
    {
        cantidades=Pattern.compile("(\\d+\\,\\d{3}\\.\\d+)\\+(\\d+)");
        arrayCalculadora.add(cantidades);
    }
    
    public String OperacionSuma(String impresion)
    {
        double operacion=0.0;
         String datos="";
        for(int i=0;i<arrayCalculadora.size();i++){
            Pattern validacion = arrayCalculadora.get(i);
            Matcher matcher = validacion.matcher(impresion);
                if( matcher.find()){
                System.out.println("Entro");
                System.out.println("grupo 1"+matcher.group(1));
                datos=matcher.group(1);
                datos=datos.replaceAll(",","");
                System.out.println("se cambio coma"+datos);
                operacion=Double.parseDouble(datos)+Integer.parseInt(matcher.group(2));
                datos=datos +"+"+ Integer.parseInt(matcher.group(2))+"=" +operacion;
            }
        }
        if(datos.equals("")){
            System.out.println("esta expresion es invalida ");
        }
        return datos;
    }
    
}
