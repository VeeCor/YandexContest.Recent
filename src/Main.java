import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberNum = scanner.nextInt();
        int CallNum = scanner.nextInt();
        scanner.nextLine();
        if(CallNum <= 1000 && CallNum > 0 && NumberNum <= 111 && NumberNum >= 1){
            ArrayList<String> NumberList = new ArrayList<>(NumberNum);
            do {
                String PhoneNumber = scanner.nextLine();
                if (PhoneNumber.charAt(0) == '+' && PhoneNumber.length() < 15 && NumberNum >0) {
                    if (NumberList.contains(PhoneNumber)) {
                        NumberList.remove(PhoneNumber);
                        NumberList.add(0, PhoneNumber);
                    } else {
                        NumberList.add(0, PhoneNumber);
                        NumberNum--;
                    }
                }
                CallNum--;
            } while (CallNum > 0);
            while (NumberNum > 0){
                NumberList.add("<Empty>");
                NumberNum--;
            }
            for (String s : NumberList) {
                System.out.println(s);
            }
        }
    }
}