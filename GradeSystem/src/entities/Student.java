package entities;

public class Student {
    String name;
    int ID;
    double [] grades;


    public Student (String name, int ID, double[] grades){

        this.name = name;
        this.ID = ID;
        this.grades = grades;

    } 

    public double calculateAverage(){

        double sum = 0;

        for (double nota : grades){
            sum += nota;

        }
          return sum / grades.length;
    }

    public void showReport(){
        System.out.println("Your final grade is: " +  calculateAverage());

    }


    
}
