class Solution {
    public String reorderSpaces(String text) {
        
        int totalSpaces = 0;
        int words = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                totalSpaces++;
            }
        }
        boolean insideWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !insideWord) {
                words++;
                insideWord = true;
            } 
            else if (text.charAt(i) == ' ') {
                insideWord = false;
            }
        }
        int spaces = words == 1 ? 0 : totalSpaces / (words - 1);

        int remaining = words == 1
                ? totalSpaces
                : totalSpaces % (words - 1);

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int wordCount = 0;

        while (i < text.length()) {

            while (i < text.length() && text.charAt(i) == ' ') {
                i++;
            }

            while (i < text.length() && text.charAt(i) != ' ') {
                sb.append(text.charAt(i));
                i++;
            }

            wordCount++;

            if (wordCount < words) {
                for (int j = 0; j < spaces; j++) {
                    sb.append(' ');
                }
            }
        }

        for (int j = 0; j < remaining; j++) {
            sb.append(' ');
        }

        return sb.toString();

    }
}