#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n,p=6,r,m;
  cin>>n;
  m=p;
  for(int i=0;i<n;i++)
  {
    p=p+5*i;
    r=p;
    m=r;
    cout<<m<<" ";
  }
}