package cheatShett.data_type;

public class IntegerMethods {
    public static void main(String[] args) {
        int a = 42;
        int b = 100;

        // Static Methods
        System.out.println("1. A bit count of 42: " + Integer.bitCount(a)); // ➡️ Counts the number of 1-bits in the binary representation
        System.out.println("2. Compare 42 and 100: " + Integer.compare(a, b)); // ➡️ Compares two integers numerically
        System.out.println("3. Compare unsigned 42 and 100: " + Integer.compareUnsigned(a, b)); // ➡️ Compares two integers as unsigned values
        System.out.println("4. Decode '0x2A': " + Integer.decode("0x2A")); // ➡️ Decodes a string into an Integer
        System.out.println("5. Hash code of 42: " + Integer.hashCode(a)); // ➡️ Returns the hash code of the integer
        System.out.println("6. Highest one bit of 42: " + Integer.highestOneBit(a)); // ➡️ Returns the highest one bit in the binary representation
        System.out.println("7. Lowest one bit of 42: " + Integer.lowestOneBit(a)); // ➡️ Returns the lowest one bit in the binary representation
        System.out.println("8. Max of 42 and 100: " + Integer.max(a, b)); // ➡️ Returns the maximum of two integers
        System.out.println("9. Min of 42 and 100: " + Integer.min(a, b)); // ➡️ Returns the minimum of two integers
        System.out.println("10. Number of leading zeros in 42: " + Integer.numberOfLeadingZeros(a)); // ➡️ Counts the number of leading zeros in the binary representation
        System.out.println("11. Number of trailing zeros in 42: " + Integer.numberOfTrailingZeros(a)); // ➡️ Counts the number of trailing zeros in the binary representation
        System.out.println("12. Parse '42': " + Integer.parseInt("42")); // ➡️ Parses the string as a signed decimal integer
        System.out.println("13. Parse '2A' in radix 16: " + Integer.parseInt("2A", 16)); // ➡️ Parses the string as a signed integer in the specified radix
        System.out.println("14. Parse unsigned '42': " + Integer.parseUnsignedInt("42")); // ➡️ Parses the string as an unsigned decimal integer
        System.out.println("15. Parse unsigned '2A' in radix 16: " + Integer.parseUnsignedInt("2A", 16)); // ➡️ Parses the string as an unsigned integer in the specified radix
        System.out.println("16. Reverse bits of 42: " + Integer.reverse(a)); // ➡️ Reverses the order of the bits in the binary representation
        System.out.println("17. Reverse bytes of 42: " + Integer.reverseBytes(a)); // ➡️ Reverses the order of the bytes in the binary representation
        System.out.println("18. Rotate left 42 by 2 bits: " + Integer.rotateLeft(a, 2)); // ➡️ Rotates the bits to the left by the specified number of bits
        System.out.println("19. Rotate right 42 by 2 bits: " + Integer.rotateRight(a, 2)); // ➡️ Rotates the bits to the right by the specified number of bits
        System.out.println("20. Signum of 42: " + Integer.signum(a)); // ➡️ Returns the signum function of the integer
        System.out.println("21. Sum of 42 and 100: " + Integer.sum(a, b)); // ➡️ Adds two integers
        System.out.println("22. Binary string of 42: " + Integer.toBinaryString(a)); // ➡️ Converts the integer to a binary string
        System.out.println("23. Hex string of 42: " + Integer.toHexString(a)); // ➡️ Converts the integer to a hexadecimal string
        System.out.println("24. Octal string of 42: " + Integer.toOctalString(a)); // ➡️ Converts the integer to an octal string
        System.out.println("25. String of 42: " + Integer.toString(a)); // ➡️ Converts the integer to a decimal string
        System.out.println("26. String of 42 in radix 16: " + Integer.toString(a, 16)); // ➡️ Converts the integer to a string in the specified radix
        System.out.println("27. Value of 42: " + Integer.valueOf(a)); // ➡️ Returns an Integer instance representing the specified int value
        System.out.println("28. Value of '42': " + Integer.valueOf("42")); // ➡️ Returns an Integer instance representing the specified String value
        System.out.println("29. Value of '2A' in radix 16: " + Integer.valueOf("2A", 16)); // ➡️ Returns an Integer instance representing the specified String value in the specified radix

        // Instance Methods
        Integer intObj = 42;
        System.out.println("30. Byte value of 42: " + intObj.byteValue()); // ➡️ Returns the value of this Integer as a byte
        System.out.println("31. Compare to 100: " + intObj.compareTo(b)); // ➡️ Compares this Integer to another Integer
        System.out.println("32. Double value of 42: " + intObj.doubleValue()); // ➡️ Returns the value of this Integer as a double
        System.out.println("33. Equals 42: " + intObj.equals(a)); // ➡️ Compares this Integer to the specified object
        System.out.println("34. Float value of 42: " + intObj.floatValue()); // ➡️ Returns the value of this Integer as a float
        System.out.println("35. Hash code: " + intObj.hashCode()); // ➡️ Returns a hash code for this Integer
        System.out.println("36. Int value: " + intObj.intValue()); // ➡️ Returns the value of this Integer as an int
        System.out.println("37. Long value: " + intObj.longValue()); // ➡️ Returns the value of this Integer as a long
        System.out.println("38. Short value: " + intObj.shortValue()); // ➡️ Returns the value of this Integer as a short
        System.out.println("39. String representation: " + intObj.toString()); // ➡️ Returns a string representation of this Integer


        /*
            1. A bit count of 42: 3
            2. Compare 42 and 100: -1
            3. Compare unsigned 42 and 100: -1
            4. Decode '0x2A': 42
            5. Hash code of 42: 42
            6. Highest one bit of 42: 32
            7. Lowest one bit of 42: 2
            8. Max of 42 and 100: 100
            9. Min of 42 and 100: 42
            10. Number of leading zeros in 42: 26
            11. Number of trailing zeros in 42: 1
            12. Parse '42': 42
            13. Parse '2A' in radix 16: 42
            14. Parse unsigned '42': 42
            15. Parse unsigned '2A' in radix 16: 42
            16. Reverse bits of 42: 1409286144
            17. Reverse bytes of 42: 704643072
            18. Rotate left 42 by 2 bits: 168
            19. Rotate right 42 by 2 bits: -2147483638
            20. Signum of 42: 1
            21. Sum of 42 and 100: 142
            22. Binary string of 42: 101010
            23. Hex string of 42: 2a
            24. Octal string of 42: 52
            25. String of 42: 42
            26. String of 42 in radix 16: 2a
            27. Value of 42: 42
            28. Value of '42': 42
            29. Value of '2A' in radix 16: 42
            30. Byte value of 42: 42
            31. Compare to 100: -1
            32. Double value of 42: 42.0
            33. Equals 42: true
            34. Float value of 42: 42.0
            35. Hash code: 42
            36. Int value: 42
            37. Long value: 42
            38. Short value: 42
            39. String representation: 42

         */
    }
}

