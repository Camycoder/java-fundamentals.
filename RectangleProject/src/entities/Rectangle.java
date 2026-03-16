/* Programa que leia os valores da largura e altura de um retângulo, mostrando o valor da sua area, perimetro e diagonal. Usando POO. */

package entities;

import java.lang.Math;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
         return width * height;
    }
        

     public double perimetro(){
            return 2* (width + height);

    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width,2.0) + Math.pow(height, 2.0));
    }

}

 
       

