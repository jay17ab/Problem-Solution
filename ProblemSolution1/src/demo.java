
/*
Problem Statement:
Write a program for Multiple operations of Matrix
1) Addition of 2 Matrix
2) Subtraction of 2 Matrix
3) Multiplication of 2 Matrix 
 */

import static java.lang.System.exit;
import java.util.Scanner;
public class demo {
    public static void main(String args[])
    {
        boolean flag =true;
        Scanner sc =new Scanner(System.in);
        while(flag)
        {
            System.out.println("\nMatrix Operations.................\n1) Addition of 2 Matrices:\n2) Subtraction of 2 Matrices:\n3) Multiplication of 2 Matrices:");
            System.out.printf("Otherwise) Exit:\nEnter Choise:");
            int choise=sc.nextInt();
            System.out.println();
            
            
            switch(choise)
            {
                case 1: System.out.println(".....Matrix Addition.....");
                        addMatrix();
                        break;
                
                case 2: System.out.println(".....Matrix Subtraction.....");
                        subMatrix();
                        break;
                    
                case 3: System.out.println(".....Matrix Multiplication.....");
                        mulMatrix();
                        break;
                    
                default: flag=false;
            }
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
    
    static void subMatrix()
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
        System.out.println("Subtraction of two "+m+"X"+n+" Matric is : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                s[i][j]=a[i][j]-b[i][j];
                System.out.printf(s[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void mulMatrix()
    {
        Scanner sc =new Scanner(System.in);
        int i,j,k,l;
        
        System.out.println("Enter Attributes for Matrix 1:");
        System.out.printf("Enter No of rows: ");
        int m=sc.nextInt();
        System.out.printf("Enter No of columns: ");
        int n=sc.nextInt();
        
        System.out.println("Enter Attributes for Matrix 2:");
        System.out.printf("Enter No of rows: ");
        int m1=sc.nextInt();
        System.out.printf("Enter No of columns: ");
        int n1=sc.nextInt();
        
        if(n!=m1)
        {
            System.out.println("For Multiplication : No of columns of Matrix 1 should be equal to no of rows of Matrix 2....");
            exit(0);
        }
        int[][] a =new int[m][n];
        int[][] b =new int[m1][n1];
        int[][] s =new int[m][n1];
        
        System.out.println("Enter Matrix1 elements:"+m+"X"+n+": ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix2 elements:"+m1+"X"+n1+": ");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of "+m+"X"+n+" and "+m1+"X"+n1+" Matric gives: "+m+"X"+n1+" Matrix: ");
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n1;j++)
            {
                int sum=0;
                for(k=0;k<n;k++)
                {
                    sum=sum+(a[i][k]*b[k][j]);
                }
                s[i][j]=sum;
                System.out.printf(s[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
