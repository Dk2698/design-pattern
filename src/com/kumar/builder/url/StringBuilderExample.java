package com.kumar.builder.url;

public class StringBuilderExample {
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;

    public StringBuilderExample(String protocol, String hostname, String port, String pathParam, String queryParam) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

    public String buildURL() {
        // StringBuilder is a builder class which helps yoy to concatenate string one after the other
        // and finally returns you a string which ou cannot change
        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol);
        sb.append(this.hostname);
        sb.append(this.port);
        sb.append(this.pathParam);
        sb.append(this.queryParam);

        return sb.toString();
    }
}
// URLBuilder -> used to create URL object given some params
// https://mywebsite:8080/copanies?comanyName=xyz
// essebtial, otional , attribute or field
