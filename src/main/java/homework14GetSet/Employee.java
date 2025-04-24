package homework14GetSet;

public class Employee {

        private String name;
        private int age;
        private String department;

        public String getName () {
            return name;
        }

        public void setName (String name) {
            this.name = name;
        }


        public int getAge () {
            return age;
        }

        public void setAge ( int age) {
            this.age = age;
        }


        public String getDepartment () {
            return department;
        }

        public void setDepartment (String department) {
            this.department = department;
        }

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Сотрудник:");

        employee.setName("Johnny");
        System.out.println("Имя- " + employee.getName());

employee.setAge(99);
        System.out.println("Возраст- " + employee.getAge());

employee.setDepartment("Office N15");
        System.out.println("Отделение- " + employee.getDepartment());
    }

}
