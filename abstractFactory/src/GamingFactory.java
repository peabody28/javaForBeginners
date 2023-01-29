public class GamingFactory implements IFactory{
    @Override
    public IMotherboard CreateMotherboard() {
        return new AM4Motherboard();
    }

    @Override
    public IProcessor CreateProcessor() {
        return new RyzenProcessor();
    }
}
