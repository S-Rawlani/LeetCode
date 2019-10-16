class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<Integer>[] neighbors = new ArrayList[numCourses];
        int[] inDegree = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++)
        {
            neighbors[i] = new ArrayList<>();
        }
        for(int[] pairs: prerequisites)
        {
            neighbors[pairs[1]].add(pairs[0]);
            inDegree[pairs[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++)
        {
            if(inDegree[i] == 0)
                queue.add(i);
        }
        if(queue.isEmpty())
            return false;
        int count = 0;
        while(!queue.isEmpty())
        {
            int current = queue.poll();
            count++;
            for(int neigh : neighbors[current])
            {
                if(--inDegree[neigh] == 0)
                    queue.add(neigh);
            }   
        }
        if(count == numCourses)
            return true;
        return false;  
    }
}