#include <iostream>
using namespace std;

int main() {
    for (int n = 5; n > 0; n--) {
        cout << n << "... ";
    }
    cout << "Go!" << endl;

    int count = 0;
    for (int i = 0; i <= 20; i++) {
        if (i)
            count++;
    }

    cout << "Number of not zero numbers from 0 to 20: " << count << endl;
    cout << "Count plus 2: " << count + 2 << endl;

    return 0;
}