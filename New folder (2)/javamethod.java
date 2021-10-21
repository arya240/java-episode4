public class javamethod{

    public static void main(String[] args){
        manusia("Arya Fikri, " , 21);
        education ("Telkom Purwokerto, " , 7);
        checkAge(21);

    }
     static void manusia(String name, int age){
        System.out.println("nama :" + name + "\n" + "umur :" + age);
    }
    static void education (String kampus, int semester){
        System.out.println("kampus :" + kampus + "\n" + "semester :" + semester );
    }
    static void checkAge(int age) {
        if (age < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
