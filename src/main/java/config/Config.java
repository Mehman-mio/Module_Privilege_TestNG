package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties getPropertyObject() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop;
    }
    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
    public static String getPhoneDirectorCybernet() throws IOException {
        return getPropertyObject().getProperty("loginPhoneDirectorCybernet");
    }
    public static String getIdDirectorCybernet() throws IOException {
        return getPropertyObject().getProperty("loginIdDirectorCybernet");
    }
    public static String getEmployeeFin() throws IOException {
        return getPropertyObject().getProperty("employeeFin");
    }
    public static String getEmployeeIdCardNumber() throws IOException {
        return getPropertyObject().getProperty("employeeIdCardNumber");
    }
    public static String getPhoneDirectorSmartBytes() throws IOException {
        return getPropertyObject().getProperty("loginPhoneDirectorSmartBytes");
    }
    public static String getIdDirectorSmartBytes() throws IOException {
        return getPropertyObject().getProperty("loginIdDirectorSmartBytes");
    }
}