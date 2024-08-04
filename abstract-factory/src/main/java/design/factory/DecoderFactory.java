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

    public static DecoderFactory getFactory(String type){
        switch (type){
            case "X": return new XMLDecoderFactory();
            case "Y": return new CSVDecoderFactory();
            case "Z": return new FixedTextDecoderFactory();
        }
    }
}
