#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int m,n,req,res;
  cin>>m>>n>>req;
  res=pow(m,n);
  if(res>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}