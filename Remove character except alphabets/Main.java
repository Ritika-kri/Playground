#include <iostream>
#include<cstring>
#include<stdio.h>
#include<string>
using namespace std;
int main() {
   char str[100];
   int i, j; 
   gets(str);
   for(i = 0; str[i] != '\0'; ++i) {
      while(!( (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z') || str[i] == '\0')) {
         for(j = i; str[j] != '\0'; ++j) {
            str[j] = str[j+1];
         }
      }
   }
   cout<<str;
   return 0;
}