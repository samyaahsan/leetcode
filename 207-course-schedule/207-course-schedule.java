class Solution {
    Map<Integer, List<Integer>> preMap = new HashMap<>();
    Set<Integer> visitSet = new HashSet<>();
    
    Map<Integer, List<Integer>> map = new HashMap<>();
    
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }
        
        for (int[] p : prerequisites) {
            List <Integer> neighbors = preMap.get(p[0]);
            System.out.println(preMap.get(p[0]));
            System.out.println(preMap.get(p[1]));
            neighbors.add(p[1]);
            preMap.put(p[0], neighbors);
        }
        
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, preMap, visitSet)) return false;
        }
        
        return true;
    }
    
    public boolean dfs(int course, Map<Integer, List<Integer>> preMap, Set<Integer> visitSet) {
        if (visitSet.contains(course)) return false;
        if (preMap.get(course).size() == 0) return true;
        
        visitSet.add(course);
        for (int pre : preMap.get(course)) {
            if (!dfs(pre, preMap, visitSet)) return false;
        }
        visitSet.remove(course);
        preMap.put(course, new ArrayList<>());
        return true;
    }
}