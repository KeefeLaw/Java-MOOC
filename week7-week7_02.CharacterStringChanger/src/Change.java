public class Change {
    private char fromChar;
    private char toChar;

    public Change(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
    }

    public String change(String charString) {
//        String result = "";
//        for (char c : charString.toCharArray()) {
//            if (c == fromChar) {
//                result += toChar;
//            } else {
//                result += c;
//            }
//        }
//        return result;
        return charString.replace(fromChar, toChar);
    }
}
