class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if(cells.length == 0)
            return cells;
       boolean repeat = false;
        int repeated = 0;
        Set<String> cellsString = new HashSet<>();
       for(int i = 0 ; i < N; i++)
       {
           int[] newCells = nextDay(cells);
           if(!cellsString.contains(Arrays.toString(newCells)))
           {
               cellsString.add(Arrays.toString(newCells));
               repeated++;
           }
           else
           {
               repeat = true;
               break;
           }
           cells = newCells;
       }
        if(repeat)
        {
             N = N % repeated;
            for(int i = 0; i < N; i++)
            {
                cells = nextDay(cells);
            }
        }
        return cells;
        
    }
    public int[] nextDay(int[] cells)
    {
        int temp[] = new int[cells.length];
        for(int i = 1; i < cells.length-1; i++)
        {
            temp[i] = cells[i-1] == cells[i+1] ? 1 : 0; 
        }
        return temp;  
    }
}