package ru.java.courses.football;

public class Lesson4 {
// вывести самое короткое и самое длдинное название
    public static void main(String[] args){
        String [] abraKadabra = {"kdjfksdj skdjfkj", "ksjdki dd", "kdfjkdjfkjjdk kjdkjfkdj dfd", "slkfowwww"};
        String min = abraKadabra[0];
        String max = abraKadabra[0];

        for (String abraKadabr : abraKadabra) {

            if (abraKadabr.length() > max.length()) {
                max = abraKadabr;
            }
            if (abraKadabr.length() < min.length()){
                min = abraKadabr;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

}
