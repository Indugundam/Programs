public class DetectRepetitions {
    public static void main(String[] args) {
        String repeatingString = repeatingStrings("🌼🌼🌼"); //return "🌼".
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("🌼🌻" + "🌼🌻" + "🌼🌻"); //return "🌼🌻".
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("Ciao" + "Ciao"); //return "Ciao".
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("Captain CiaoCiaoCaptain CiaoCiao"); //return "CaptainCiaoCiao".
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("🌕🌔🌓🌑"); //return null.
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("CaptainCiaoCiaoCaptain"); //return null.
        System.out.println(repeatingString);
        repeatingString = repeatingStrings("🌼"); //return null.
        System.out.println(repeatingString);
        repeatingString = repeatingStrings(""); //return null.
        System.out.println(repeatingString);
        repeatingString = repeatingStrings(null); //return null.
        System.out.println(repeatingString);
    }

    public static String repeatingStrings(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }

        for (int len = 1; len <= string.length() / 2; len++) {
            String subString = string.substring(0, len);
            int index = 0;
            int count = 0;
            while (index != -1) {
                index = string.indexOf(subString, index);
                if (index != -1) {
                    count++;
                    index += subString.length();
                }
            }
            if (subString.length() * count == string.length()) {
                return subString;
            }
        }

        return null;
    }
}
