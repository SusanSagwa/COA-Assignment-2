#include <string.h>
#include<stdlib.h>
#include<iostream>
#include<math.h>
using namespace std;
int convert(double n);

int main(){
    int num;
    cout<<"How many numbers do you want to convert";
    cin>>num;
    for(double x=0.0;x<num;x++){
double n;

cout<<convert(n)<<endl;



}

}
int convert(double n){

    double bin,f1=0.0,f2,f3=0.1;
    int x,x1=0;
    int fact=1,rem,temp,i;
    cout<<"Enter fractional decimal number:";
    cin>>n;
    x=n;
    f2=n-x;
    while(x!=0)
    {
        rem=x%2;
        x1=x1+rem*fact;
        x=x/2;
        fact=fact*10;
    }
    for(i=1;i<=3;i++){
        f2=f2*2;
        temp=f2;
        f1=f1+f3*temp;
        if(temp==1)
        f2=f2-temp;
        f3=f3/10;
    }

    bin=x1+f1;

 cout<<"decimal"<<"\t"<<"binary"<<"\t"<<"comment"<<endl;
    cout<<n<<"\t"<<bin<<"\t"<<"approximately"<<endl;


}


