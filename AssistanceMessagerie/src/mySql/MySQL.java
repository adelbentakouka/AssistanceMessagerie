package mySql;
 
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author Kanak
 */
public class MySQL {
    public Connection con;
    public Statement s;
    private String username = "root";
    private String password = "root";
    private String database = "assistancemessagerie";
    
 
        public static DefaultTableModel buildTableModel(ResultSet rs){
            try{
                ResultSetMetaData metaData = rs.getMetaData();
                Vector<String> columnNames = new Vector<String>();
                int columnCount = metaData.getColumnCount();
                for (int column = 1; column <= columnCount; column++) {
                    columnNames.add(metaData.getColumnName(column));
                }
                Vector<Vector<Object>> data = new Vector<Vector<Object>>();
                while (rs.next()) {
                    Vector<Object> vector = new Vector<Object>();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        vector.add(rs.getObject(columnIndex));
                    }
                    data.add(vector);
                }
                return new DefaultTableModel(data, columnNames);
            }catch(Exception e){
                return null;
            }
        }
         
    public ResultSet open(String query)
    {
            System.out.println(query);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load Driver
             
            /*
             * PLEASE NOTE
             * CHANGE DATABASE, USERNAME AND PASSWORD
             * FROM THE BELOW LINE
             */
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/"+database+"?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",username,password);
            s = con.createStatement(); // Create Statement
            s.execute(query); // Execute Query
            ResultSet rs = s.getResultSet(); // return the data from Statement
                        if(rs==null) {
                            s.execute("SELECT CURRENT_TIME;");
                            rs = s.getResultSet();
                        }// into ResultSet
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Exception in Database", 2);
            return null;
        }
    }
 
    public void close() {
        try {
            con.close();
            s.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Exception in Database", 2);
        }
    }
}