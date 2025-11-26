class Main {
    public static String reverso(String text){
        String reverso = "";
        for(int i = text.length()-1; i > 0; i--){
            reverso += text.charAt(i);
        }
        return reverso;
    }
    public static void main(String[] args) {
        System.out.println(reverso("hola"));
    }
}
