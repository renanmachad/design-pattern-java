package design.decoders.implementations;

import design.decoders.interfaces.RegisterClientDecoder;

public class RegisterClientXmlDecoder implements RegisterClientDecoder {
    @Override
    public void decode(String text) {
        System.out.println("Decoding MSG of type XML: ");
    }
}
