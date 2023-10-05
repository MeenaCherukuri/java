//JaggedArrayDemo.java
import java.io.*;
public class JaggedArrayDemo {
    public static void main(String args[]) {
        int jarr[][] = new int[3][];
        jarr[0] = new int[3];
        jarr[1] = new int[4];
        jarr[2] = new int[2];
        int count = 0;
        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                jarr[i][j] = count++;
            }
        }
        System.out.println("The elements in jaggedArray are :");
        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                System.out.println(jarr[i][j]);
            }
        }
    }
}
