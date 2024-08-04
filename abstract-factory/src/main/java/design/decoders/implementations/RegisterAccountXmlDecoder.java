package design.decoders.implementations;

import design.decoders.interfaces.RegisterAccountDecoder;

public class RegisterAccountXmlDecoder implements RegisterAccountDecoder {
    @Override
    public void decode(String text) {
        System.out.println("Decoding MSG of type XML: ");
    }
}
