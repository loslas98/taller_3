import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class Taller03Test {
    //@Test
    //void editarDatosTest(){
        //Computador compu = new Computador("lenovo","ideapad",new Ram("corsair",8,3600));
        //String input = "hp";
        //InputStream stream = new ByteArrayInputStream(input.getBytes());
        //System.setIn(stream);
        //compu.editardatos();
        //Computador compu2= new Computador("hp","pavillion",new Ram("gskill",16,3666));
        //assertSame(compu,compu2);
    //} No encontre la forma de generar inputs para cada parte del metodo (para cada nextLine() o nextInt()
    @Test

    void ingresarNumerosTest(){
        Computador compu = new Computador();
        String input = "1";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        assertEquals(1,compu.ingresarNumeros());

    }

    @Test

    void elegirOpcionTest(){
        Computador compu = new Computador();
        String input = "2";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        assertEquals(2,compu.elegirOpcion());
    }
    @Test
    void salirTest(){
        Computador compu = new Computador();
        String input = "2";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        assertFalse(compu.salir());

    }

}