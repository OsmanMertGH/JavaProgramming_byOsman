package day10_NestedIfIntro;

public class TernarriesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        String result = (s >= 0 && s <= 100) ? (s >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println("result = " + result);

    }
}
