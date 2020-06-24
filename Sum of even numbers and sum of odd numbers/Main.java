#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,count=0,m=0,i;
  cin>>n;
  int a[n];
for(i=0;i<n;i++){
   cin>>a[i];}
  for(i=0;i<n;i++){
   if(a[i]%2!=0)
 {
   count=count+a[i];
 }
   else if(a[i]%2==0)
     m=m+a[i];
 }
 cout<<"The sum of the even numbers in the array is "<<m<<"\n";
 cout<<"The sum of the odd numbers in the array is "<<count;
 return 0;}