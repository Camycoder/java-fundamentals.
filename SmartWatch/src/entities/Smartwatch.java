package src.entities;


        public class Smartwatch { 
            String nameOwner;
            int stepAmount;
            boolean isBluetoothOn;
            double  burnedCalories;


            public void takeStep(){
                if(isBluetoothOn == true){
                    stepAmount++;    
                } else{
                    System.out.println("Erro: Bluetooth desligado. Passo nao registrado.");
                }

            }

            public void pressBluetoothBottom(){
               isBluetoothOn = !isBluetoothOn;
            }

            public void updateOwner(String newName){
            
                nameOwner = newName;
            }

            public double burningCalories(){
                burnedCalories = stepAmount / 0.5;
                return burnedCalories;

            }


            public String toString() {
                return "Dono: " + nameOwner + " | Passos: " + stepAmount + " | Calorias queimadas: " + burnedCalories;

            }
        
        }



