import java.io.*;
import java.util.*;

public class Main{
    private static boolean reachesEnd(int index,int leap,int[] game){
        int left = index;
        int right = index;
        
        while(left != 0 && game[left-1]!=1)
            left--;
            
        while(right != game.length-1 && game[right+1]!=1)
            right++;
            
        for(int i = left; i<=right; i++){
            if(i+leap >= game.length)
                return true;
            else if(i+leap> right && game[i+leap] == 0)
                if(reachesEnd(i+leap, leap, game))
                    return true;
        }
        return false;
    }
    
    private static boolean canWin(int leap, int[] game){
        boolean possible = true;
        int start = 0;
        if(leap == 0) leap++;
        if(!reachesEnd(start,leap,game))
            possible = false;
        return possible;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int q = reader.nextInt();
        for(int i=0; i<q; i++){
            int n = reader.nextInt();
            int leap = reader.nextInt();
            
            int[] game = new int[n];
            for(int j = 0; j<n; j++)
                 game[j] = reader.nextInt();
            
            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
    }
}
