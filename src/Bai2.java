public class Bai2 {

    /**
     *
     * @return String Builder after double character
     */
    public static StringBuilder printEachLetterTwice(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            stringBuilder.append(s.charAt(i)) ;
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        String input = "nguyen phuong nam";
        System.out.println(printEachLetterTwice(input));
    }
}
