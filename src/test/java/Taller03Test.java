import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class Taller03Test {
    @Test
    void editarDatosTest(){
        Computador compu = new Computador("lenovo","ideapad",new Ram("corsair",8,3600));
        compu.editardatos();
        Computador compu2= new Computador("hp","pavillion",new Ram("gskill",16,3666));
        assertSame(compu,compu2);
    }

    void ingresarNumerosTest(){
        String input = "1";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);

    }

}