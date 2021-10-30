package z20211023_funkcyjne.LAmbdy.InterfejsyFunkcyjne;

import java.util.*;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {


        Function<Employee, String> employeeToStringFunction = (employee -> employee.getNazwisko()); //zamienia employee na stringa
        Function<Employee, Integer> employeeToIntFunction = (employee -> employee.getWiek());
        Function<Employee, Employee> employeeFunction = (employee -> employee);

        List<Employee> employeeList = Arrays.asList(new Employee("nazwisko1", 130), new Employee("nazwisko8", 40), new Employee("nazwisko3", 50));

        Collections.sort(employeeList);
        System.out.println("showEmplyee(employeeList,employeeToStringFunction)");
        showEmplyee(employeeList,employeeToStringFunction);//wypis za pomoca zewn metody //co i po czym sort
        System.out.println("showEmplyee(employeeList,employeeToIntFunction);");
        showEmplyee(employeeList,employeeToIntFunction);//wypis za pomoca zewn metody //co i po czym sort
        System.out.println(" showEmplyee(employeeList,employeeFunction);");
        showEmplyee(employeeList,employeeFunction);//wypis za pomoca zewn metody //co i po czym sort
        //Collections.sort(employeeList);
    }




    static void showEmplyee(List<Employee> employeeList, Function showFunction) { //jak wypisywać np wg nazwisk
        //potem np po imieniu i zamiast pisania kolejnej metody. Nie powtarzamy kodu
        for (Employee emp : employeeList) {
            System.out.println(showFunction.apply(emp));
        }

    }


}
    class Employee implements Comparable{
        String nazwisko;
        int wiek;

        @Override
        public int compareTo(Object o) {
            Employee employee=(Employee) o;
            return Integer.compare(this.wiek, employee.wiek);
        }


        @Override
        public String toString() {
            return "EmployeeFunction -> Employee{" +
                    "nazwisko='" + nazwisko + '\'' +
                    ", wiek=" + wiek +
                    '}';
        }

        public int getWiek() {
            return wiek;
        }

        public Employee(String nazwisko, int wiek) {
            this.nazwisko = nazwisko;
            this.wiek = wiek;
        }

        public String getNazwisko() {
            return nazwisko;
        }
    }

