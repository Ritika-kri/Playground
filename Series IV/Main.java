#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n,p=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    p=i*i;
    if(p%2==0)
      cout<<p-2<<" ";
    else
      cout<<p-1<<" ";
  }
}