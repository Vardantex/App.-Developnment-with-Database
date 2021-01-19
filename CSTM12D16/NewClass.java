/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM12D16;

/**
 *
 * @author 23805935
 */

import java.sql.Connection;				// interface
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class NewClass {
     static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

    public static void main(String[] args) {
        Connection connection = null; // manages connection
      Statement statement = null; // query statement

      // connect to database books and query database
      try 
      {
         Class.forName(JDBC_DRIVER) ; // load database driver class  *

         // establish connection to database
         connection = 
            DriverManager.getConnection( "jdbc:oracle:thin:@orcl:1521:orcl", "23521467@orcl", "tester");// ("sshahidullah@orcl", "tiger" );
           //DriverManager.getConnection( "jdbc:oracle:thin:@Localhost", "sshahidullah@orcl", "tiger"); // For home

         // create Statement for querying database
         statement = connection.createStatement();
         
         // query database
         ResultSet resultSet = statement.executeQuery( 
              "SELECT * FROM vendors where vendor_ID=\'V01\'" );


         
         // process query results
         ResultSetMetaData metaData = resultSet.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
         System.out.println( "Fancy_Fruits Database:" );

         for ( int i = 1; i <= numberOfColumns; i++ )
            System.out.printf( "%-8s\t", metaData.getColumnName( i ) );
         System.out.println();
         
         while ( resultSet.next() ) 
         {
            for ( int i = 1; i <= numberOfColumns; i++ )
               System.out.printf( "%-8s\t", resultSet.getObject( i ) );
            System.out.println();
         } // end while
      }  // end try
      catch ( SQLException sqlException ) 
      {
         sqlException.printStackTrace();
         System.exit( 1 );
      } // end catch
      catch ( ClassNotFoundException classNotFound ) 
      {
         classNotFound.printStackTrace();            
         System.exit( 1 );
      } // end catch
      finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally
    }
    
    
}