package Unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MatrizIdentidade {
    public static void main(String[] args) throws IOException {
        int i,j;
        int I[][] = new int [3][3];

        FileWriter rq = new FileWriter("Matriz.txt");
        PrintWriter gravaarq = new PrintWriter(rq);

        for (i = 0; i<3; i++){
            for (j=0;j<3;j++){
                if (i == j){
                    I[i][j] = 1;
                }else {
                    I[i][j] = 0;
                }
            }
        }

        for (i = 0; i<3; i++){
            for (j=0;j<3;j++){
                gravaarq.print(I[i][j]);
            }
                gravaarq.println();
        }

        rq.close();
        gravaarq.close();
    }
}
