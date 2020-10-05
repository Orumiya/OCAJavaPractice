package primitiveVariables;

public class PrimitiveTestMain {
    public static void main(String[] args) {
        // BYTE -128 < byte < 127   (8 bit)
        // BINARY
        byte a_byte = 0b1101;
        // OCTAL
        byte b_byte = 027;
        // DECIMAL
        byte d_byte = 4;
        // HEX
        byte c_byte = 0x10;
        System.out.println("a_byte: " + a_byte + ", b_byte: " + b_byte + ", c_byte: " + c_byte + ", d_byte: " + d_byte);

        // SHORT -32768 < short < 32767 (16 bit)
        // BINARY
        short a_short = 0b10101;
        // OCTAL
        short b_short = 0101;
        // DECIMAL
        short d_short = 42;
        // HEX
        short c_short = 0x2A;
        System.out.println("a_short: " + a_short + ", b_short: " + b_short + ", c_short: " + c_short + ", d_short: " + d_short);
        // result: a_short: 21, b_short: 65, c_short: 42, d_short: 42

        // INT -2 milliárd 147 millió x < int < 2 milliárd 147 millió (32 bit) (10 db számjegy)
        // BINARY
        int a = 0b10101; // 0b-vel indul: binary
        // OCTAL
        int b = 010101; // 0-val indul: octal
        // DECIMAL
        int d = 42;
        // HEX
        int c = 0x2A; // 0x-el indul: hex
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);
        // result: a: 21, b: 4161, c: 42, d: 42

        // LONG -9,223 * 10^18 < long < 9,223 * 10^18 (64 bit) 19 számjegy
        // defaul value 0L
        // BINARY
        long a_long = 0b10101L; // 0b-vel indul: binary
        // OCTAL
        long b_long = 010101L; // 0-val indul: octal
        // DECIMAL
        long d_long = 42L;
        // HEX
        long c_long = 0x2AL; // 0x-el indul: hex
        System.out.println("a_long: " + a_long + ", b_long: " + b_long + ", c_long: " + c_long + ", d_long: " + d_long);

        // FLOAT 32 bites 1.4E-45 <float < 3,4E+38
        //default value 0.0F
        // BINARY
        float a_float = 0b10101; // 0b-vel indul: binary
        // OCTAL
        float b_float = 010101; // 0-val indul: octal
        // DECIMAL
        float d_float = 42F;
        // HEX
        float c_float = 0x2A; // 0x-el indul: hex
        System.out.println("a_float: " + a_float + ", b_float: " + b_float + ", c_float: " + c_float + ", d_float: " + d_float);
        //result: a_float: 21.0, b_float: 4161.0, c_float: 42.0, d_float: 42.0
        // hex és octal mögé rakott F tök mást ír ki

        // DOUBLE  4.9E-324 < double < 1.797E+308
        // BINARY
        double a_double = 0b10101;
        // OCTAL
        double b_double = 010101;
        // DECIMAL
        double d_double = 42;
        double e_double = 2.3;
        double exp_double = 2.3E23; // exponenciális forma
        // HEX
        double c_double = 0x2A;
        System.out.println("a_double: " + a_double + ", b_double: " + b_double + ", c_double: " + c_double + ", d_double: " + d_double
        + ", e_double: " + e_double + ", exp_double: " + exp_double);
        // result: a_double: 21.0, b_double: 4161.0, c_double: 42.0, d_double: 42.0, e_double: 2.3, exp_double: 2.3E23

        // CHAR
        //default value: '\u0000'
        char a_char = 'A';
        char b_char = '\u0041';
        System.out.println("a_char: " + a_char + ", b_char: " + b_char);
        /*
        smaller types are automatically promoted to bigger types
         */



    }
}
