public class UE07_2_Strings {
    public static void main(String[] args) {
        System.out.println(toSingleSpace("Ein Text      mit vielen   Leerzeichen"));
        System.out.println(leftJustified("abcde", 8));
        System.out.println(rightJustified("abcde", 8));
        System.out.println(midJustified("abcde", 4));
        System.out.println(firstUppercase("aBCdE"));
        System.out.println(containsOnlyChars("a-7", "asdf7hjkl-qewr"));
        System.out.println(containsNotChars("a-7", "sdf7hjklqewr"));
        System.out.println(clearLeadingZeros("00700"));
        System.out.println(clearChars("ich mag erdbeeren nicht", "mag erdbeere"));
        System.out.println(isStrongPassword("evi+franz!"));
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

    public static String firstUppercase(String word) {
        String firstLetter = "";
        String restOfWord = word.substring(1);
        firstLetter += word.charAt(0);
        firstLetter = firstLetter.toUpperCase();
        restOfWord = restOfWord.toLowerCase();
        return firstLetter + restOfWord;
    }

    public static boolean containsOnlyChars(String s, String chars) {
        String singleLetter;
        for (int i = 0; i < s.length(); i++) {
            singleLetter = String.valueOf(s.charAt(i));
            if (!chars.contains(singleLetter)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsNotChars(String s, String forbiddenChars) {
        String singleLetter;
        for (int i = 0; i < s.length(); i++) {
            singleLetter = String.valueOf(s.charAt(i));
            if (forbiddenChars.contains(singleLetter)) {
                return false;
            }
        }
        return true;
    }

    public static String clearLeadingZeros(String number) {
        int i = 0;
        String rString = "";
        if (containsOnlyChars("number", "0123456789")) {
            while (number.charAt(i) == '0') {
                i++;
            }
            rString += number.substring(i);
            return rString;
        } else {
            return number;
        }
    }

    public static String clearChars(String s, String allowedChars) {
        String rString = "";
        String singleLetter;
        for (int i = 0; i < s.length(); i++) {
            singleLetter = String.valueOf(s.charAt(i));
            if (allowedChars.contains(singleLetter)) {
                rString += singleLetter;
            }
        }
        return rString;
    }

    public static boolean isStrongPassword(String pwd) {
        if (pwd.length() < 8) {
            return false;
        }
        int isChar = 0;
        int notChar = 0;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isLetter(pwd.charAt(i))) {
                isChar++;
            } else {
                notChar++;
            }
            if (notChar * 2 <= isChar) {
                return false;
            }else{return true;}
        }return true;
    }

}