package streams;



import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String [] args){
        //1. stream source : Collection
//        List<String> nameList = new ArrayList<>();
//
//        nameList.add("India");
//        nameList.add("USA");
//        nameList.add("UK");
//        nameList.add("Japan");
//        System.out.println("List:"+ nameList);
//        //2.create stream
//        //convert all names to upper case
//        nameList.stream().map((s)->s.toUpperCase())
//                .forEach((s)->System.out.println(s));
//        System.out.println("List:"+ nameList);
//        // length of each country name
//        nameList.stream().map((s)->s.length())
//                .forEach((s)->System.out.println(s));
//        // sum of all string len
//        //nameList.clear();
//        Optional<Integer> countOpt = nameList.stream()
//                .map((s)->s.length()).reduce((a, b)->a+b);
//        if(countOpt.isPresent())
//            System.out.println("Total length :"+ countOpt.get());
//       // countOpt.get();
//        // Filter
//        // remove country having name length <= 3
//        nameList.stream().filter((s)->s.length()<=3)
//                .forEach((s)->System.out.println(s));
//        // Collectors
//       List<String> minNameCountry =  nameList.stream()
//               .filter((s)->s.length()<=3)
//               .collect(Collectors.toList());
//       System.out.println("country having len <=3 :"+ minNameCountry);
//
//       //
//        // 3. From given list of Employees find all their names
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(22,"Kumar",55000.0));
//        employeeList.add(new Employee(11,"Ajith",12000.0));
//        employeeList.add(new Employee(55,"Pooja",56000.0));
//        employeeList.add(new Employee(44,"James",11000.0));
//
//        employeeList.stream().map((e)->e.getName()).forEach((s)->System.out.println(s));
//
//        // sum of all employee sal
//       Optional<Double> salarySumOpt =  employeeList.stream()
//               .map((e)->e.getSalary())
//               .reduce((a,b)->a+b);
//        if(salarySumOpt.isPresent())
//            System.out.println("Sum of salary:"+ salarySumOpt.get());
//        else
//            System.out.println("Emp list seems to be empty");
//
//        // sort given list using Streams
//        nameList.stream().sorted().forEach((s)->System.out.println(s));
//        // to sort in natural order of Custom type implement Comparable
//        employeeList.stream().sorted().forEach((s)->System.out.println(s));
//        //Sort emp by salary
//        Comparator<Employee> employeeSalaryComparator = (e1,e2)-> e1.getSalary().compareTo(e2.getSalary());
//
//        employeeList.stream()
//                .sorted(employeeSalaryComparator)
//                .forEach((s)->System.out.println(s));
//
//        // Get 2 empl having least salary
//        System.out.println("2 emp having min salary");
//        employeeList.stream()
//                .sorted(employeeSalaryComparator).limit(2)
//                .forEach((s)->System.out.println(s));
//        // skip
//        Integer emmCount = employeeList.size();
//        System.out.println("emp having highest salary");
//        employeeList.stream()
//                .sorted(employeeSalaryComparator).skip(emmCount-1)
//                .forEach((s)->System.out.println(s));
//        // Max
//        Optional<Employee> empHavingHighestSalOpt = employeeList.stream()
//                .max(employeeSalaryComparator);
//        if(empHavingHighestSalOpt.isPresent())
//            System.out.println("Emp having highest sal:"+empHavingHighestSalOpt.get());
//
//        // Min
//        Optional<Employee> empHavingminSalOpt = employeeList.stream()
//                .min(employeeSalaryComparator);
//        if(empHavingHighestSalOpt.isPresent())
//            System.out.println("Emp having min sal:"+empHavingminSalOpt.get());

        List<Integer> l1 = Arrays.asList(1,4,8);
        List<Integer> l2 = Arrays.asList(11,14,18);
        List<Integer> l3 = Arrays.asList(21,24,28);

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(l1);
        listOfList.add(l2);
        listOfList.add(l3);
        listOfList.stream().forEach((li)->System.out.println(li));

        listOfList.stream().flatMap((l)->l.stream()
                ).forEach((li)->System.out.println(li));
        System.out.println("Limit sub list elements to 2");
        List<Integer> singleList = listOfList.stream().flatMap((l)->l.stream().limit(2)
        ).collect(Collectors.toList());
        System.out.println("Single list :"+singleList);




    }

}
