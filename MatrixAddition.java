import java.io.*;
class MatrixAddition {
    public static void main(String args[]) {
        int arr[][],b[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        int r=sc.nextInt();
        System.out.println("Enter the no.of columns :");
        int c=sc.nextInt();
        b[][]=new int[r][c];
        a[][]=new int[r][c];
        c[][]=new int[r][c];
        System.out.println("Total no.of elements in the matrix :");
        System.out.println("Enter"+(r*c)+"elements into matrix A:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter"+(r*c)+"Elements in the matrix B : ");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The result matrix is ");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(c[i][j]+" ");
            }
            Sytem.out.println();
        }
    }
}
