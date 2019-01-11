import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
 
import mySql.MySQL;
 
public class Demo {
    static MySQL sqlObj = new MySQL();
    public static void main(String[] args) {
         
        //Display result by fetching data from database
        ResultSet rs = sqlObj.open("SELECT * FROM user");
        try{
            while(rs.next()){
                System.out.println(rs.getString("username")+" "+
                        rs.getString("password"));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
         
         
    /*    //if you have any jTable and need to pass result to it, use below syntax
        JTable jTable1 = new JTable();
        jTable1.setModel(MySQL.buildTableModel(rs));
         
         
        // to insert new row, use :
        //NOTE: this will automatically show up error message on failure and will return null
        sqlObj.open("INSERT INTO table VALUES(value1, value2, value3)");
  */  }
}