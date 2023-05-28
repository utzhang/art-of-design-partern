package org.example.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Approver director = new Director("张主任");
        Approver vicePresident = new VicePresident("张副董事长");
        Approver president = new President("张董");
        Approver meeting = new Congress("董事会");

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(meeting);

        PurchaseRequest pr1 = new PurchaseRequest(45000, 1000, "购买倚天剑");
        director.processRequest(pr1);
        PurchaseRequest pr2 = new PurchaseRequest(65000, 1000, "购买倚天剑plus");
        director.processRequest(pr2);
        PurchaseRequest pr3 = new PurchaseRequest(450000, 1000, "购买倚天剑pro");
        director.processRequest(pr3);
        PurchaseRequest pr4 = new PurchaseRequest(650000, 1000, "购买倚天剑pro-plus");
        director.processRequest(pr4);
    }
}
