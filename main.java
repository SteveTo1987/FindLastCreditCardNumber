import java.util.Scanner;

public class main {
	 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        try{
            int inputCount = Integer.parseInt(line);
            if(inputCount > 0 && inputCount <= 100){
                for(int a = 0; a < inputCount; a++){
                    String cardNumber = sc.nextLine();
                    getFinalCardNumber(cardNumber);
                }
            }
        }
        catch(Exception e){
            System.out.println("input error");
        }
    }
	
	private static void getFinalCardNumber(String cardNumber) {
		if(cardNumber.length() == 16){
            int total = 0;
            for(int index = 0; index < cardNumber.length() - 1; index++){
                if(index%2 == 0){
                    int tmpNum = Character.getNumericValue(cardNumber.charAt(index)) * 2;
                    if(tmpNum >= 10){
                        total = total + tmpNum/10;
                        total = total + tmpNum%10;
                    }
                    else{
                        total = total + tmpNum;
                    }
                }
                else{
                    total = total + Character.getNumericValue(cardNumber.charAt(index));
                }
            }
            if(total%10 == 0){
                System.out.println(0);
            }
            else{
                System.out.println(10 - (total%10));
            }
        }
	}
}
