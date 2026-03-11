/* Printa apenas os números pares de 2 até 20.
 */
public class NumerosPares {

    public static void main(String[] args) {
        
        for (int i = 2; i <= 20; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}