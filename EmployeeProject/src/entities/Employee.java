/*fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
Mostrar os dados do funcionário, aumentar o salário do funcionário com base em uma porcentagem dada e mostrar os dados do funcionário */

package entities;


public class Employee {

    public String name ;
    public double grossSalary;
    public double tax;

    public double netSalary(){

        return grossSalary - tax ;

    }

    public void increaseSalary (double percentage){

        this.grossSalary += (this.grossSalary * percentage/100.0);

    }

    public String toString(){

        return name + ", $ " + String.format("%.2f", netSalary());
    }

}


