/* Validação de Segurança (boolean).
 Verifica se a senha possui o comprimento mínimo de 8 caracteres*/

public class SecurityTool {
    
    public boolean isPasswordStrong (String text){
        if (text.length() > 8 ){
            return true;
        } else{
            return false;
        }

    }

        public static void main(String[] args){
            SecurityTool tools = new SecurityTool();

        boolean resultado = tools.isPasswordStrong("senhasegura123");
        System.out.println("A senha é forte? " + resultado);
    }
}
