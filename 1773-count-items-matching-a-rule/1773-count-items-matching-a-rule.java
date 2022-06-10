class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt=0;
        int i=0;
        int n= items.size();
        if (ruleKey.equals("type")) {
            i = 0;
            for (int j = 0; j < n; j++) {
                if (items.get(j).get(i).equals(ruleValue))
                    cnt++;
            }
        }
        if (ruleKey.equals("color")) {
            i = 1;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(i).equals(ruleValue))
                    cnt++;
            }
        }
        if (ruleKey.equals("name")) {
            i = 2;
            for (int j = 0; j < items.size(); j++) {
                if (items.get(j).get(i).equals(ruleValue))
                    cnt++;
            }
        }
        return cnt;
    }
}