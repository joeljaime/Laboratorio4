
package DiagonalPrincipal;

/**
 *
 * @author jaime
 */
public class DiagonalPrincipal {
    
    public static void main(String[] args) {
        int valores [][] = new int [][]{{2, 4, 6},{3, 5, 7}, {4, 6, 8}};
        int diag1 =0;
        int diag2 =0;
        for (int i =0; i< valores.length; i++)  {
            for( int j =0; j< valores.length; j++) {
                if((i -j) == 0) {
                    diag1 += valores[i][j];
                    
                }
            if((i+j)== (valores.length-1)) {
                diag2 += valores[i][j];
            }
        }
        
    }
    
    Diagonal diag = new Diagonal(diag1, diag2);
    System.out.println("La Diferencia de la suma de una matriz 3x3: ");
    System.out.println("");
    System.out.println("Resultado :"  + diag.resultado());
    
    
    }
}
