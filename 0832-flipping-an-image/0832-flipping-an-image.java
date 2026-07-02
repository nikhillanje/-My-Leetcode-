class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {


        int helper[][] = new int [arr.length][arr[0].length];
		int p = 0;
		int q = 0;


		for(int i = 0 ; i < arr.length ; i++) {

			q=0;

			for(int j = arr[0].length-1 ; j >=0 ; j--) {

				helper[p][q] = arr[i][j];
				q++;

			}

			p++;
		}

		
		
		for(int i = 0 ; i < helper.length ; i++) {
			for(int j = 0 ; j < helper[0].length ; j++) {
				
				if(helper[i][j] == 0){
				    helper[i][j] = 1;
				}
				else{
				    helper[i][j] = 0;
				}
			}
			
		}


        return helper;
        
    }
}