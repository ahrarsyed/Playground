#include<iostream>
#include<math.h>
using namespace std; 
int main()
{
  float wcf,t,v;
  cin>>t;
  cin>>v;
  wcf=35.74+(0.6215*t)+((0.4275*t)-35.75)*(pow(v,0.16));
  cout<<wcf;                                          
}
                                            