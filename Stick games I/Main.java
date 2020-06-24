#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,res;
  cin>>n>>m;
  if(n<m)
    res=n;
  else
    res=m;
  if(res%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}