package design.factory;

import design.decoders.interfaces.RegisterAccountDecoder;
import design.decoders.implementations.RegisterAccountXmlDecoder;
import design.decoders.interfaces.RegisterClientDecoder;
import design.decoders.implementations.RegisterClientXmlDecoder;

public class XMLDecoderFactory  extends DecoderFactory{
    @Override
    public RegisterClientDecoder createRegisterClientDecoder() {
        return new RegisterClientXmlDecoder();
    }

    @Override
    public RegisterAccountDecoder createRegisterAccountDecoder() {
        return new RegisterAccountXmlDecoder();
    }
}
