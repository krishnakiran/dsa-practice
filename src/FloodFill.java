import java.util.Arrays;
import java.util.Collections;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][]{{0,0,0},{0,0,0}};
        int sr = 1;
        int sc=0;
        int newColor =2 ;
        floodFill(image,1,0,2);
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void floodFill(int[][] image,int sr,int sc,int newColor){
        int startColor = image[sr][sc];
        if(startColor == newColor)
            return;
        dfsFill(image,sr,sc,startColor,newColor);
    }

    private static void dfsFill(int[][] image, int sr, int sc, int startColor, int newColor){

        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] != startColor)
            return;
        image[sr][sc] = newColor;
        dfsFill(image,sr-1,sc,startColor,newColor);
        dfsFill(image,sr,sc-1,startColor,newColor);
        dfsFill(image,sr+1,sc,startColor,newColor);
        dfsFill(image,sr,sc+1,startColor,newColor);

    }
}
