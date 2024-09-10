package week1;

public class Test {
    public static void main(String[] args) {
        EmploymentManageSystem employmentManageSystem = new EmploymentManageSystem();
        employmentManageSystem.addEmployee("A",26);
        employmentManageSystem.addEmployee("B",22);
        employmentManageSystem.addEmployee("C",23);
        employmentManageSystem.deleteEmployee("B");
        //same name but different person with different age
        employmentManageSystem.addEmployee("A",25);
        //same name with same age
        employmentManageSystem.addEmployee("A",26);
        employmentManageSystem.addEmployee("D",22);
        employmentManageSystem.printEmployees();


    }
}
