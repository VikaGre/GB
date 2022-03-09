public class StaffMember {

    public String NameSurnamePatronymic;
    public String position;
    public String email;
    public long phone;
    public int salary;
    public int age;

    public StaffMember() {    //constructor
        NameSurnamePatronymic = "Ivan Ivanov Ivanovich";
        position = "director";
        email = "ivan@mail.ru";
        phone = 89998887766L;
        salary = 300000;
        age = 50;
    }

    public StaffMember(String NameSurnamePatronymic, String position, String email, long phone, int salary, int age) {  //parameter's constructor
        this.NameSurnamePatronymic = NameSurnamePatronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        StaffMember sm1 = new StaffMember();
        System.out.println("The name is: " + sm1.NameSurnamePatronymic + '\n' + "The position is: " + sm1.position + '\n' +
                "The email is: " + sm1.email + '\n' + "The phone is: " + sm1.phone + '\n' +
                "The salary is: " + sm1.salary + '\n' + "The age is: " + sm1.age);

        System.out.println();

        //task 2
        StaffMember sm2 = new StaffMember("Alex Sorokin Alexandrovich", "programmer",
                "alex@email.ru", 89991112233L, 100000, 20);
        System.out.println("The name is: " + sm2.NameSurnamePatronymic + '\n' + "The position is: " + sm2.position + '\n' +
                "The email is: " + sm2.email + '\n' + "The phone is: " + sm2.phone + '\n' +
                "The salary is: " + sm2.salary + '\n' + "The age is: " + sm2.age);

        System.out.println();

        StaffMember[] persArray = new StaffMember[5];

        persArray[0] = new StaffMember("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", 892312312L, 30000, 30);
        persArray[1] = new StaffMember("Kolya Kolyan", "Accountant",
                "kolya@mailbox.com", 89278884358L, 35000, 41);
        persArray[2] = new StaffMember("Anastasia Ivanova", "financier",
                "anastasia@mailbox.com", 89222227898L, 40000, 27);
        persArray[3] = new StaffMember("Vika Vika", "programer",
                "vika@mailbox.com", 89774446565L, 50000, 60);
        persArray[4] = new StaffMember("Sherlock Holmes ", "Manager",
                "sherlock@mailbox.com", 89659654747L, 65000, 40);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println("The name is: " + persArray[i].NameSurnamePatronymic + '\n' + "The position is: " + persArray[i].position + '\n' +
                        "The email is: " + persArray[i].email + '\n' + "The phone is: " + persArray[i].phone + '\n' +
                        "The salary is: " + persArray[i].salary + '\n' + "The age is: " + persArray[i].age);
                System.out.println();
            }
        }
    }
}
