#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,x,y;
  cin>>a>>b>>x>>y;
  float m=a/6;
  int n=y/6;
  int p=y%6;
  float k=((float)n+(float)p/10);
  float d=x/k;
  float f=b/m;
  cout<<m<<"\n";
  cout<<fixed<<setprecision(1)<<k<<"\n";
  cout<<d<<"\n"<<f<<"\n";
  if(d>f)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}