public class hw {
    public static void main(String[] args) {
        byte a = 110;
        short b = 12000;
        int c = 1230012300;
        long e = 1231231232234234234l;

        float n = 23.23f;
        double m = 43.432344543;

        short someShort = a;
        int someInt = someShort;
        long someLong = e;

        someShort = (short) someInt;
        someInt = (int) someLong;

        float someFloat = n;
        double someDouble = e;

        someFloat = (float) someDouble;

        System.out.println("someInt " + someInt);
        System.out.println("someShort " + someShort);
        System.out.println("someInt " + someInt);
        System.out.println("someFloat " + someFloat);

        String str = " ";
        str = "My goal ";

        String str2 = " ";
        str2 = "is to learn Java!";

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str + str2);

        System.out.println(str.toUpperCase()); // верхний регистр
        System.out.println(str.toLowerCase()); // нижний регистр
        System.out.println(str.substring(3));
        System.out.println(str.charAt(4));

    }
}
