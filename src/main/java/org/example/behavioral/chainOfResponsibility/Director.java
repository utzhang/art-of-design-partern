package org.example.behavioral.chainOfResponsibility;

public class Director  extends  Approver{
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任处理此请求：");
            System.out.println(request.getAmount());
            System.out.println(request.getNumber());
            System.out.println(request.getPurpose());
        } else {
            this.successor.processRequest(request);
        }
    }
}
