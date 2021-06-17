import  joinery.DataFrame;
import tech.tablesaw.api.Table;
import static tech.tablesaw.aggregate.AggregateFunctions.*;
import tech.tablesaw.aggregate.Summarizer;
public class Titanic_joinery_and_TableSaw {
   


    public static void main (String[] args){
        /*try {
            DataFrame<Object> df = DataFrame.readCsv("src/main/resources/data/titanic.csv");
             System.out.println(df.describe());
             System.out.println("Means :\n "+df.mean());
             System.out.println("Max :\n "+df.max());
             System.out.println("Min :\n "+df.min());
             System.out.println("Standerd Deviation :\n "+df.stddev());

            //df.iterrows().forEachRemaining(System.out::println);
        }catch (Exception e){
            System.out.println("There is an error");
        }
*/
        
        
        //////////////////////////////////////////////////////////////////////
        
         Table titanic  = null;
       try {
           titanic = Table.read().csv("src/main/resources/data/titanic.csv");
           System.out.println(titanic.summary() ) ;
           System.out.println("Mean : \n" +titanic.summarize(titanic.columnNames(), mean).apply()) ;
           System.out.println("Max : \n" +titanic.summarize(titanic.columnNames(), max).apply()) ;
           System.out.println("Min : \n" +titanic.summarize(titanic.columnNames(), min).apply()) ;
           System.out.println("Standard Deviation : \n" +titanic.summarize(titanic.columnNames(),stdDev ).apply()) ;

        }catch (Exception e){
            System.out.println("There is an error");
        }



    }


}
