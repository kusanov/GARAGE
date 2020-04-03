package Garage.Parts;

public class Lock implements ILock {
    private boolean open;
    private final String closeKey;

    public Lock(String closeKey) {
        this.closeKey = closeKey;
    }

    @Override
    public boolean open(IKey key) {
        if (closeKey.equals(key.getOpenKey())) {
            open = true;
        }
        return open;
    }

    @Override
    public boolean close(IKey key) {
        if (closeKey.equals(key.getOpenKey())) {
            open = false;
        }
        return !open;
    }
}