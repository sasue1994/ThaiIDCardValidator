package com.shs.app;

public class ValidateIDCard {
    public boolean checkIsValid(String idCard){

        /*
        * 13 digit : 6270443972467
        * x = (13N1+12N2+11N3+10N4+9N5+8N6+7N7+6N8+5N9+4N10+3N11+2N12)%11
        * x <= 1 : 1 - x
        * x > 1 : 11 - x
        * N13 == x is true
        * return
        * */
        if(idCard.length() == 13){
            String digitCheck ;
            String lastIDCardDigit = String.valueOf(idCard.charAt(12));
            int total = 0;
            for(int i = 0 ; i < 12; i++){
                String numberOfPositont = idCard.substring(i,i+1);
                int position = 13 - i;
                int sum = position * Integer.parseInt(numberOfPositont);
                total += sum;
            }

            int resultForCheck = (total % 11);
            int result;
            if(resultForCheck <= 1){
                result = 1 - resultForCheck;
            }else{
                result = 11 - resultForCheck;
            }
            digitCheck = String.valueOf(result);

            return lastIDCardDigit.equals(digitCheck);

        }
        return false;
    }


}
