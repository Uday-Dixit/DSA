class File {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
    public void swap(int[][] nums, int m, int n){
        int temp = nums[m][n];
        nums[m][n]=nums[n][m];
        nums[n][m]=temp;
    }
    public void reverse(int[][] nums,int row){
        int a=0;
        int b=nums[row].length-1;
        while(a<b){
            int temp = nums[row][a];
            nums[row][a]=nums[row][b];
            nums[row][b]=temp;
            a++;
            b--;
        }
    }
}