package com.example.democlient;
 
import org.springframework.web.client.RestTemplate;
 
public class mainMethod {
 
    static final String URL_EMPLOYEES = "http://localhost:8080/hello/api";
 /*
    static final String URL_EMPLOYEES_XML = "http://my-space.cfapps.io/hello/api/employees.xml";
    static final String URL_EMPLOYEES_JSON = "http://localhost:8080/employees.json";*/
 
    public static void main(String[] args) {
 
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with GET method and default Headers.
        System.setProperty("proxyHost", "proxy.cognizant.com"); 
        System.setProperty("proxyPort", "6050");
        String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);
 
        System.out.println(result);
    }
 
}