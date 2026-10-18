#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a year: ";
    cin >> num;

    if(num % 400 == 0  || (num % 4 == 0 && num % 100 != 0)){
        cout << num << " : This is leap year.";
    }else{
        cout << num << " : This is not leap year.";
    }
    return 0;
}