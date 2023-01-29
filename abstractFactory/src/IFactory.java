public interface IFactory {
    IMotherboard CreateMotherboard();

    IProcessor CreateProcessor();
}
