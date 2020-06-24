#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,s=0;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++){
      cin>>a[i][j];}
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      s=s+a[i][j];
    cout<<s;
    s=0;
    cout<<endl;
  }
    
}