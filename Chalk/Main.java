#include <iostream>

using namespace std;

int main()

{

int number=0, days, cycle=50;

float sqroot=1;

cin>>number;

while(cycle>0)

{

sqroot = (sqroot+(number/sqroot))/2;

--cycle;

}

days=number+(int(sqroot)+1);

cout<<int(days);

return 0;

}
