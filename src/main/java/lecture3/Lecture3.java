package lecture3;

public class Lecture3 {

    public String tempName;

    public static void main(String[] args) {

        String str = "hello";
        str = "world";
        String str2 = "WORLD";
        String str3 = "th,td,tr";
        String str4 = "    aaa     ";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str + "enough");
        System.out.println(str + 5);
        System.out.println(str + null);
        System.out.println(str.contains("wor"));
        System.out.println(str.equals("hello"));
        System.out.println(str == "hello");
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.matches("\\d\\d\\d-\\d\\d-\\d\\d"));
        System.out.println(str.concat("abba"));
        System.out.println(str.endsWith("rld"));
        System.out.println(str3.split(",").length);
        System.out.println(str.isEmpty());
        System.out.println(str.indexOf("l"));
        System.out.println(str.replaceAll("o", "a"));
        System.out.println(str.substring(2, 4));
        System.out.println(str4.trim());

        String[] abc = {"a", "b", "c"};
        abc[1] = "d";
        abc[3] = "d";
        System.out.println(abc.length);

        English english = new English();
        Deutsch deutsch = new Deutsch();

        Lecture3 objectToTest = new Lecture3();
        objectToTest.tempName = "Hello";
        objectToTest.blahBlah(english);
        objectToTest.tempName = "Guten Tag";
        objectToTest.blahBlah(deutsch);
        System.out.println(objectToTest.tempName);

        //          Hello
        //    English    Deutsch
        // Eng1   Eng2
    }

    public void blahBlah(Hello objectToSay) {
        objectToSay.say();
    }
}
