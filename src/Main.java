import project111.*;

public class Main {
    public static void main(String[] args) {





/*-------------------------------HELPABLE--------------------------------------------------------*/

        System.out.println("HELPABLE - TEACHER");

        HelpAble teacher1 = new Teacher();
        teacher1.firstAid();

        System.out.println();

/*-------------------------------SWIMABLE-------------------------------------------------------*/

        System.out.println("SWIMABLE - TEACHER");

        SwimAble teacher2 = new Teacher();
        teacher2.swim();

        System.out.println();

/*-------------------------------EMPLOYEE-------------------------------------------------------*/

        System.out.println("EMPLOYEE - TEACHER");

        Employee teacher3 = new Teacher();
        teacher3.say();
        teacher3.firstAid();
        teacher3.swim();

        System.out.println();

/*------------------------------TEACHER--------------------------------------------------------*/

        System.out.println("TEACHER - TEACHER");

        Teacher teacher4 = new Teacher();
        teacher4.firstAid();
        teacher4.swim();
        teacher4.say();
        teacher4.teaching();

        System.out.println();

/*-----------------------------------------------------------------------------------------------*/
/*-------------------------------HELPABLE--------------------------------------------------------*/

        System.out.println("HELPABLE - DRIVER");

        HelpAble driver1 = new Driver();
        driver1.firstAid();

        System.out.println();

/*-------------------------------SWIMABLE--------------------------------------------------------*/

        System.out.println("SWIMABLE - DRIVER");

        SwimAble driver2 = new Driver();
        driver2.swim();

        System.out.println();

/*-------------------------------EMPLOYEE--------------------------------------------------------*/

        System.out.println("EMPLOYEE - DRIVER");

        Employee driver3 = new Driver();
        driver3.swim();
        driver3.say();
        driver3.firstAid();

        System.out.println();

/*-------------------------------- EMPLOYEE------------------------------------------------------*/

        System.out.println("DRIVER - DRIVER");

        Driver driver4 = new Driver();
        driver4.driving();
        driver4.say();
        driver4.swim();
        driver4.firstAid();

        System.out.println();

/*------------------------------------------------------------------------------------------------*/













      /***  1. HelpAble (method: void firstAid();), SwimAble (method:
       *  void swim();) деген интерфейтерди тузунуз, методдору менен.
       *
       *
       *
       *
        2. Ал интерфейти implements кылган Employee
        (method: void say();) деген abstract класс болсун, методу м/н.



        3. Абстрак класстты мурастаган
        Teacher ( void teaching();) жана Driver ( void driving();) класстары болсун, методу менен.



        4 Полиморфизм колдонуп 8 турдуу объект тузуп,
       ар бир тузгон объектте бардык методдорду чакырыныз.***/
    }

    public static void getStart(){
        System.out.println("Sport");
    }
    public static String getName(){
        return "Asan";
    }


}