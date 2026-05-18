import java.util.HashMap;

class ABC {

    static int romanceToDecimal(String s) {

        HashMap<Character, Integer> romanceNum = new HashMap<>();

        romanceNum.put('I', 1);
        romanceNum.put('V', 5);
        romanceNum.put('X', 10);
        romanceNum.put('L', 50);
        romanceNum.put('C', 100);
        romanceNum.put('D', 500);
        romanceNum.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && romanceNum.get( s.charAt(i)) < romanceNum.get(s.charAt(i + 1)) ) {
                res += romanceNum.get(s.charAt(i + 1)) - romanceNum.get(s.charAt(i));
                i++;
            }
            else {
                res += romanceNum.get(s.charAt(i));
            }
        }

        return res;

    }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanceToDecimal(s));
    }
}