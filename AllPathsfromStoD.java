class Solution {
    List<List<Integer>> L1 = new ArrayList<List<Integer>>();
   public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int val = 0;
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);
        helper(val, graph, graph.length - 1, l1);
        return L1;
    }
    public void helper(int val, int[][] graph, int target, List<Integer> l1){
        if(val == target){
            L1.add(new ArrayList<>(l1));
        }
        for(int i = 0; i < graph[val].length; i++){
            int node = graph[val][i];
            l1.add(node);
            helper(node, graph, target, l1);
            l1.remove(l1.size() - 1);
        }
    }
}