#include <bits/stdc++.h> 
using namespace std;  
int isMagicSquare(int matrix[][5], int n, int m); 
  
int main(){ 
    int n, m;
    cin >> n;
  m=n;
    //cin >> m;
  int matrix[n][5];
    //cout << "\nInput the element of matrix: ";
    for(int i = 0; i < n; i++)
        for(int j = 0; j < m; j++)
            cin>>matrix[i][j];
    if (isMagicSquare(matrix, n, m))
        cout << "Yes"; 
    else
        cout << "No"; 
      
    return 0; 
}
int isMagicSquare(int matrix[][5], int n, int m){  
    int sum1 = 0, sum2=0;
    //finding the sum of first diagonal
    for (int i = 0; i < n; i++) 
        sum1 = sum1 + matrix[i][i];
    //finding the sum of seciond diagonal
    for (int i = 0; i < n; i++) 
        sum2 = sum2 + matrix[i][n - 1 - i]; 
    //cout<<sum1<<sum2;
    //Checking, whether the sum of two diagonal is same or not
    if(sum1 != sum2)  
        return 0; 
     return true; 
}
    //finding the sum of each row 
   /* for (int i = 0; i < n; i++){ 
          
        int rowSum = 0;
        for (int j = 0; j < m; j++) 
            rowSum = rowSum + matrix[i][j]; 
          
        //checking, whether eachh row sum is equal to diagonal sum or not
        if (rowSum != sum1) 
            return 0; 
    } 
    //finding the sum of each column
    for (int i = 0; i < n; i++){ 
          
        int columnSum = 0;  
        for (int j = 0; j < n; j++) 
            columnSum += matrix[j][i]; 
  
        //checking, whether each column sum is equal to diagonal sum or not 
        if (columnSum != sum1)  
            return 1; 
    } */
 