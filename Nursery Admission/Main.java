#include<iostream>
#include<cstring>
#include<stdlib.h>
using namespace std;
int main()
{
  //Type your code here.
  char s[50];
  gets(s);
  int len=strlen(s);
  cout<<"The number of letters in the name is "<<len; 
}