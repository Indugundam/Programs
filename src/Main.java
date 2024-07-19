class Main {
    public static void main(String[] args) {
        String string = "abcd";
        boolean isMiddle = isCiaoCiaoInMiddle(string);
        if (isMiddle) {
            System.out.println("CiaoCiao is in the middle");
        } else {
            System.out.println("CiaoCiao is not in the middle");
        }
    }

    public static boolean isCiaoCiaoInMiddle(String string) {
        String[] words = string.split("CiaoCiao");
        int length = words.length;
        System.out.println(words.length);
        switch (length) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return words[0].length() == words[1].length();
            default:
                return false;

        }
    }
}

