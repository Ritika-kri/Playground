#include <iostream>
#include<cstring>
using namespace std;
int main()
{
    char line[200];
    int vowels, consonants, digits, spaces,symbol;

    vowels =  consonants = digits = spaces=symbol = 0;
    cin.getline(line, 200);
    for(int i = 0;i<strlen(line); ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            vowels=vowels+1;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {
            ++consonants;
        }
        else if(line[i]>='0' && line[i]<='9')
        {
            ++digits;
        }       
        else if (line[i]==' ')
        {
            ++spaces;
        }
       else 
         ++symbol;
    }
    cout << "Vowels:" << vowels << endl;
    cout << "Consonants:" << consonants << endl;
    cout << "White Spaces:" << spaces << endl;
    cout << "Digits:" << digits << endl;
  	cout<<"Symbols:"<<symbol;
    return 0;
}