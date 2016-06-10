import java.util.Scanner;

/**
 * Created by EasyNote on 10/06/2016.
 */
public class main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Tu aimes le cassoulet ? 1 pour OUIIII, 2 pour NOOON");

        int rep = sc.nextInt();

        if(rep == 1){System.out.println("T'es un bon toi !");}
        else if(rep == 2){System.out.println("VEGETARIEN !!!!");}
        else{System.out.println("ptetre bien oui, ptetre bien que non, c'est ça ?");}



    }
}
