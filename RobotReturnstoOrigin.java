class Solution {
    public boolean judgeCircle(String moves) {
        
        int totalTurnsUD = 0;
        int totalTurnsLR = 0;
        int len = moves.length();
        for(int i = 0; i < len; i++)
        {
            if(moves.charAt(i) == 'U')
               totalTurnsUD += 1;
            else if(moves.charAt(i) == 'D')
                totalTurnsUD -= 1;
             else if(moves.charAt(i) == 'L')
                totalTurnsLR += 1;
             else if(moves.charAt(i) == 'R')
                totalTurnsLR -= 1;
        }
        if(totalTurnsUD == 0 && totalTurnsLR == 0)
            return true;
        return false;
        
    }
}