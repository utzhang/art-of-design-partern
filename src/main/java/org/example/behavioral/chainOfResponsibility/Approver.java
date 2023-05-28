package org.example.behavioral.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Approver {
    protected String name;
    protected Approver successor;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest request);
}
