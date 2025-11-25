package br.com.trilhajava.linguagemjava.datas;

/**
 *
 * @author Gilvan
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

    private static final SimpleDateFormat SDF =
            new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static Date parse(String texto) throws ParseException {
        return SDF.parse(texto);
    }

    public static String format(Date data) {
        return SDF.format(data);
    }
}
