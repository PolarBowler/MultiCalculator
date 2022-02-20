package mymethods;

import java.util.Scanner;
import java.text.*;

public class UserInput {
    private Scanner sc = new Scanner(System.in);
    private Boolean error = false;
    private String invalidInput = "Invalid input, please try again!";
    private String tempString = "";
    private NumberFormat currentFormat = NumberFormat.getInstance();

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
                result = currentFormat.parse(tempString).doubleValue();
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