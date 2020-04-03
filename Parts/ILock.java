package Garage.Parts;

public interface ILock extends IParts {
     boolean open(IKey key);
     boolean close(IKey key);
}
