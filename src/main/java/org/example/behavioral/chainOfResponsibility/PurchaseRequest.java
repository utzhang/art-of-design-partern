package org.example.behavioral.chainOfResponsibility;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PurchaseRequest {
    private double amount;
    private int number;
    private String purpose;
}
