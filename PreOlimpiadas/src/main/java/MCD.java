/*MCD de dos números*/

class Main {
    int num1 = 450;
    int num2 = 360;
    int mcd =1; 
    int limite;

    public void Mcd(){
        if (num1 < num2) {
            limite = num1;
        } else {
            limite = num2;
        }
        
        for(int i =1; i<=limite; i++){
            if(num1 % i == 0 && num2 % i == 0){
                mcd = i;
            }
        }
        
        System.out.println(mcd);
        
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.Mcd();
    }
}
