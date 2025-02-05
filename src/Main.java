public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Task 3");
        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName2.replace("ё", "е"));
    }
}