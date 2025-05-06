package me.hubailmn.programming.two.Quiz;

//Name: محمد نضال مكي آل حبيل
public class Quiz1 {
    public static void main(String[] args) {

        char[][] charArray =
                {
                        {'a', 'b', 'c'},
                        {'d', 'e', 'f'},
                        {'g', 'h', 'i'},
                        {'j', 'k', 'l'},
                        {'m', 'n', 'o'},

                };

        System.out.println("The Elements of the Character array are: ");
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}