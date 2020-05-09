package Leetcode;

public class L13_RomanToInteger extends DefaultLeetcode{

    public L13_RomanToInteger(){
        completed = true;
        ID = 13;
        name = "Roman To Integer";
        description = "Given a roman numeral, convert it to an integer. \nInput is guaranteed to be within the range from 1 to 3999.";
    }

    public int romanToInt(String s) {
        int total = 0;
        while(s.length() > 0){
            System.out.println("Current String: " + s + " and current total: " + total);

            if(s.length() == 1){
                total += charToNum(s.charAt(0));
                break;
            }
            else{
                int check = checkForSubtraction(s);
                if(check == -1){
                    total += (charToNum(s.charAt(0)));
                    s = s.substring(1,s.length());
                }
                else{
                    total += check;
                    s = s.substring(2,s.length());
                }
            }
        }
        return total;
    }

    public int checkForSubtraction(String s) {
        if (charToNum(s.charAt(0)) < charToNum(s.charAt(1))) {
            return charToNum(s.charAt(1)) - charToNum(s.charAt(0));
        }

        return -1;
    }

    private int charToNum(char c){
        int returnInt = 0;
        switch(c){
            case 'I':
                returnInt = 1;
                break;
            case 'V':
                returnInt = 5;
                break;
            case 'X':
                returnInt = 10;
                break;
            case 'L':
                returnInt = 50;
                break;
            case 'C':
                returnInt = 100;
                break;
            case 'D':
                returnInt = 500;
                break;
            case 'M':
                returnInt = 1000;
                break;
            default:
                returnInt = 0;
                break;
        }

        return returnInt;
    }

}
