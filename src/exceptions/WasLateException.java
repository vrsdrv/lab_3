package exceptions;

public class WasLateException extends RuntimeException {
    public WasLateException(String characterName) {
        super("%s не успел вовремя.".formatted(characterName));
    }
}
