package design;

import design.service.ServiceIntegration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ServiceIntegration serviceIntegration = new ServiceIntegration();
        serviceIntegration.registerClient("oi", "X");
    }
}