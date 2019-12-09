package be.kapture.intixtest;

import org.junit.jupiter.api.*;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class FileReaderFunctionsTest {


    @Test
    void fileReader_init(){
        FileReaderFunctions functions = new FileReaderFunctions("src/test/resources/testdata.txt");
        functions.readLines();
        assertThat(functions.getOutput()).isEqualTo("TestTestTest");
    }

    @Test
    void fileReader_addToLines(){
        FileReaderFunctions functions = new FileReaderFunctions("src/test/resources/testdata.txt");
        functions.addLines("bier\nbier");
        assertThat(functions.getOutput()).isEqualTo("TestTestTestbierbier");
    }
}
