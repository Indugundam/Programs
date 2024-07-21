public class DecolumnizeTheString {
    public static void main(String[] args) {
        String[] input = {
                "I’m dishonest, and a to watch out for,",
                "dishonest man you    because you can",
                "can always trust to  never predict when",
                "be dishonest.        they’re going to do",
                "Honestly, it’s the   something incredibly",
                "honest ones you want stupid."
        };
        int index = findIndex(input);
        decolumnize(index, input);
    }

    public static int findIndex(String[] lines) {
        int index = 0;
        for (int i = 0; i < minimum(lines); i++) {
            boolean allSpaces = true;
            for (String line : lines) {
                if (line.charAt(i) != ' ') {
                    allSpaces = false;
                    break;
                }
            }
            if (allSpaces) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int minimum(String[] lines) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() < min) {
                min = lines[i].length();
            }
        }
        return min;
    }


    public static void decolumnize(int index, String[] lines) {

        for (String line : lines) {
            for (int i = 0; i < index; i++) {
                System.out.print(line.charAt(i));
            }
            System.out.println();

        }
        for (String line : lines) {
            for (int j = index; j < line.length(); j++) {
                System.out.print(line.charAt(j));
            }
            System.out.println();

        }
    }
}


