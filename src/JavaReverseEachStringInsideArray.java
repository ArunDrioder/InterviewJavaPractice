public class JavaReverseEachStringInsideArray {
    public static void main(String[] args) {
        String str = "Iam learning Selenium";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            result += new String(charArray) + " ";
        }

        System.out.println(result.trim());

    }
}
