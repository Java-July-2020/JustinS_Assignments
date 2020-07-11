public class StringManipulator{
    public String trimAndConcat(String firstString, String secondString) {
        firstString = firstString.trim();
        secondString = secondString.trim();
            return firstString.concat(secondString);
        }

        public Integer getIndexOrNull(String string1, char letter1){
            int query = string1.indexOf(letter1);
            if (query >= 0){
                return query;
            }
            else {
                return null;
            }

        }
        public String concatSubstring(String str1, int c, int d, String str2){
            str1 = str1.substring(c, d);
            return str1.concat(str2);
    }
}