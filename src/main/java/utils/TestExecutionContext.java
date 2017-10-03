package utils;


public class TestExecutionContext {
    private String environment;

    private String site;

    public TestExecutionContext(String environment, String site){
        this.environment = environment;
        this.site = site;
    }

    public String getSite(){
        return site;
    }

    public String getEnvironment() {
        return environment;
    }


}

