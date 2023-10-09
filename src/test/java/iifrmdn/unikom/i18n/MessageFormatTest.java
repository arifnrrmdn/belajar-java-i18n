package iifrmdn.unikom.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        var pattern = "Hi {0}, anda bisa mencari data anda dengan mengetik \"{0}\" di pencarian.";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[]{"Qodir"});

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message",locale);

        var pattern = resourceBundle.getString("welcome.message");
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[]{"iifrmdn","UNIKOM"});
        System.out.println(format);
    }

}
