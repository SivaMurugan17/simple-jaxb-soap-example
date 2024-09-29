package me.siva.java;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        String soapEndpoint = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";
        URL soapUrl = new URI(soapEndpoint).toURL();

        NumberConversion service = new NumberConversion(soapUrl);
        NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
        String result = port.numberToWords(BigInteger.valueOf(17));
        System.out.println(result);
    }
}
