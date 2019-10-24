package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.rules.ExternalResource;

public class SysOutResource extends ExternalResource {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Override
    protected void before() {
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void after() {
        System.setOut(System.out);
    }

    public String asString() {
        return outContent.toString();
    }
}
