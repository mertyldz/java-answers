public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0.0;
        if (this.salary < 1000) {
            tax = 0;
        } else {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0.0;
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise, raisePercent;
        int yearsWorking = 2021 - hireYear;
        if (yearsWorking < 10) {
            raisePercent = 5.0/100.0;
            raise = this.salary * raisePercent;
        } else if (yearsWorking < 20) {
            raisePercent = 10.0/100.0;
            raise = this.salary * raisePercent;
        } else {
            raisePercent = 15.0/100.0;
            raise = this.salary * raisePercent;
        }
        return raise;
    }

    public double salaryWithoutRaise() {
        double midSalary = this.salary + bonus() - tax();
        return midSalary;
    }

    public double salaryCalculate(){
        double finalSalary = this.salary + raiseSalary() + bonus() - tax();
        return finalSalary;
    }

    @Override
    public String toString() {
        return "Adı = " + this.name + '\n' +
                "Maaşı = " + this.salary + "\n" +
                "Çalışma Saati = " + this.workHours + "\n" +
                "Başlangıç Yılı = " + this.hireYear + "\n" +
                "Vergi = " + tax() + "\n" +
                "Bonus = " + bonus() + "\n" +
                "Maaş Artışı = " + raiseSalary() + "\n" +
                "Vergiler ve Bonuslarla Birlikte Maaş = " + salaryWithoutRaise() + "\n" +
                "Toplam Maaş = " + salaryCalculate() + "\n";
    }
}
