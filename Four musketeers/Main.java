#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  float x1,y1,x2,y2,x3,y3;
  float x,y;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  x=(x1+x2+x3)/3;
  y=(y1+y2+y3)/3;
  cout<<x<<"\n";
  cout<<y;
}