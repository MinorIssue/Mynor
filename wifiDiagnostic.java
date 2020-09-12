import java.util.*;

public class wifiDiagnostic{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("--------------------------");

System.out.println("Wi-Fi Diagnostic");

System.out.println("--------------------------\n\n");

System.out.println("First step: reboot your computer");

System.out.println("Are you able to connect with the internet? (yes or no)");

String remove_Item = input.next();


if(remove_Item.equals("no")){

System.out.println("Second step: reboot your router");

System.out.println("Now are you able to connect with the internet? (yes or no)");

   remove_Item = input.next();

if(remove_Item.equals("no")){

System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");

System.out.println("Now are you able to connect with the internet? (yes or no)");

remove_Item = input.next();

if(remove_Item.equals("no")){

System.out.println("Fourth step: move your computer closer to your router.");

System.out.println("Now are you able to connect with the internet? (yes or no)");

remove_Item = input.next();

if(remove_Item.equals("no")){

System.out.println("Fifth step: contact your ISP, Make sure your ISP is hooked up to your router.");

}

}

}

}

}

}