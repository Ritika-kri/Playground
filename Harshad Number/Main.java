#include <iostream>  
using namespace std;  
int main()  
{  
int n,sum,m,num;  
cin>>n;
num=n;
while(n>0)    
{    
m=n%10;    
sum=sum+m;    
n=n/10;    
}  
  //cout<<sum;
if(num%sum==0)
  cout<<"Harshad Number";
if(num%sum!=0)
  cout<<"Not Harshad Number";
}  
