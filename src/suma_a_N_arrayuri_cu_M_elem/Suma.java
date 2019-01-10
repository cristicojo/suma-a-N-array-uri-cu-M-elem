//Sa se calculeze suma a N array-uri cu M elemente.
//
//        Specificatii:
//        - N si M se vor citi de la tastatura.
//        - Va exista un array care sa contina sumele elementelor. Array-ul incepe cu capacitatea N.
//        - Se va calcula suma elementelor fiecarui array, iar suma respectiva se va adauga in array-ul de sume.
//        - Sa se foloseasca array-ul de sume pentru a determina daca toate sumele sunt egale sau nu.

package suma_a_N_arrayuri_cu_M_elem;

import java.util.Scanner;

public class Suma {

    private Scanner s;
    private int S = 0;
    private int suma[];
    private int a[];
    private int b[];
    private int i;


    public Suma() {
        s = new Scanner(System.in);

    }

    public void readInput() {

        System.out.print("Dati nr de array-uri=");
        int n = s.nextInt();

        a = new int[n];
        suma = new int[n];


        for (i = 0; i < a.length; i++) {

            System.out.print("Dati nr de elem din array=");
            int m = s.nextInt();

            b = new int[m];

            for (int j = 0; j < b.length; j++) {
                System.out.print("b[" + i + "," + j + "]=");
                b[j] = s.nextInt();
            }
            calculareSuma();
        }

    }

    private void calculareSuma() {

        System.out.print("suma este ");


        S = 0;
        for (int j = 0; j < b.length; j++) {
            S = S + (b[j]);
        }


        System.out.println(S);

        suma[i] = S;

    }

    public boolean isSumeEgale() {

        System.out.print("array-ul de sume contine ");
        for (i = 0; i < suma.length; i++)
            System.out.print(suma[i] + " ");

        System.out.print(" ----> ");
        for (i = 0; i < suma.length / 2; i++) {

            if (suma[i] != suma[suma.length - i - 1])
                return false;

        }

        return true;
    }
}
