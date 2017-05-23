package automation.stepdef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;

public class DataTableStepDef {

    @Given("^read data from table and use it$")
    public void read_data_from_table_and_use_it(DataTable arg1) throws Throwable {

        System.out.println("hello");
        List<List<String>> table1 = arg1.raw();
        System.out.println(table1.get(0).get(0));
        System.out.println(table1.get(0).get(1));

        System.out.println(table1.get(1).get(0));
        System.out.println(table1.get(1).get(1));
        System.out.println(table1.get(2).get(0));
        System.out.println(table1.get(2).get(1));
        System.out.println(table1.get(3).get(0));
        System.out.println(table1.get(3).get(1));

    }
}
