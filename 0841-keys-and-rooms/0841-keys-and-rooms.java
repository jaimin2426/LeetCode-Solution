class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Integer> v = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        v.add(0);
        s.add(0);

        while (!s.isEmpty()) {

            int room = s.remove(s.size() - 1);
            for (int key : rooms.get(room)) {
                if (!v.contains(key)) {
                    v.add(key);
                    s.add(key);
                }
            }
        }
        return v.size() == rooms.size();
    }
}