import java.util.*;
public class MatrixAdd
{
public static void main(String args[])
{
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows:");
row=sc.nextInt();
System.out.println("Enter the no of columns:");
col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int res[][]=new int[row][col];
System.out.println("Enter the elements of matrix 1:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat1[i][j]=sc.nextInt();
System.out.println();
}
}
System.out.println("Enter the elements of matrix 2:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat2[i][j]=sc.nextInt();
System.out.println();
}
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
res[i][j]=mat1[i][j]+mat2[i][j];
System.out.println("Sum of matrix is:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.println(res[i][j]+"\t");
System.out.println();
}
}
}


