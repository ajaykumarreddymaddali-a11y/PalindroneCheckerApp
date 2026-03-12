public class PalindroneCheckerApp {
    static void main(){
        static void main() {
            String str = "madam";
            boolean isPalindrone = true;
            for (int i=0; i<str.length()/ 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() -1 - i)) {
                    int start = 0;
                    for (int i = str.length() - 1; i > 0; i--) {
                        if (str.charAt(i) != str.charAt(start)) {
                            isPalindrone = false;
                            break;
                        }
                    }
                    if (isPalindrone){
                        System.out.println(str +"is palindrine");
                    } else {
                        System.out.println(str +"is not a palindrone");
                        start++;
                    }
                }
            }
