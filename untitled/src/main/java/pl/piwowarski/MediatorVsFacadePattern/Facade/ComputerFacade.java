package pl.piwowarski.MediatorVsFacadePattern.Facade;

class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDrive hardDrive = new HardDrive();

    public void start(){
        cpu.freeze();
        memory.load(0,hardDrive.read(0,1024));
        cpu.execute();
    }
}
