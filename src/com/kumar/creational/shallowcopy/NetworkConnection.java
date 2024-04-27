package com.kumar.creational.shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void loadVeryImportData() throws InterruptedException {
        this.importantData = "Very very important data";

        domains.add("www.kumar.com");
        domains.add("www.kumar.co.in");
        domains.add("www.kumar.in");

        Thread.sleep(5000);
    }

    @Override
    public NetworkConnection clone() {
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        // logic for cloning
        final NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String domain : this.getDomains()) {
            networkConnection.getDomains().add(domain);
        }

//            return (NetworkConnection) super.clone();
        return networkConnection;
    }
}
