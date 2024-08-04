package design.factory;

import design.decoders.implementations.RegisterAccountCSVDecoder;
import design.decoders.interfaces.RegisterAccountDecoder;
import design.decoders.implementations.RegisterClientCSVDecoder;
import design.decoders.interfaces.RegisterClientDecoder;

public class CSVDecoderFactory extends DecoderFactory {
    @Override
    public RegisterClientDecoder createRegisterClientDecoder() {
        return new RegisterClientCSVDecoder();
    }

    @Override
    public RegisterAccountDecoder createRegisterAccountDecoder() {
        return new RegisterAccountCSVDecoder();
    }
}
