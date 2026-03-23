
/* Método void para exibição de dados formatados.
 Recebe nome e curso, realizando a concatenação e impressão no console. */

public class Basic {
    
    public void saudacao (String nome, String curso) {
        System.out.println("Olá! " + nome +"" + "seu curso é:"+ curso);

    }

    public static void main(String[] args) {
        Basic practice = new Basic();

        practice.saudacao("Camy ", " InfoSec");
    }
}
