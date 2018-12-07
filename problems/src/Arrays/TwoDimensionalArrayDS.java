package Arrays;

/*

https://www.hackerrank.com/challenges/2d-array/problem

 */
public class TwoDimensionalArrayDS {

    public static void main(String[] args) {

        int arr[][] = new int[][]{{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                int result = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                result = result + arr[i+1][j+1];
                result = result + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                sum = Math.max(sum,result);
            }
        }
        return  sum;
    }
}