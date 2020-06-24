#include<iostream>
using namespace std;
int pwr(int,int);
int main()
{
  //Type your code here.
  int a,n,res;
  cin>>a>>n;
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n"<<"\n";
  res=pwr(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<res; 
}
int pwr(int a,int n)
{
  if(n!=0)
    return (a*pwr(a,n-1));
  else
    return 1;
}