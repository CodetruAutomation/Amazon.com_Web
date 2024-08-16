/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package com.OpenMRS.utils;

import org.testng.annotations.Test;

import static com.OpenMRS.utils.DataFakerUtils.getFaker;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerateUtils {

    private DataGenerateUtils() {
        super();
    }

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom random = new SecureRandom();

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(AB.charAt(random.nextInt(AB.length())));
        }
        return sb.toString();
    }

    public static String randomStringHexToken(int byteLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16); // Hexadecimal encoding
    }

    public static String randomStringUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public static int randomNumberIntFromTo(int from, int to) {
        int random_int = (int) Math.floor(Math.random() * (to - from + 1) + from);
        return random_int;
    }

    public static String randomFirstName() {
        return getFaker().name().firstName();
    }
    public static String randomMiddleName() {
        return getFaker().name().lastName();
    }
    public static String randomLastName() {
        return getFaker().name().lastName();
    }
    public static String randomPhoneNumber() {
        return getFaker().number().digits(10);
    }
    public static String randomEmail() {
        return getFaker().internet().emailAddress();
    }
    public static String randomCountry() {
        return getFaker().address().country();
    }

    public static String randomZipCode() {
    	
        return getFaker().address().zipCode();
    }

    public static String randomAddress() {
        return getFaker().address().fullAddress();
    }
    public static String randomShortAddress() {
        String address;
        do {
            String streetName = getFaker().address().streetName();
            String city = getFaker().address().cityName();
            String state = getFaker().address().stateAbbr();  // Use state abbreviation to save space
            address = streetName + ", " + city + ", " + state;
        } while (address.length() >= 33);
        return address;
    }
    public static String randomCity() {
        return getFaker().address().cityName();
    }

    public static String randomState() {
        return getFaker().address().state();
    }
  
    public static String randomStreetName() {
        return getFaker().address().streetName();
    }
    public static int generateSingleDigitNumber() {
        int number;
        do {
            number = getFaker().number().numberBetween(1, 10); // Generates a number between 1 (inclusive) and 10 (exclusive)
        } while (number >= 10);
        return number;
    }
    public static int random4DigitNumberLessThan30000() {
        int number;
        do {
            number = getFaker().number().numberBetween(1000, 30000);
        } while (number >= 30000);
        return number;
    }
    public static String randomFaceAmount() {
        return getFaker().number().digits(4);
    }
    public static String randomSSNNumber() {
        return getFaker().number().digits(9);
    }
    public static String randomJobTitle() {
        return getFaker().job().title();
    }

    public static String randomJobSkills() {
        return getFaker().job().keySkills();
    }

    public static String randomProgrammingLanguage() {
        return getFaker().programmingLanguage().name();
    }

    public static String randomDateOfBirthDDMMYYYY() {
        // Get current date
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        // Calculate the date 18 years ago
        calendar.add(Calendar.YEAR, -18);
        Date maxDate = calendar.getTime();

        // Calculate the date 65 years ago
        calendar.add(Calendar.YEAR, -47); // -18 - 47 = -65
        Date minDate = calendar.getTime();

        // Generate a random date between minDate and maxDate
        long randomDateInMillis = ThreadLocalRandom.current().nextLong(minDate.getTime(), maxDate.getTime());
        Date dateOfBirth = new Date(randomDateInMillis);

        // Format the date to DDMMYYYY format
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        return sdf.format(dateOfBirth);
    }
    public static String randomValidSSN() {
        String ssn;
        int firstThree;

        // Generate the first three digits
        do {
            firstThree = getFaker().number().numberBetween(1, 900);
        } while (firstThree == 666 || firstThree < 1);

        // Generate the middle two digits
        int middleTwo = getFaker().number().numberBetween(1, 100);

        // Generate the last four digits
        int lastFour = getFaker().number().numberBetween(1, 10000);

        // Format the SSN to ensure proper digit lengths
        ssn = String.format("%03d%02d%04d", firstThree, middleTwo, lastFour);
        return ssn;
    

    }
    @Test
    public void testDataGeneration() {
        System.out.println(randomProgrammingLanguage());
        System.out.println(randomJobTitle());
        System.out.println(randomJobSkills());
        System.out.println(randomFirstName());
        System.out.println(randomPhoneNumber());
        System.out.println(randomAddress());
        System.out.println(randomCountry());
        System.out.println(randomZipCode());
        System.out.println(randomState());
        System.out.println(randomCity());
        System.out.println(randomStreetName());
    }

}
