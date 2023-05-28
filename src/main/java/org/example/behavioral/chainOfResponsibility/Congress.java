package org.example.behavioral.chainOfResponsibility;

public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
            System.out.println("董事会处理此请求：");
            System.out.println(request.getAmount());
            System.out.println(request.getNumber());
            System.out.println(request.getPurpose());
    }
}
