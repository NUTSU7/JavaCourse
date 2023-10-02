public class ex3 {
    
    static String boolStr = "tRue";
    static String byteStr = "120";
    static String shortStr = "32000";
    static String intStr = "147895632";
    static String longStr = "987654321987654321";
    static String doubleStr = "4444.5d";
    static String floatStr = "2354.56f";

    public static void main(String[] args) {
        boolean boolConv = Boolean.parseBoolean(boolStr);
        byte byteConv = Byte.parseByte(byteStr);
        short shortConv = Short.parseShort(shortStr);
        int intConv = Integer.parseInt(intStr);
        long longConv = Long.parseLong(longStr);
        double doubleConv = Double.parseDouble(doubleStr);
        float floatConv = Float.parseFloat(floatStr);
    }
}
