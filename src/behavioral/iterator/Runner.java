package behavioral.iterator;


public class Runner {
    public static void main(String[] args) {
        String[] skills = {"Java Core", "Spring", "Hibernate", "Maven", "Scala"};
        JavaDeveloper developer = new JavaDeveloper("Alexandr Naumov", skills);
        System.out.println("JavaDeveloper : " + developer.getName());
        System.out.print("Skills: ");

        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
