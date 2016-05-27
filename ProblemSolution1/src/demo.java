
/*
Problem Statement:
Write a program for Multiple operations of Matrix
1) Addition of 2 Matrix
2) Subtraction of 2 Matrix
3) Multiplication of 2 Matrix 
 */

import java.util.Scanner;
public class demo {
    public static void main(String args[])
    {
        boolean flag =true;
        Scanner sc =new Scanner(System.in);
        while(flag)
        {
            System.out.println("Matrix Operations........\n1) Addition of 2 Matrices:\n2) Subtraction of 2 Matrices:\n3) Multiplication of 2 Matrices:");
            System.out.printf("Enter Choise:");
            int choise=sc.nextInt();
            System.out.println("");
            
            
            switch(choise)
            {
                case 1: System.out.println(".....Matrix Addition.....");
                        addMatrix();
                        break;
            }
            
            flag=false;
        }
    }
    static void addMatrix()
    {
        Scanner sc =new Scanner(System.in);
        int i,j;
        
        
        System.out.printf("Enter No of rows: ");
        int m=sc.nextInt();
        System.out.printf("Enter No of columns: ");
        int n=sc.nextInt();
        
        int[][] a =new int[m][n];
        int[][] b =new int[m][n];
        int[][] s =new int[m][n];
        
        
        System.out.println("Enter Matrix1 elements:"+m+"X"+n+": ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix2 elements:"+m+"X"+n+": ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of two "+m+"X"+n+" Matric is : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                s[i][j]=a[i][j]+b[i][j];
                System.out.printf(s[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
