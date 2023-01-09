public class UE07_2_Strings {
    public static void main(String[] args) {
        System.out.println(toSingleSpace("Ein Text      mit vielen   Leerzeichen"));
        System.out.println(leftJustified("abcde", 8));
        System.out.println(rightJustified("abcde", 8));
        System.out.println(midJustified("abcde", 4));
    }

    public static String toSingleSpace(String s) {
        char lastChar = 'L';
        String rString = "";
        for (int i = 0; i < s.length(); i++) {
            if (lastChar != ' ' || s.charAt(i) != ' ') {
                rString += s.charAt(i);
                lastChar = s.charAt(i);
            }
        }
        return rString;
    }

    public static String leftJustified(String s, int length) {
        String rString = s;
        while (rString.length() < length) {
            rString += " ";
        }
        return rString;
    }

    public static String rightJustified(String s, int length) {
        String rString = "";
        while (rString.length() < length - s.length()) {
            rString += " ";
        }
        rString += s;
        return rString;
    }

    public static String midJustified(String s, int length) {
        String rString = "";
        if (s.length() < length) {
            for (int i = 0; i < length - s.length(); i++) {
                if (i % 2 == 0) {
                    rString += " ";
                }
            }
            rString += s;
            for (int i = 0; i < length - s.length(); i++) {
                if (i % 2 == 1) {
                    rString += " ";
                }
            }
            return rString;
        } else {
            return s;
        }
    }
    public static String firstUppercase(String word){
        String rString = "";
        return rString;
}}