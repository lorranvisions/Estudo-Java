import java.util.*;

public class Ex06{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra, palavraAux;
        int i=0, achou;

        while(i == 0){
            System.out.print("Escreva uma palavra que contenha F ou  começa com P: ");
            palavra = ler.nextLine();
            
            palavra = palavra.toUpperCase();
            achou = palavra.indexOf("F");
            
            if(palavra.substring(0).equals("P") ){
                System.out.print("A sua palavra começa com P!: "+palavra);
                i++;
            }else if(achou != -1){
                System.out.print("A sua palavra conte com F!: "+palavra);
                i++;
            }
        }
        
    }
}
