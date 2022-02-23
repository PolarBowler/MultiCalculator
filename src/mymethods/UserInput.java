package mymethods;

import java.util.Scanner;
import java.text.*;

/*
 * This class is intended to provide input methods to get various variables from the user.
 */
public class UserInput {
    private Scanner sc = new Scanner(System.in);

    /*
     * The following makes sure that when parsing to float or double the locale is
     * respected, see the methods "getFloat" and "getDouble" for examples.
     */
    private NumberFormat currentFormat = NumberFormat.getInstance();

    private Boolean error = false;
    private String tempString = "";
    private String invalidInput = "Invalid input, please try again!";

    public byte getByte(String prompt) {
        byte result = 0;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = Byte.parseByte(tempString);
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public short getShort(String prompt) {
        short result = 0;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = Short.parseShort(tempString);
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public int getInt(String prompt) {
        int result = 0;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = Integer.parseInt(tempString);
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public long getLong(String prompt) {
        long result = 0L;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = Long.parseLong(tempString);
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public float getFloat(String prompt) {
        float result = 0.0f;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = currentFormat.parse(tempString).floatValue();
                /*
                 * parseFloat would not work here. It ignores the systems locale. This means
                 * that for example: on my system the locale is en_at, which means decimal
                 * points are marked by a "," instead of a "."! By using
                 * NumberFormat.getFormat(); we check the systems locale and using
                 * "currentFormat.parse(tempString).floatValue();" we convert the string (which
                 * is written in the style of the locale) into a decimal number and
                 * ".floatValue()" makes sure it gets assigned as a float to "result".
                 */
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public double getDouble(String prompt) {
        double result = 0.0d;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = currentFormat.parse(tempString).doubleValue(); // See method "getFloat" above for more Infos
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public boolean getBool(String prompt) {
        boolean result = true;

        do {
            tempString = getString(prompt);
            error = false;
            try {
                result = Boolean.parseBoolean(tempString);
            } catch (Exception e) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }

    public String getString(String prompt) {
        System.out.println(prompt);

        String result = sc.nextLine();

        return result;
    }

    public String getString(String prompt, Boolean allowEmpty) {
        /*
         * this method is an Overload of the normal getString method which allows us to
         * specify that empty strings should not be returned.
         */
        String result = "";

        do {
            error = false;
            result = getString(prompt);
            if (result == "" && allowEmpty == false) {
                System.out.println(invalidInput);
                error = true;
            }
        } while (error);

        return result;
    }
}