package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 11;
        if (metodoMio(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoMio(int varRef) {
        int var = 2;
        boolean aux = true;
        while ((aux) && (var != varRef)) {
            if (varRef % var == 0) {
                aux = false;
            }
            var++;
        }
        return aux;
    }

}

/* Esto es una locura
 *
 */
