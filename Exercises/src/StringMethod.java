public class StringMethod {
    public static void main(String[] args) {

        String name = "password";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("h");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("Kavindu", "SUBHASH");

//          if(name.isEmpty()) {
//              System.out.println('Your name is empty');
//          }
//          else{
//                System.out.println("Your name is: " + name);
//          }

//        if(name.contains(" ")){
//            System.out.println("Your name has a space");
//        }
//        else{
//            System.out.println("Your name does not have a space");
//        }

        if(name.equals("password")){
            System.out.println("You cannot use this password");
        }
        else{
            System.out.println("Your password is accepted");
        }

        System.out.println(name.isEmpty());
    }
}
