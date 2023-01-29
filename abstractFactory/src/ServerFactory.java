public class ServerFactory implements IFactory {
    @Override
    public IMotherboard CreateMotherboard() {
        return new ServerMotherboard();
    }

    @Override
    public IProcessor CreateProcessor() {
        return new XeonProcessor();
    }
}
