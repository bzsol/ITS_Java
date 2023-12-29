package Basics;
public class loops {
    // while loop
    public static void main(String[] args) {
    int i = 0;
    while(i < 10){
        System.out.println("ITS Java Course");
        i++;
    }
    // for loop in Java
    for(int j=0;j<10;j++){
        System.out.println("Hello ITS Java Course");
    }

    // Foreach is a really good way to loop throuugh an array or some kind of dataset like a String
    String s = "instantcoffee";
    for (char c : s.toCharArray()) {
        System.err.print(c + " ");
    }
    }
}
