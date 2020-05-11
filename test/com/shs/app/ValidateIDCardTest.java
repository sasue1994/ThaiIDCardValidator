package com.shs.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIDCardTest {

    /*
    * Note : Each test case should one logic
    *
    */
    @Test
    public void checkIDCardIsValid(){
        ValidateIDCard validateIDCard = new ValidateIDCard();
        boolean rs = validateIDCard.checkIsValid("6270443972467");
        assertTrue(rs);
    }

    @Test
    public void checkIDCardIsInValid(){
        ValidateIDCard validateIDCard = new ValidateIDCard();
        boolean rs = validateIDCard.checkIsValid("6270443342467");
        assertFalse(rs);
    }

}