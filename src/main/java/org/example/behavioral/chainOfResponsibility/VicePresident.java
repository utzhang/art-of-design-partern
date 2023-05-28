package org.example.behavioral.chainOfResponsibility;

public class VicePresident extends  Approver{
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长处理此请求：");
            System.out.println(request.getAmount());
            System.out.println(request.getNumber());
            System.out.println(request.getPurpose());
        } else {
            this.successor.processRequest(request);
        }
    }
}
