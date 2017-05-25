package factory;


public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =getDeveloperFactiryByName("Python");
        developerFactory.createDeveloper().writeCode();
    }

    private static DeveloperFactory getDeveloperFactiryByName(String devLanguage){
        if (devLanguage == "Java") {
            return new JavaDeveloperFactory();
        } else if (devLanguage == "C++") {
            return new CppDeveloperFactory();
        } else if (devLanguage == "Php") {
            return new PhpDeveloperFactory();
        }
        else{
            System.out.println("language not find!");
            throw new RuntimeException();
        }
    }
}
