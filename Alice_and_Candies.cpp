#include<bits/stdc++.h>
#include<cmath>
using namespace std;
int main(){
	long long int N;
	int num, temp = 1, ans=0;
	cin >> N;
	num = sqrt(N);
	while(num--){
    	if((N + temp * temp) % (2 * temp) == 0)
    	ans++;
    	temp++;
	}
	cout << ans;
    return 0;
}