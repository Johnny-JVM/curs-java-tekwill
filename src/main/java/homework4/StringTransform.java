package homework4;

public class StringTransform {
    public static void main(String[] args) {
        String strBoolean = ("true");
        String strByte = ("120");
        String strShort = ("32000");
        String strInt = ("147895632");
        String strLong = ("987654321987654321");
        String strDouble = ("4444.5d");
        String strFloat = ("2354.56f");

        boolean one = Boolean.parseBoolean(strBoolean);
        byte two = Byte.parseByte(strByte);
        short three = Short.parseShort(strShort);
        int four = Integer.parseInt(strInt);
        long five = Long.parseLong(strLong);
        double six = Double.parseDouble(strDouble);
        float seven = Float.parseFloat(strFloat);

        System.out.println(
                "Boolean: " + one + "\n" +
                        "Byte: " + two + "\n" +
                        "Short: " + three + "\n" +
                        "Int: " + four + "\n" +
                        "Long: " + five + "\n" +
                        "Double: " + six + "\n" +
                        "Float: " + seven


        );

    }

}
