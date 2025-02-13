class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> arr = new ArrayList<>();
        
        // Convert input to array of pairs {value, list_index}
        for(int i = 0; i < nums.size(); i++) {
            for(int num : nums.get(i)) {
                arr.add(new int[]{num, i});
            }
        }
        
        Collections.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        int n = arr.size();
        int[] freq = new int[nums.size()];
        int countZero = nums.size();
        int L = arr.get(0)[0], R = arr.get(n-1)[0];
        int st = 0, en = -1;
        
        while(st < n) {
            while(en < n-1 && countZero != 0) {
                en++;
                freq[arr.get(en)[1]]++;
                if(freq[arr.get(en)[1]] == 1) countZero--;
            }
            
            if(countZero == 0) {
                int pl = arr.get(st)[0], pr = arr.get(en)[0];
                if(pr - pl < R - L) {
                    L = pl;
                    R = pr;
                }
            }
            
            freq[arr.get(st)[1]]--;
            if(freq[arr.get(st)[1]] == 0) countZero++;
            st++;
        }
        
        return new int[]{L, R};
    }
}
