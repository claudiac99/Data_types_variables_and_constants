public class Main {
    public static void main(String[] args){
        //Character
        char varChar = 'K';
        System.out.println(varChar);

        //String
        String varString = "Klaudia";
        System.out.println(varString);

        //Boolean
        boolean varBoolean = false; //true or false
        System.out.println(varBoolean);

        //byte - integers
        byte varByte = Byte.MIN_VALUE; //-128
        byte varByte1 = Byte.MAX_VALUE; //127
        System.out.println("Byte: " + varByte + " - " + varByte1);

        //short - integers
        short varShort = Short.MIN_VALUE; //-32768
        short varShort1 = Short.MAX_VALUE; //32767
        System.out.println("Short: " + varShort + " - " + varShort1);

        //int
        int varInt = Integer.MIN_VALUE; //-2147483648
        int varInt1 = Integer.MAX_VALUE; //2147483647
        System.out.println("Int: " + varInt + " - " + varInt1);

        //long - integers
        long varLong = Long.MIN_VALUE; //-9223372036854775808
        long varLong1 = Long.MAX_VALUE; //9223372036854775807
        System.out.println("Long: " + varLong + " - " + varLong1);

        //float - floating point numbers
        //float varFloat = 1.234f
        float varFloat = Float.MIN_VALUE; //1.4E-45
        float varFloat1 = Float.MAX_VALUE; //3.4028235E38
        System.out.println("Float: " + varFloat + " - " + varFloat1);

        //double - floating point numbers (better precision)
        double varDouble = Double.MIN_VALUE; //4.9E-324
        double varDouble1 = Double.MAX_VALUE; //1.7976931348623157E308
        System.out.println("Double: " + varDouble + " - " + varDouble1);


        //constant
        final int number = 256;
    }
}
