#include <iostream>
using namespace std;
int main()
{
    int r, c, a[100][100], b[100][100],i, j;
     cin >> r;
    cin >> c;
  // Storing elements of first matrix entered by user.
    for(i = 0; i < r; ++i){
       for(j = 0; j < c; ++j)
       {
           cin >> a[i][j];
       }
    }
    // Storing elements of second matrix entered by user
    // Adding Two matrices
    for(i = 0; i < r; ++i){
        for(j = 0; j < c; ++j)
            b[j][i] = a[i][j];
    }
    for(i = 0; i < c; ++i){
        for(j = 0; j < r; ++j)
        {
            cout << b[i][j] << " ";
        }cout<<"\n";}
   return 0;
}