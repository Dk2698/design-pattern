package BuilderPattern;

class Demo {
    public static void main(String[] args) {
        URL url = new URL();
        url.setProtocol("http://");
        url.setHostname("mywesite");
        url.setPort(":8080/");
        url.setPathParam("hompage/");
        url.setPathParam("random");

        System.out.print(url.getProtocol());
        System.out.print(url.getHostname());
        System.out.print(url.getPort());
        System.out.print(url.getPathParam()+"\n");


        // URLBuilder
        System.out.println("URBuilder pattern");
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://")
                .hostname("newsite:")
                .port("444");

        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);

        System.out.println("");
        URLBuilder.Builder newbuilder = new URLBuilder.Builder();
        newbuilder.protocol("http://") // return to current object for this method
                .hostname("newsite.com:")
                .pathParam("/abc");

        URLBuilder newurlBuilder = newbuilder.build();

        System.out.print(newurlBuilder.protocol);
        System.out.print(newurlBuilder.hostname);
        System.out.print(newurlBuilder.pathParam);
    }
}
// some parameter field required and option to build constructor
// pros
//Good way to handle complexity
// Easy to implement
// can be refactored into
// cons
// Class instance returned is immutable
// Uses ner static class
// sometimes number of lines of code can be huge
// Have to think of end to end chain

