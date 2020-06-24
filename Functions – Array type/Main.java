#include<iostream>
using namespace std;
int main()
{
  int n,i,even=0,odd=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++){
    cin>>a[i];}
  for(i=0;i<n;i++){
    if(a[i]%2==0)
      even++;
    else
      odd++;}
  if(even!=0&&odd==0)
    cout<<"The array is Even";
  else if(odd!=0&&even==0)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}