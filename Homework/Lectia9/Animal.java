public interface Animal {
    public default String getName() {
        return "Nu are nume";
    }

    public static String getType() {
        return "Animal";
    }

    public int getAge();

    public String getDesc();
}
