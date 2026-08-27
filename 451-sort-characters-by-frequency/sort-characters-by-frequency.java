class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Frequency> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(b.val, a.val));

        for (char ch : hm.keySet()) {
            Frequency temp = new Frequency(ch, hm.get(ch));
            pq.add(temp);
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            Frequency top = pq.poll();

            for (int i = 0; i < top.val; i++) {
                ans.append(top.key);
            }
        }

        return ans.toString();
    }
}

class Frequency {
    char key;
    int val;

    Frequency(char key, int value) {
        this.key = key;
        this.val = value;
    }
}