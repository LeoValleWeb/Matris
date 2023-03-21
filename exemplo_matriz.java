public class exemplo_matriz {
     public static void main(String[] args){
       int[][] vet1 = new int[5][5];
       
       for(int externo=0; externo < vet1.length; externo++){
            for(int interno=0; interno < vet1.length; interno++){
            vet1[externo][interno] = externo * interno;
        
            }
        }
     
     for(int externo=0; externo < vet1.length; externo++){
         for(int interno=0; interno < vet1.length; interno++){
             System.out.print(vet1[externo][interno] + "\t");
            
            }
             System.out.print("\n");
            }
        }}