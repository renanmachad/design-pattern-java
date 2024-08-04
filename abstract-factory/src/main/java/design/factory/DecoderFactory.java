package design.factory;


import design.decoders.interfaces.RegisterAccountDecoder;
import design.decoders.interfaces.RegisterClientDecoder;

/**
 * Abstract factory, responsável por criar
 * outras instâncias, sendo ela a 'fábrica'.
 */
public abstract class DecoderFactory {

    public abstract RegisterClientDecoder createRegisterClientDecoder();

    public abstract RegisterAccountDecoder createRegisterAccountDecoder();

    public static DecoderFactory getFactory(String type) {
        DecoderFactory decoderFactory = null;
        switch (type) {
            case "X":
                decoderFactory = new XMLDecoderFactory();
                break;
            case "Y":
                decoderFactory = new CSVDecoderFactory();
                break;
            case "Z":
                decoderFactory = new FixedTextDecoderFactory();
                break;
            default:
                throw new RuntimeException("Unknown decoder type: " + type);
        }

        return decoderFactory;
    }
}
