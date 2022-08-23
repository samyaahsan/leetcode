class Solution {
    
    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> answer, List<Integer> combo){
        
        if(index == candidates.length){
            if(target == 0){
                answer.add(new ArrayList<>(combo));
            }
            return;
        }
        
        if(candidates[index] <= target){
            combo.add(candidates[index]);
            findCombinations(index, candidates, target-candidates[index], answer, combo);
            combo.remove(combo.size()-1);
        }
        
        findCombinations(index+1, candidates, target, answer, combo);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combo = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        findCombinations(0, candidates, target, answer, combo);
        return answer;
    }
}