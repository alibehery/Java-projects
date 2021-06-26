
import  joinery.DataFrame;
import tech.tablesaw.api.Table;
import static tech.tablesaw.aggregate.AggregateFunctions.*;

import tech.tablesaw.aggregate.Summarizer;
public class mainpulation_tablesaw_and_joinery {
    
 public static void main(String[] args ){
     try {
            DataFrame<Object> df_employee = DataFrame.readCsv("src/main/resources/data/df_employee.csv");
            DataFrame<Object> df_emp_year = DataFrame.readCsv("src/main/resources/data/df_emp_year.csv");
           System.out.println("The first  data frame : \n"+df_employee);
           System.out.println("The second  data frame : \n"+df_emp_year);
           
           System.in.read();
            
           System.out.println("Result of merging the 2 data frames : \n"+df_employee.merge(df_emp_year));
           
           System.in.read();

           System.out.println("Result of joining the 2 data frames : \n"+ df_employee.join(df_emp_year));
            
           System.in.read();

           System.out.println("Result of joining the 2 data frames on the name : \n"+ df_employee.joinOn(df_emp_year, 0));
                  
           System.in.read();
           
           List<Integer> experience =new ArrayList<>(); 
           

           df_employee.add("experience",Arrays.<Object>asList(2,5,4,7));
           
            System.out.println("After added a new column: \n"+ df_employee);

      
            //df.iterrows().forEachRemaining(System.out::println);
        }catch (Exception e){
            System.out.println("There is an error  "+e);
        }

        
        
        //////////////////////////////////////////////////////////////////////
        
        
       try {
           System.out.println("Now we are using TableSaw libirary ");
        
            System.in.read();
            Table tb_employee = Table.read().csv("src/main/resources/data/df_employee.csv");
            Table tb_emp_year = Table.read().csv("src/main/resources/data/df_emp_year.csv");
            
            
           System.out.println("The first  data frame : \n"+tb_employee);
           System.out.println("The second  data frame : \n"+tb_emp_year);
           
           System.in.read();
            
           System.out.println("Result of joining the 2 data tables on the name  : \n"+tb_employee.joinOn("employee").inner(tb_emp_year ));
           
           System.in.read();
           Double[] ex={2.0,3.,5.0,8.0};
           DoubleColumn Exp=DoubleColumn.create("Experience", ex
           );
          System.out.println("Result of adding  column experience  : \n" + tb_employee.joinOn("employee").inner(tb_emp_year ).addColumns(Exp));
           
            //df.iterrows().forEachRemaining(System.out::println);
        }catch (Exception e){
            System.out.println("There is an error  "+e);
        }
    
    
    
    
    }
    
    
}
