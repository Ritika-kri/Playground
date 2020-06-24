#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int i,n;
  cin>>n;
  double m=0.5,p,t;
  
  for(i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<m;
      continue;
    }
    else{
       t=pow(3,i-1);
       p=t+m;
      m=p;
    cout<<" "<<m;
    }
  }
}