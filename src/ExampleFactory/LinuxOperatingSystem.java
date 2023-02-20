package ExampleFactory;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        // linux command
    }

    @Override
    public void removeDir(String dir) {
        // linux command
    }
}
