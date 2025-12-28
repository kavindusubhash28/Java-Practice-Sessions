public class twoDArrays {
    public static void main(String[] args) {

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//
//        String[][] groceries = {{"apple", "orange", "banana"},vegetables,meats};
//
//        groceries[0][0] = "pineapple";
//
//        for(String[] foods : groceries){
//            for(String food : foods){
//                System.out.println(food + "");
//            }

        char[][] telephone = {{'1','2','3'},
                                {'4','5','6'},
                                {'7','8','9'},
                                {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
        }
        }
    }

