#include <iostream>
using namespace std;

int main() {
    int num = 0;
    cout << "Enter a number: ";
    cin >> num;

    while(num % 2 != 0) {
        cout << "The number is prime." << num << endl;
        break;
    }
    return 0;
}