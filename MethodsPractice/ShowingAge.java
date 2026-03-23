/*Formatação de String com parâmetros (int).
 Recebe a idade e retorna uma frase formatada utilizando concatenação.*/

public class ShowingAge {

    public String showingAge(int idade) {

        return "Voce tem " + idade + " anos"; 
    }
    
    public static void main(String[] args) {
        ShowingAge practice = new ShowingAge();
        
        //
        String frase = practice.showingAge(22);
        System.out.println(frase);
    }
}