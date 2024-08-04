package design.factory;

import design.decoders.interfaces.RegisterAccountDecoder;
import design.decoders.implementations.RegisterAccountFixedTextDecoder;
import design.decoders.interfaces.RegisterClientDecoder;
import design.decoders.implementations.RegisterClientFixedTextDecoder;

public class FixedTextDecoderFactory extends DecoderFactory {
    @Override
    public RegisterClientDecoder createRegisterClientDecoder() {
        return new RegisterClientFixedTextDecoder();
    }

    @Override
    public RegisterAccountDecoder createRegisterAccountDecoder() {
        return new RegisterAccountFixedTextDecoder();
    }
}
