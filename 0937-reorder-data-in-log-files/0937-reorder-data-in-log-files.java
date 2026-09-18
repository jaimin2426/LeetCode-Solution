class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(a,b)->{
            String[] x = a.split(" ",2);
            String[] y = b.split(" ",2);

            boolean xdig = Character.isDigit(x[1].charAt(0));
            boolean ydig = Character.isDigit(y[1].charAt(0));

            if(xdig && ydig) return 0;
            if(xdig) return 1;
            if(ydig) return -1;

            int cam = x[1].compareTo(y[1]);

            if(cam == 0){
                return x[0].compareTo(y[0]);
            }

            return cam;
        });

        return logs;    }
}