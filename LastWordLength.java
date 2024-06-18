public class LastWordLength {
    
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        
        return length;
    }
    public static void main(String[] args) {
        String test1 = "Hello World";
        
        System.out.println("Length of last word in \"" + test1 + "\": " + lengthOfLastWord(test1)); 
            }
}
