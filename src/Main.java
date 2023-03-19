import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String input = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не введено число");
        }
        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) {
        if (input == null) {
            throw new RuntimeException("Введена пустая строка");
        }

        String[] strings = input.split(" ");
        String firstNumberStr = strings[0];
        String secondNumberStr = strings[2];
        String operation = strings[1];

        int firstNumberInt;
        int secondNumberInt;
        try {
            firstNumberInt = Integer.parseInt(strings[0]);
            secondNumberInt = Integer.parseInt(strings[2]);

            if (firstNumberInt < 1 || firstNumberInt > 10 || secondNumberInt < 1 || secondNumberInt > 10) {
                throw new RuntimeException("Введены числа, неудовлетворяющие условию");
            }

            return calculating(operation, firstNumberInt, secondNumberInt);
        } catch (NumberFormatException e) {
            firstNumberInt = converterToArabicNumbers(firstNumberStr);
            secondNumberInt = converterToArabicNumbers(secondNumberStr);
            String result = calculating(operation, firstNumberInt, secondNumberInt);

            return converterToRimNumbers(result);
        }
    }

    static String calculating(String operation, int firstNumber, int secondNumber) {
        return switch (operation) {
            case ("+") -> String.valueOf(firstNumber + secondNumber);
            case ("-") -> String.valueOf(firstNumber - secondNumber);
            case ("/") -> String.valueOf(Integer.valueOf(firstNumber / secondNumber));
            case ("*") -> String.valueOf(firstNumber * secondNumber);
            default -> throw new RuntimeException("Неправильная операция");
        };
    }

    static int converterToArabicNumbers(String rimNumberStr) {
        return switch (rimNumberStr) {
            case ("I") -> 1;
            case ("II") -> 2;
            case ("III") -> 3;
            case ("IV") -> 4;
            case ("V") -> 5;
            case ("VI") -> 6;
            case ("VII") -> 7;
            case ("VIII") -> 8;
            case ("IX") -> 9;
            case ("X") -> 10;
            case ("XI") -> 11;
            case ("XII") -> 12;
            case ("XIII") -> 13;
            case ("XIV") -> 14;
            case ("XV") -> 15;
            case ("XVI") -> 16;
            case ("XVII") -> 17;
            case ("XVIII") -> 18;
            case ("XIX") -> 19;
            case ("XX") -> 20;
            case ("XXI") -> 21;
            case ("XXII") -> 22;
            case ("XXIII") -> 23;
            case ("XXIV") -> 24;
            case ("XXV") -> 25;
            case ("XXVI") -> 26;
            case ("XXVII") -> 27;
            case ("XXVIII") -> 28;
            case ("XXIX") -> 29;
            case ("XXX") -> 30;
            case ("XXXI") -> 31;
            case ("XXXII") -> 32;
            case ("XXXIII") -> 33;
            case ("XXXIV") -> 34;
            case ("XXXV") -> 35;
            case ("XXXVI") -> 36;
            case ("XXXVII") -> 37;
            case ("XXXVIII") -> 38;
            case ("XXXIX") -> 39;
            case ("XL") -> 40;
            case ("XLI") -> 41;
            case ("XLII") -> 42;
            case ("XLIII") -> 43;
            case ("XLIV") -> 44;
            case ("XLV") -> 45;
            case ("XLVI") -> 46;
            case ("XLVII") -> 47;
            case ("XLVIII") -> 48;
            case ("XLIX") -> 49;
            case ("L") -> 50;
            case ("LI") -> 51;
            case ("LII") -> 52;
            case ("LIII") -> 53;
            case ("LIV") -> 54;
            case ("LV") -> 55;
            case ("LVI") -> 56;
            case ("LVII") -> 57;
            case ("LVIII") -> 58;
            case ("LIX") -> 59;
            case ("LX") -> 60;
            case ("LXI") -> 61;
            case ("LXII") -> 62;
            case ("LXIII") -> 63;
            case ("LXIV") -> 64;
            case ("LXV") -> 65;
            case ("LXVI") -> 66;
            case ("LXVII") -> 67;
            case ("LXVIII") -> 68;
            case ("LXIX") -> 69;
            case ("LXX") -> 70;
            case ("LXXI") -> 71;
            case ("LXXII") -> 72;
            case ("LXXIII") -> 73;
            case ("LXXIV") -> 74;
            case ("LXXV") -> 75;
            case ("LXXVI") -> 76;
            case ("LXXVII") -> 77;
            case ("LXXVIII") -> 78;
            case ("LXXIX") -> 79;
            case ("LXXX") -> 80;
            case ("LXXXI") -> 81;
            case ("LXXXII") -> 82;
            case ("LXXXIII") -> 83;
            case ("LXXXIV") -> 84;
            case ("LXXXV") -> 85;
            case ("LXXXVI") -> 86;
            case ("LXXXVII") -> 87;
            case ("LXXXVIII") -> 88;
            case ("LXXXIX") -> 89;
            case ("XC") -> 90;
            case ("XCI") -> 91;
            case ("XCII") -> 92;
            case ("XCIII") -> 93;
            case ("XCIV") -> 94;
            case ("XCV") -> 95;
            case ("XCVI") -> 96;
            case ("XCVII") -> 97;
            case ("XCVIII") -> 98;
            case ("XCIX") -> 99;
            case ("C") -> 100;

            default -> throw new RuntimeException("Запись не удовлетворяет условию");
        };
    }

    static String converterToRimNumbers(String arabicNumberStr) {
        return switch (arabicNumberStr) {
            case ("1") -> "I";
            case ("2") -> "II";
            case ("3") -> "III";
            case ("4") -> "IV";
            case ("5") -> "V";
            case ("6") -> "VI";
            case ("7") -> "VII";
            case ("8") -> "VIII";
            case ("9") -> "IX";
            case ("11") -> "XI";
            case ("12") -> "XII";
            case ("13") -> "XII";
            case ("14") -> "XVI";
            case ("15") -> "XV";
            case ("16") -> "XVI";
            case ("17") -> "XVII";
            case ("18") -> "XVIII";
            case ("19") -> "XIX";
            case ("20") -> "XX";
            case ("21") -> "XXI";
            case ("22") -> "XXII";
            case ("23") -> "XXIII";
            case ("24") -> "XXIV";
            case ("25") -> "XXV";
            case ("26") -> "XXVI";
            case ("27") -> "XXVII";
            case ("28") -> "XXVIII";
            case ("29") -> "XXIX";
            case ("30") -> "XXX";
            case ("31") -> "XXXI";
            case ("32") -> "XXXII";
            case ("33") -> "XXXIII";
            case ("34") -> "XXXIV";
            case ("35") -> "XXXV";
            case ("36") -> "XXXVI";
            case ("37") -> "XXXVII";
            case ("38") -> "XXXVIII";
            case ("39") -> "XXXIX";
            case ("40") -> "XL";
            case ("41") -> "XLI";
            case ("42") -> "XLII";
            case ("43") -> "XLIII";
            case ("44") -> "XLIV";
            case ("45") -> "XLV";
            case ("46") -> "XLVI";
            case ("47") -> "XLVII";
            case ("48") -> "XLVIII";
            case ("49") -> "XLIX";
            case ("50") -> "L";
            case ("51") -> "LI";
            case ("52") -> "LII";
            case ("53") -> "LIII";
            case ("54") -> "LIV";
            case ("55") -> "LV";
            case ("56") -> "LVI";
            case ("57") -> "LVII";
            case ("58") -> "LVIII";
            case ("59") -> "LVIX";
            case ("60") -> "LX";
            case ("61") -> "LXI";
            case ("62") -> "LXII";
            case ("63") -> "LXIII";
            case ("64") -> "LXIV";
            case ("65") -> "LXI";
            case ("66") -> "LXVI";
            case ("67") -> "LXVII";
            case ("68") -> "LXVIII";
            case ("69") -> "LXIX";
            case ("70") -> "LXX";
            case ("71") -> "LXXI";
            case ("72") -> "LXXII";
            case ("73") -> "LXXIII";
            case ("74") -> "LXXIV";
            case ("75") -> "LXXV";
            case ("76") -> "LXXVI";
            case ("77") -> "LXVII";
            case ("78") -> "LXVIII";
            case ("79") -> "LXIX";
            case ("80") -> "LXXX";
            case ("81") -> "LXXXI";
            case ("82") -> "LXXXII";
            case ("83") -> "LXXXIII";
            case ("84") -> "LXXXIV";
            case ("85") -> "LXXXV";
            case ("86") -> "LXXXVI";
            case ("87") -> "LXXXVII";
            case ("88") -> "LXXXVIII";
            case ("89") -> "LXXXIX";
            case ("90") -> "XC";
            case ("91") -> "XCI";
            case ("92") -> "XCII";
            case ("93") -> "XCIII";
            case ("94") -> "XCIV";
            case ("95") -> "XCV";
            case ("96") -> "XCVI";
            case ("97") -> "XCVII";
            case ("98") -> "XCVIII";
            case ("99") -> "XCIX";
            case ("100") -> "C";

            default -> throw new RuntimeException("Запись не удовлетворяет условию");
        };
    }
}