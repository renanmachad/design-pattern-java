package design.service;

import design.decoders.interfaces.RegisterClientDecoder;
import design.factory.DecoderFactory;

/**
 * Exemplo de uso da classe decoder factory e afins.
 */
public class ServiceIntegration {

    public void registerClient(String text, String origem){

        DecoderFactory decoderFactory = DecoderFactory.getFactory(origem);

        RegisterClientDecoder msgDecoder = decoderFactory
                .createRegisterClientDecoder();

        msgDecoder.decode(text);
    }
}
