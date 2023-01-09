public class UE07_2_Strings {
    public static void main(String[] args) {
        System.out.println(toSingleSpace("Ein Text mit vielen Leerzeichen"));
    }
    public static String toSingleSpace(String s){
        char lastChar = 'L';
        String rString = "";
        for (int i = 0; i < s.length(); i++) {
            if(lastChar == ' '&& s.charAt(i)==' '){

        }else {
                rString+=s.charAt(i);
                lastChar = s.charAt(i);
            }
    }return rString;
}}