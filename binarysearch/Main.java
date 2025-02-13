class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
            
        int maxans = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int l = 0;
        
        for(int r = 0; r < s.length(); r++) {
            if(set.contains(s.charAt(r))) {
                while(l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(str));
        sc.close();
    }
}
