class Main {
    public static void main(String[] args) {
        String cadena = "Hola ente";
        String reverso = "";
        
        for(int i = cadena.length()-1; i>= 0; i--){
            reverso += cadena.charAt(i);
        }
        System.out.println(reverso);
    }
}
