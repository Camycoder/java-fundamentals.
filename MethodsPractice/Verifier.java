/*Validação de maioridade com retorno de String. */

public class Verifier {
    
    public String verifier(int idade){

        if (idade < 18){
            return "Menor de idade";

        } else {
            return "Maior de idade";
        }

    
    }
}
