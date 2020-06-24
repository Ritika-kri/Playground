#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int tar,count=0,num=0,num2;
  cin>>tar;
while(num<tar)
  {
    cin>>num2;
    num=num+num2;
    count++;
  }
  cout<<"The number of turns is "<<count;
}