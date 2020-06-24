#include<stdio.h>
#include<iostream>
#include<string.h>
#include<cstring>
using namespace std;
int main()
{
      int i,j = 0,k = 0,n = 0;
    int flag = 0;
 
    char str[100],s[100];
  char word[10]=" the";
    gets(str);
    for(i = 0 ; str[i] != '\0' ; i++)
    {
        k = i;
     
        while(str[i] == word[j])
        {
            i++,j++;
            if(j == strlen(word))
            {
                flag = 1;
                break;
            }
        }
    j = 0;

    if(flag == 0)
        i = k;      
    else
        flag = 0;

    s[n++] = str[i];
    }
    s[n] = '\0'; 
   cout<<s;
}