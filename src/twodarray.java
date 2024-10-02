public class twodarray {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        arr[0][0] = 40;
        arr[0][1] = 30;
        arr[0][2] = 70;
        arr[1][0] = 44;
        arr[1][1] = 55;
        arr[1][2] = 46;
        for(int i = 0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
