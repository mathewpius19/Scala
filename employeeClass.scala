object emp{

    def main(args: Array[String]):Unit={

        var empObj1:Employee = Employee("Mathew", "Analyst")
        empObj1.printDetails;
        var empObj2:Employee = Employee("Janelle", "Compliance associate")
        empObj2.printDetails;
    
    }

    class Employee(var name:String, var designation:String){

        var empID = Employee.assignEmpId;

        def printDetails = {println(s"The employee with ${name} and employee id ${empID} has designation ${designation}")
}
    }

    object Employee{

        def apply(name:String, designation:String):Employee={

            new Employee(name,designation);
        }

        //static field and method
        private var newEmpId = 0;
       private def assignEmpId = {newEmpId += 1; newEmpId}
    }
}