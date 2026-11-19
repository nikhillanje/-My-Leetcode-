class Solution {
    public void moveZeroes(int[] arr) {

        int n = arr.length;

		int p = 0 ;
		int q = p + 1;

		while(q< n) {

			if(arr[p] == 0 && arr[q] !=0 ) {
				int temp = arr[p];
				arr[p] = arr[q];
				arr[q] = temp ;
				p++;
				q++;
			}
			else {
				if(arr[p] != 0) {
					p++;
					q = p+1;
				}
				else {
					q++;
				}
			}
		} 
    }
}