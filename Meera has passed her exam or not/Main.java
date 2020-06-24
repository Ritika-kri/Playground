#include<iostream>
using namespace std;
int main()
{
  int n,i,num;
  cin>>n;
  int a[n];
	for(i=0;i<n;i++)
    {
      cin>>a[i];
    }
  cin>>num;
  for(i=0;i<n;i++)
  {
    if(a[i]==num){
      cout<<"She passed her exam";
      break;
    }
    if(i==n-1){
      cout<<"She failed";
  }}
}