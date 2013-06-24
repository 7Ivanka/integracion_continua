package com.mycompany.pruebas_de_integracion;

/**
 * Hello world!
 *
 */
 import java.awt.*;
import java.awt.event.*;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
         String retorno="",tempo="";
    public static void main(String arg[])
    {   
        String validar=new EncriptCadena("lobo","toshiba dell hp",true).retorno; //// Para Encriptar
        System.out.println(validar);
        
        String validar2=new EncriptCadena("lobo",validar,false).retorno;  //// Para DesEncriptar
        System.out.println(validar2);
    }
    public EncriptCadena(String c, String t, boolean a)
    {
       int i=0, j=0,ic=c.length(),it=t.length();
       int temp;
       int[] claveascii = new int[ic];
       int[] textoascii = new int[it];
       for (i=0; i<ic;i++)claveascii[i]=c.charAt(i);
       for (i=0; i<it;i++)textoascii[i]=t.charAt(i);
       if(a)
       {
           for (i=0; i<it;i++)
           {
               j++;
               if (j>=ic)j=0;
               temp= textoascii[i]+claveascii[j];
               if (temp > 255) temp=temp-255;
               retorno=retorno + (char)temp;
           }
       }
       else
       {
           for (i=0; i<it;i++)
           {
               j++;
               if (j>=ic)j=0;
               temp= textoascii[i]-claveascii[j];
               if (temp < 0) temp=temp+256;
               retorno=retorno + (char)temp;                    
           }
       }
    }
    }
}
