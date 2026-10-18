#include <iostream>
using namespace std;

int main(){
    int num1, num2, num3;

    cout << "Enter three numbers: ";
    cin >> num1 >> num2 >> num3;

    if(num1 > num2 && num1 > num3){
        cout << num1 << " : This is greatest.";
    }
    else if(num2 > num1 && num2 > num3){
        cout << num2 << " : This is greatest.";
    }else{
        cout << num3 << " : This is greatest.";
    }
}