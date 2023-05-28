package org.example.behavioral.chainOfResponsibility;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PurchaseRequestTest {

    @Test
    void getAmount() {
        PurchaseRequest request = new PurchaseRequest();
        request.setAmount(10);
        assertEquals(10, request.getAmount());
    }
}