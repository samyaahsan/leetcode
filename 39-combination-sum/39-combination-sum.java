class Solution {
    
    private static void findCombinations(int index, int[] arr, int target, List<List<Integer>> answer, List<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                answer.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index] <= target){
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], answer, ds);
            ds.remove(ds.size() - 1); //backtracking
        }
        findCombinations(index+1, arr, target, answer, ds);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        findCombinations(0, candidates, target, answer, new ArrayList<>());
        return answer;
    }
}